package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = 
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SamuraiDynastyMod.MOD_ID);

    @SuppressWarnings("unused")
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_TABS.register(
            SamuraiDynastyMod.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + SamuraiDynastyMod.MOD_ID))
                    .icon(() -> new ItemStack(ItemsRegistry.RED_SAMURAI_HELMET.get()))
                    .displayItems((displayParameters, output) -> {
                        // Add all items from the mod
                        ItemsRegistry.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        
                        // TODO: Re-enable when compat mods are available for 1.21.4
                        /*
                        if (ModList.get().isLoaded("create"))
                            CreateCompat.CREATE_ITEMS.getEntries().forEach(item -> output.accept(item.get()));

                        if (ModList.get().isLoaded("deeperdarker"))
                            DeeperDarkerCompat.DEEPERDARKER_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof SamuraiArmorItem)
                                    output.accept(item.get());
                            });

                        if (ModList.get().isLoaded("ars_nouveau"))
                            ArsNouveauCompat.ARSN_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof MageSamuraiArmorItem)
                                    output.accept(item.get());
                            });

                        if (ModList.get().isLoaded("eldritch_end"))
                            EldritchEndCompat.ELDRITCH_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof EtyriteSamuraiArmorItem)
                                    output.accept(item.get());
                            });

                        if (ModList.get().isLoaded("aquaculture"))
                            AquacultureCompat.AQUA_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof SamuraiArmorItem)
                                    output.accept(item.get());
                            });

                        if (ModList.get().isLoaded("bloodmagic"))
                            BloodMagicCompat.BLOOD_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof SamuraiArmorItem)
                                    output.accept(item.get());
                            });

                        if (ModList.get().isLoaded("forbidden_arcanus"))
                            ForbiddenCompat.FA_ITEMS.getEntries().forEach(item -> {
                                if (item.get() instanceof SamuraiArmorItem)
                                    output.accept(item.get());
                            });
                        */
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
