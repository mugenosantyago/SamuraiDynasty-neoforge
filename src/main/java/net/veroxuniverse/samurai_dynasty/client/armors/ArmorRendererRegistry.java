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
        
        // Masks
        AzArmorRendererRegistry.register(ItemsRegistry.ONI_MASK.get(), SamuraiArmorRenderer::oniMask);
        AzArmorRendererRegistry.register(ItemsRegistry.KITSUNE_MASK.get(), SamuraiArmorRenderer::kitsuneMask);
        
        // Netherite Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::netheriteSamurai,
                ItemsRegistry.NETHERITE_SAMURAI_HELMET.get(),
                ItemsRegistry.NETHERITE_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.NETHERITE_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.NETHERITE_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::netheriteSamuraiLight,
                ItemsRegistry.NETHERITE_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.NETHERITE_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.NETHERITE_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.NETHERITE_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::netheriteSamuraiMaster,
                ItemsRegistry.NETHERITE_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.NETHERITE_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.NETHERITE_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.NETHERITE_SAMURAI_BOOTS_MASTER.get()
        );
        
        // Blue Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::blueSamurai,
                ItemsRegistry.BLUE_SAMURAI_HELMET.get(),
                ItemsRegistry.BLUE_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.BLUE_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.BLUE_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::blueSamuraiLight,
                ItemsRegistry.BLUE_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.BLUE_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.BLUE_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.BLUE_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::blueSamuraiMaster,
                ItemsRegistry.BLUE_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.BLUE_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.BLUE_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.BLUE_SAMURAI_BOOTS_MASTER.get()
        );
        
        // Green Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::greenSamurai,
                ItemsRegistry.GREEN_SAMURAI_HELMET.get(),
                ItemsRegistry.GREEN_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.GREEN_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.GREEN_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::greenSamuraiLight,
                ItemsRegistry.GREEN_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.GREEN_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.GREEN_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.GREEN_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::greenSamuraiMaster,
                ItemsRegistry.GREEN_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.GREEN_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.GREEN_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.GREEN_SAMURAI_BOOTS_MASTER.get()
        );
        
        // White Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::whiteSamurai,
                ItemsRegistry.WHITE_SAMURAI_HELMET.get(),
                ItemsRegistry.WHITE_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.WHITE_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.WHITE_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::whiteSamuraiLight,
                ItemsRegistry.WHITE_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.WHITE_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.WHITE_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.WHITE_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::whiteSamuraiMaster,
                ItemsRegistry.WHITE_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.WHITE_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.WHITE_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.WHITE_SAMURAI_BOOTS_MASTER.get()
        );
        
        // Gray Samurai Armor
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::graySamurai,
                ItemsRegistry.GRAY_SAMURAI_HELMET.get(),
                ItemsRegistry.GRAY_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.GRAY_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.GRAY_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::graySamuraiLight,
                ItemsRegistry.GRAY_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.GRAY_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.GRAY_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.GRAY_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::graySamuraiMaster,
                ItemsRegistry.GRAY_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.GRAY_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.GRAY_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.GRAY_SAMURAI_BOOTS_MASTER.get()
        );
        
        // Iron/Gold/Diamond/Red Light & Master variants
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::ironSamuraiLight,
                ItemsRegistry.IRON_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.IRON_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.IRON_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.IRON_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::ironSamuraiMaster,
                ItemsRegistry.IRON_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.IRON_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.IRON_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.IRON_SAMURAI_BOOTS_MASTER.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::goldSamuraiLight,
                ItemsRegistry.GOLD_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.GOLD_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.GOLD_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.GOLD_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::goldSamuraiMaster,
                ItemsRegistry.GOLD_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.GOLD_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.GOLD_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.GOLD_SAMURAI_BOOTS_MASTER.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::diamondSamuraiLight,
                ItemsRegistry.DIAMOND_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.DIAMOND_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.DIAMOND_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.DIAMOND_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::diamondSamuraiMaster,
                ItemsRegistry.DIAMOND_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.DIAMOND_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.DIAMOND_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.DIAMOND_SAMURAI_BOOTS_MASTER.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::redSamuraiLight,
                ItemsRegistry.RED_SAMURAI_HELMET_LIGHT.get(),
                ItemsRegistry.RED_SAMURAI_CHESTPLATE_LIGHT.get(),
                ItemsRegistry.RED_SAMURAI_LEGGINGS_LIGHT.get(),
                ItemsRegistry.RED_SAMURAI_BOOTS_LIGHT.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::redSamuraiMaster,
                ItemsRegistry.RED_SAMURAI_HELMET_MASTER.get(),
                ItemsRegistry.RED_SAMURAI_CHESTPLATE_MASTER.get(),
                ItemsRegistry.RED_SAMURAI_LEGGINGS_MASTER.get(),
                ItemsRegistry.RED_SAMURAI_BOOTS_MASTER.get()
        );
        
        // Ninja variants
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::goldNinja,
                ItemsRegistry.GOLD_NINJA_HELMET.get(),
                ItemsRegistry.GOLD_NINJA_CHESTPLATE.get(),
                ItemsRegistry.GOLD_NINJA_LEGGINGS.get(),
                ItemsRegistry.GOLD_NINJA_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::diamondNinja,
                ItemsRegistry.DIAMOND_NINJA_HELMET.get(),
                ItemsRegistry.DIAMOND_NINJA_CHESTPLATE.get(),
                ItemsRegistry.DIAMOND_NINJA_LEGGINGS.get(),
                ItemsRegistry.DIAMOND_NINJA_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::steelNinja,
                ItemsRegistry.STEEL_NINJA_HELMET.get(),
                ItemsRegistry.STEEL_NINJA_CHESTPLATE.get(),
                ItemsRegistry.STEEL_NINJA_LEGGINGS.get(),
                ItemsRegistry.STEEL_NINJA_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::netheriteNinja,
                ItemsRegistry.NETHERITE_NINJA_HELMET.get(),
                ItemsRegistry.NETHERITE_NINJA_CHESTPLATE.get(),
                ItemsRegistry.NETHERITE_NINJA_LEGGINGS.get(),
                ItemsRegistry.NETHERITE_NINJA_BOOTS.get()
        );
        
        // Special armors
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::steelArmor,
                ItemsRegistry.STEEL_HELMET.get(),
                ItemsRegistry.STEEL_CHESTPLATE.get(),
                ItemsRegistry.STEEL_LEGGINGS.get(),
                ItemsRegistry.STEEL_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::amethystSamurai,
                ItemsRegistry.AMETHYST_SAMURAI_HELMET.get(),
                ItemsRegistry.AMETHYST_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.AMETHYST_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.AMETHYST_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::quartzSamurai,
                ItemsRegistry.QUARTZ_SAMURAI_HELMET.get(),
                ItemsRegistry.QUARTZ_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.QUARTZ_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.QUARTZ_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::sculkSamurai,
                ItemsRegistry.SCULK_SAMURAI_HELMET.get(),
                ItemsRegistry.SCULK_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.SCULK_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.SCULK_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::etyriteSamurai,
                ItemsRegistry.ETYRITE_SAMURAI_HELMET.get(),
                ItemsRegistry.ETYRITE_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.ETYRITE_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.ETYRITE_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::tyrSamurai,
                ItemsRegistry.TYR_SAMURAI_HELMET.get(),
                ItemsRegistry.TYR_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.TYR_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.TYR_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::dracoSamurai,
                ItemsRegistry.DRACO_SAMURAI_HELMET.get(),
                ItemsRegistry.DRACO_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.DRACO_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.DRACO_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::livingSamurai,
                ItemsRegistry.LIVING_SAMURAI_HELMET.get(),
                ItemsRegistry.LIVING_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.LIVING_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.LIVING_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::neptuniumSamurai,
                ItemsRegistry.NEPTUNIUM_SAMURAI_HELMET.get(),
                ItemsRegistry.NEPTUNIUM_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.NEPTUNIUM_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.NEPTUNIUM_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::brassSamurai,
                ItemsRegistry.BRASS_SAMURAI_HELMET.get(),
                ItemsRegistry.BRASS_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.BRASS_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.BRASS_SAMURAI_BOOTS.get()
        );
        
        AzArmorRendererRegistry.register(
                SamuraiArmorRenderer::mageSamurai,
                ItemsRegistry.MAGE_SAMURAI_HELMET.get(),
                ItemsRegistry.MAGE_SAMURAI_CHESTPLATE.get(),
                ItemsRegistry.MAGE_SAMURAI_LEGGINGS.get(),
                ItemsRegistry.MAGE_SAMURAI_BOOTS.get()
        );
    }
}
