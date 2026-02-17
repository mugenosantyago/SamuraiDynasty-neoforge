package net.veroxuniverse.samurai_dynasty.client;

import net.minecraft.world.entity.LivingEntity;

import javax.annotation.Nullable;

/**
 * Holds the current living entity being rendered (set by mixin).
 * Used so RenderLivingEvent handlers can get the entity in 1.21.8 where the event only exposes render state.
 */
public final class CurrentRenderingEntity {
    private static final ThreadLocal<LivingEntity> CURRENT = new ThreadLocal<>();

    /** Set by EntityRenderDispatcherMixin. Do not call from mod code. */
    public static void set(@Nullable LivingEntity entity) {
        if (entity != null) {
            CURRENT.set(entity);
        }
    }

    /** Cleared by EntityRenderDispatcherMixin. Do not call from mod code. */
    public static void clear() {
        CURRENT.remove();
    }

    /** Get the living entity currently being rendered, or null. */
    @Nullable
    public static LivingEntity get() {
        return CURRENT.get();
    }
}
