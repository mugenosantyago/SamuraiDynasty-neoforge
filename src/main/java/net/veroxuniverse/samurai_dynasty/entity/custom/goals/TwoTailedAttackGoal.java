package net.veroxuniverse.samurai_dynasty.entity.custom.goals;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.veroxuniverse.samurai_dynasty.entity.custom.TwoTailedFox;

/**
 * Simplified attack goal for TwoTailedFox entity in 1.21.4.
 * Uses vanilla MeleeAttackGoal behavior with entity state tracking.
 */
public class TwoTailedAttackGoal extends MeleeAttackGoal {
    private final TwoTailedFox entity;

    public TwoTailedAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        entity = ((TwoTailedFox) pMob);
    }

    @Override
    public void start() {
        super.start();
        entity.setAttacking(true);
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}
