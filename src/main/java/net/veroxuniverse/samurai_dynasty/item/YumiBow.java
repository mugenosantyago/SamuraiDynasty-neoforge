package net.veroxuniverse.samurai_dynasty.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Yumi (Japanese long bow). Ported from 1.21.x.
 * Fires arrows with higher velocity than a normal bow.
 */
public class YumiBow extends BowItem {

    private static final float VELOCITY_MULTIPLIER = 4.0F;

    public YumiBow(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving, int pTimeLeft) {
        if (pEntityLiving instanceof Player player) {
            ItemStack projectileStack = player.getProjectile(pStack);
            if (!projectileStack.isEmpty()) {
                int charge = this.getUseDuration(pStack, pEntityLiving) - pTimeLeft;
                charge = net.neoforged.neoforge.event.EventHooks.onArrowLoose(pStack, pLevel, player, charge, !projectileStack.isEmpty());
                if (charge < 0) return;
                float power = getPowerForTime(charge);
                if (!((double) power < 0.1)) {
                    List<ItemStack> list = draw(pStack, projectileStack, player);
                    if (pLevel instanceof ServerLevel serverLevel && !list.isEmpty()) {
                        shoot(serverLevel, player, player.getUsedItemHand(), pStack, list, power * VELOCITY_MULTIPLIER, 1.0F, power == 1.0F, null);
                    }
                    pLevel.playSound(
                            null,
                            player.getX(),
                            player.getY(),
                            player.getZ(),
                            SoundEvents.ARROW_SHOOT,
                            SoundSource.PLAYERS,
                            1.0F,
                            1.0F / (pLevel.getRandom().nextFloat() * 0.4F + 1.2F) + power * 0.5F
                    );
                    player.awardStat(Stats.ITEM_USED.get(this));
                }
            }
        }
    }

    @Override
    protected void shootProjectile(
            LivingEntity shooter,
            Projectile projectile,
            int index,
            float velocity,
            float inaccuracy,
            float angleOffset,
            @Nullable LivingEntity target
    ) {
        projectile.shootFromRotation(shooter, shooter.getXRot(), shooter.getYRot() + angleOffset, 0.0F, velocity, inaccuracy);
    }

    public static float getPowerForTime(int charge) {
        float f = (float) charge / 16.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }
        return f;
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity pLivingEntity) {
        return 72000;
    }

    @Override
    public int getDefaultProjectileRange() {
        return 25;
    }
}
