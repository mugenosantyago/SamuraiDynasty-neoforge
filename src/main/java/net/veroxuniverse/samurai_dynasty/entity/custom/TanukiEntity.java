package net.veroxuniverse.samurai_dynasty.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import org.jetbrains.annotations.Nullable;

public class TanukiEntity extends TamableAnimal {

    private static final EntityDataAccessor<Integer> HEALING =
            SynchedEntityData.defineId(TanukiEntity.class, EntityDataSerializers.INT);

    private int healTimer;
    private final int coolDownTime = 1200;

    public TanukiEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
        this.setTame(false, false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return TamableAnimal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.FOLLOW_RANGE, 25D)
                .add(Attributes.ATTACK_DAMAGE, 3.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.TEMPT_RANGE, 10.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(0, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.2D, Ingredient.of(Items.POTION), true));
        this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1.2F, 8.0F, 2.0F));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.2F));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(HEALING, 1200);
    }

    // Note: NBT persistence removed due to 1.21.8 API changes

    public void setHealCooldown(int healing) {
        this.entityData.set(HEALING, healing);
    }

    public int getHealCooldown() {
        return this.entityData.get(HEALING);
    }

    @Override
    public void tick() {
        if (getHealCooldown() > coolDownTime + 1) {
            setHealCooldown(coolDownTime + 1);
        }

        if (getHealCooldown() <= coolDownTime) {
            healTimer = getHealCooldown();
            healTimer++;
            setHealCooldown(healTimer);
        }

        if (getHealCooldown() == coolDownTime) {
            Player owner = (Player) this.getOwner();
            if (this.getOwner() != null) {
                this.playSound(SoundEvents.ENCHANTMENT_TABLE_USE, 100, 2);
                if (owner instanceof ServerPlayer player) {
                    player.displayClientMessage(Component.literal("\u00A7a\u00A7lHeal\u00A77 is ready!"), true);
                }
            }
        }
        super.tick();
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        Item itemForTaming = Items.POTION;

        if (item == itemForTaming && !isTame()) {
            if (this.level().isClientSide()) {
                return InteractionResult.CONSUME;
            } else {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }

                this.tame(player);
                this.navigation.recomputePath();
                this.setTarget(null);
                this.level().broadcastEntityEvent(this, (byte) 7);
                setOrderedToSit(true);
                this.setInSittingPose(true);

                return InteractionResult.SUCCESS;
            }
        }

        if (isTame() && hand == InteractionHand.MAIN_HAND && !player.isShiftKeyDown() && !isFood(itemstack)) {
            setOrderedToSit(!isOrderedToSit());
            setInSittingPose(!isOrderedToSit());
            return InteractionResult.SUCCESS;
        }

        if (isTame() && hand == InteractionHand.MAIN_HAND && player.isShiftKeyDown() && !isFood(itemstack)) {
            if (getHealCooldown() >= coolDownTime) {
                setHealCooldown(0);
                healTimer = 0;
                player.playSound(SoundEvents.BREWING_STAND_BREW, 100, 1);
                if (player instanceof ServerPlayer serverPlayer) {
                    serverPlayer.addEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1, 2, false, false, false));
                    serverPlayer.displayClientMessage(Component.literal("\u00A7e" + (coolDownTime / 20) + " \u00A77seconds left!"), true);
                }
            } else {
                player.playSound(SoundEvents.VILLAGER_NO, 100, 1.6f);
                if (player instanceof ServerPlayer serverPlayer) {
                    serverPlayer.displayClientMessage(Component.literal("\u00A7e" + ((coolDownTime - healTimer) / 20) + " \u00A77seconds left!"), true);
                }
            }
            return InteractionResult.SUCCESS;
        }

        return super.mobInteract(player, hand);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.WHEAT);
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState block) {
        this.playSound(SoundEvents.GENERIC_SMALL_FALL, 0.15F, 1.0F);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.FOX_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.FOX_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.FOX_DEATH;
    }

    @Override
    protected float getSoundVolume() {
        return 0.2F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntityTypes.TANUKI.get().create(level, EntitySpawnReason.BREEDING);
    }
}
