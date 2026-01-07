package net.veroxuniverse.samurai_dynasty.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ThrownShurikenEntity extends AbstractArrow {

    private static final EntityDataAccessor<Boolean> ID_FOIL = SynchedEntityData.defineId(ThrownShurikenEntity.class, EntityDataSerializers.BOOLEAN);
    private @NotNull ItemStack shurikenItem = new ItemStack(ItemsRegistry.SHURIKEN.get());
    private boolean dealtDamage;
    private float playerYaw;
    private float playerPitch;

    private static final float SHURIKEN_DAMAGE = 6;

    public ThrownShurikenEntity(EntityType<? extends ThrownShurikenEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownShurikenEntity(Level level, LivingEntity shooter, ItemStack stack) {
        super(ModEntityTypes.SHURIKEN.get(), shooter, level, stack, null);
        this.shurikenItem = stack.copy();
        this.entityData.set(ID_FOIL, stack.hasFoil());
        this.setOwner(shooter);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(ID_FOIL, false);
    }

    @Override
    public void tick() {
        if (this.inGroundTime > 4) {
            this.dealtDamage = true;
        }
        super.tick();

        double dx = this.getDeltaMovement().x();
        double dy = this.getDeltaMovement().y();
        double dz = this.getDeltaMovement().z();

        float horizontalDistance = Mth.sqrt((float) (dx * dx + dz * dz));
        this.setYRot((float) (Mth.atan2(dx, dz) * (180F / Math.PI)));
        this.setXRot((float) (Mth.atan2(dy, horizontalDistance) * (180F / Math.PI)));
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ItemsRegistry.SHURIKEN.get().asItem());
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ItemsRegistry.SHURIKEN.get().asItem());
    }

    public boolean isFoil() {
        return this.entityData.get(ID_FOIL);
    }

    @Nullable
    @Override
    protected EntityHitResult findHitEntity(Vec3 startVec, Vec3 endVec) {
        return this.dealtDamage ? null : super.findHitEntity(startVec, endVec);
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult result) {
        super.onHitEntity(result);
        Entity entity = result.getEntity();
        entity.hurt(entity.damageSources().thrown(this, this.getOwner()), SHURIKEN_DAMAGE);
    }

    @Override
    protected boolean tryPickup(Player player) {
        return super.tryPickup(player) || this.isNoPhysics() && this.ownedBy(player) && player.getInventory().add(this.getPickupItem());
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.TRIDENT_HIT_GROUND;
    }

    @Override
    public void playerTouch(Player entity) {
        if (this.ownedBy(entity) || this.getOwner() == null) {
            super.playerTouch(entity);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        if (compound.contains("Shuriken", 10)) {
            this.shurikenItem = ItemStack.parseOptional(this.registryAccess(), compound.getCompound("Shuriken"));
        }
        this.dealtDamage = compound.getBoolean("DealtDamage");
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.put("Shuriken", this.shurikenItem.save(this.registryAccess()));
        compound.putBoolean("DealtDamage", this.dealtDamage);
    }

    @Override
    protected void tickDespawn() {
        if (this.pickup != AbstractArrow.Pickup.ALLOWED) {
            super.tickDespawn();
        }
    }

    @Override
    public void shootFromRotation(Entity shooter, float x, float y, float z, float velocity, float inaccuracy) {
        super.shootFromRotation(shooter, x, y, z, velocity, inaccuracy);
        this.playerYaw = shooter.getYHeadRot();
        this.playerPitch = shooter.getXRot();
    }

    @Override
    public boolean shouldRender(double x, double y, double z) {
        return true;
    }
}
