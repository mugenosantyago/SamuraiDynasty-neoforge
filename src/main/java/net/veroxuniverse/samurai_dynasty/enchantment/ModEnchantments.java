package net.veroxuniverse.samurai_dynasty.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.IEventBus;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

// In 1.21+, enchantments are data-driven and defined via JSON files
// See: data/samurai_dynasty/enchantment/returning_blade.json
public class ModEnchantments {

    // Resource keys for custom enchantments (defined in data files)
    public static final ResourceKey<Enchantment> RETURNING_BLADE = ResourceKey.create(
            Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "returning_blade")
    );

    public static void register(IEventBus eventBus) {
        // Enchantments are now data-driven, no code registration needed
        // Define enchantments in: data/samurai_dynasty/enchantment/
    }
}
