package net.veroxuniverse.samurai_dynasty.entity.custom;

import com.google.common.base.MoreObjects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.registry.ParticlesInit;
import org.jetbrains.annotations.NotNull;

public class KitsuneProjectileEntity extends AbstractHurtingProjectile {

    public KitsuneProjectileEntity(EntityType<? extends AbstractHurtingProjectile> entityType, Level level) {
        super(entityType, level);
        this.noPhysics = true;
    }

    public KitsuneProjectileEntity(Level level, double x, double y, double z, double dx, double dy, double dz) {
        super(ModEntityTypes.KITSUNE_PROJECTILE.get(), x, y, z, new Vec3(dx, dy, dz), level);
        this.noPhysics = true;
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        if (!this.level().isClientSide) {
            Entity entity = result.getEntity();
            Entity owner = this.getOwner();
            LivingEntity livingentity = owner instanceof LivingEntity ? (LivingEntity) owner : null;
            
            // Apply damage
            entity.hurt(damageSources().mobProjectile(this, livingentity), 4.0F);
            
            // Apply effects
            if (entity instanceof LivingEntity livingTarget) {
                livingTarget.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 100, 4), MoreObjects.firstNonNull(owner, this));
                livingTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 0), MoreObjects.firstNonNull(owner, this));
            }
        }
    }

    @Override
    protected void onHitBlock(@NotNull BlockHitResult result) {
        super.onHitBlock(result);
        BlockPos blockpos = result.getBlockPos().relative(result.getDirection());
        OnibiEntity spawnOnibi = ModEntityTypes.ONIBI.get().create(level(), EntitySpawnReason.MOB_SUMMONED);
        double random = Math.random();
        if (this.level().isEmptyBlock(blockpos)) {
            if (random <= 0.5) {
                if (spawnOnibi != null) {
                    spawnOnibi.setPos(Vec3.atCenterOf(blockpos));
                    level().addFreshEntity(spawnOnibi);
                }
            }
        }
        if (!this.level().isClientSide) {
            this.playSound(SoundEvents.SHULKER_BULLET_HIT, 1.0F, 1.0F);
        }
    }

    @Override
    protected void onHit(@NotNull HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.discard();
        }
    }

    @Override
    public float getLightLevelDependentMagicValue() {
        return 1.0F;
    }

    @Override
    protected boolean shouldBurn() {
        return false;
    }

    @Override
    protected @NotNull ParticleOptions getTrailParticle() {
        return ParticlesInit.BLUE_FLAME.get();
    }

    @Override
    public boolean isPickable() {
        return false;
    }

    @Override
    public boolean hurtServer(@NotNull ServerLevel level, @NotNull DamageSource source, float amount) {
        return false;
    }
}
