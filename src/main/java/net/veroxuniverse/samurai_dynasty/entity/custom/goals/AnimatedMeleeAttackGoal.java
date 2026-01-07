package net.veroxuniverse.samurai_dynasty.entity.custom.goals;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

import java.util.function.BiConsumer;

/**
 * Simplified melee attack goal for 1.21.4 compatibility.
 * Custom animation callbacks are stubbed out pending AzureLib update.
 */
public class AnimatedMeleeAttackGoal<T extends PathfinderMob> extends MeleeAttackGoal {
    private final T mob;
    private final BiConsumer<T, LivingEntity> animationCallback;

    public AnimatedMeleeAttackGoal(T mob, double speedModifier, boolean followEvenIfNotSeen, BiConsumer<T, LivingEntity> animationCallback) {
        super(mob, speedModifier, followEvenIfNotSeen);
        this.mob = mob;
        this.animationCallback = animationCallback;
    }

    // In 1.21.4, the attack logic is handled by the parent MeleeAttackGoal
    // Custom animation callbacks would need to be triggered via other means
}
