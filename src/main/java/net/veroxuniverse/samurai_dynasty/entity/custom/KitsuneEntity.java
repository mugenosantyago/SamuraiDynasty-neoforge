package net.veroxuniverse.samurai_dynasty.entity.custom;

import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.PathType;
import net.veroxuniverse.samurai_dynasty.entity.variant.KitsuneVariant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class KitsuneEntity extends Monster {

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(KitsuneEntity.class, EntityDataSerializers.INT);

    public KitsuneEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
        this.setPathfindingMalus(PathType.POWDER_SNOW, -1.0F);
        this.setPathfindingMalus(PathType.DANGER_POWDER_SNOW, -1.0F);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 100.0D)
                .add(Attributes.ATTACK_DAMAGE, 8.0f)
                .add(Attributes.ATTACK_SPEED, 0.3f)
                .add(Attributes.FOLLOW_RANGE, 25.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3F);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_ID_TYPE_VARIANT, 0);
    }

    public KitsuneVariant getVariant() {
        return KitsuneVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(KitsuneVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, EntitySpawnReason reason,
                                        @Nullable SpawnGroupData spawnData) {
        KitsuneVariant variant = Util.getRandom(KitsuneVariant.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(level, difficulty, reason, spawnData);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound, HolderLookup.Provider registries) {
        super.readAdditionalSaveData(compound, registries);
        compound.getInt("Variant").ifPresent(value -> this.entityData.set(DATA_ID_TYPE_VARIANT, value));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound, HolderLookup.Provider registries) {
        super.addAdditionalSaveData(compound, registries);
        compound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public boolean doHurtTarget(@NotNull ServerLevel level, @NotNull Entity entity) {
        if (!(entity instanceof LivingEntity target)) {
            return false;
        }
        
        this.playSound(SoundEvents.FOX_BITE, 1.0F, 0.4F);
        
        float baseDamage = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
        float damage;
        if ((int) baseDamage > 0) {
            damage = baseDamage / 2.0F + (float) this.random.nextInt((int) baseDamage);
        } else {
            damage = baseDamage;
        }

        DamageSource damageSource = this.damageSources().mobAttack(this);
        boolean success = target.hurtServer(level, damageSource, damage);
        
        if (success) {
            // Apply knockback
            double knockback = this.getAttributeValue(Attributes.ATTACK_KNOCKBACK);
            if (knockback > 0) {
                target.knockback(knockback * 0.5F, 
                        Math.sin(this.getYRot() * ((float)Math.PI / 180F)),
                        -Math.cos(this.getYRot() * ((float)Math.PI / 180F)));
            }
        }

        return success;
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 6;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.FOX_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return SoundEvents.FOX_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.FOX_DEATH;
    }

    @Override
    protected float getSoundVolume() {
        return 0.5F;
    }

    @Override
    public float getVoicePitch() {
        return 0.5F;
    }
}
