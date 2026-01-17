package net.veroxuniverse.samurai_dynasty.client.armors;

import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

/**
 * Registers all armor renderers for Samurai Dynasty mod using AzureLib 3.2.0
 */
public class ArmorRendererRegistry {
    
    public static void registerAll() {
        // Iron Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::ironSamurai,
                ItemsRegistry.IRON_SAMURAI_HELMET.get(),
                ItemsRegistry.IRON_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.IRON_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.IRON_SAMURAI_BOOTS.get()
        );
        
        // Gold Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::goldSamurai,
                ItemsRegistry.GOLD_SAMURAI_HELMET.get(),
                ItemsRegistry.GOLD_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.GOLD_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.GOLD_SAMURAI_BOOTS.get()
        );
        
        // Diamond Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::diamondSamurai,
                ItemsRegistry.DIAMOND_SAMURAI_HELMET.get(),
                ItemsRegistry.DIAMOND_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.DIAMOND_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.DIAMOND_SAMURAI_BOOTS.get()
        );
        
        // Red Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::redSamurai,
                ItemsRegistry.RED_SAMURAI_HELMET.get(),
                ItemsRegistry.RED_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.RED_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.RED_SAMURAI_BOOTS.get()
        );
        
        // Ninja Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::ironNinja,
                ItemsRegistry.IRON_NINJA_HELMET.get(),
                ItemsRegistry.IRON_NINJA_CHESTPLATE.get(),
                ItemsRegistry.IRON_NINJA_BOOTS.get(),
                ItemsRegistry.NINJA_LEGGINGS.get()
        );
        
        // Special
        AzArmorRendererRegistry.register(ItemsRegistry.STRAW_HAT.get(), SamuraiArmorRenderer::strawHat);
        AzArmorRendererRegistry.register(ItemsRegistry.KIMONO.get(), SamuraiArmorRenderer::kimono);
    }
}
