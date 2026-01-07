package net.veroxuniverse.samurai_dynasty.sound;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

public class ESSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, SamuraiDynastyMod.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> GUN_RELOAD = registerSoundEvents("gun_reload");
    public static final DeferredHolder<SoundEvent, SoundEvent> GUN_RELOAD_DROP = registerSoundEvents("gun_reload_drop");
    public static final DeferredHolder<SoundEvent, SoundEvent> GUN_SHOOT = registerSoundEvents("gun_shoot");
    public static final DeferredHolder<SoundEvent, SoundEvent> GUN_HIT = registerSoundEvents("gun_hit");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
