package net.veroxuniverse.samurai_dynasty.client.armors;

import mod.azure.azurelib.common.render.armor.AzArmorRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererConfig;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

/**
 * Generic armor renderer for Samurai Dynasty armor using AzureLib 3.2.0
 */
public class SamuraiArmorRenderer extends AzArmorRenderer {
    
    public SamuraiArmorRenderer(ResourceLocation modelLocation, ResourceLocation textureLocation) {
        super(createConfig(modelLocation, textureLocation));
    }
    
    private static AzArmorRendererConfig createConfig(ResourceLocation modelLocation, ResourceLocation textureLocation) {
        return AzArmorRendererConfig.builder(modelLocation, textureLocation)
                .build();
    }
    
    // Factory methods for each armor type
    
    public static SamuraiArmorRenderer ironSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/iron_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer goldSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gold_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer diamondSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/diamond_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer redSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/red_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer ironNinja() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/ninja_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/ninja_iron_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer strawHat() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/straw_hat.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/mask_straw_hat_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer kimono() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/kimono.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/kimono_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer oniMask() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/oni_mask.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/oni_mask_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer kitsuneMask() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/kitsune_mask.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/kitsune_mask.png")
        );
    }
    
    // ===== NEW ARMOR RENDERERS =====
    
    // Netherite Samurai
    public static SamuraiArmorRenderer netheriteSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/netherite_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer netheriteSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/netherite_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer netheriteSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/netherite_samurai_armor_master_textures.png")
        );
    }
    
    // Blue Samurai (Aquamarine)
    public static SamuraiArmorRenderer blueSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/blue_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer blueSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/blue_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer blueSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/blue_samurai_armor_master_textures.png")
        );
    }
    
    // Green Samurai (Jade)
    public static SamuraiArmorRenderer greenSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/green_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer greenSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/green_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer greenSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/green_samurai_armor_master_textures.png")
        );
    }
    
    // White Samurai (Silver)
    public static SamuraiArmorRenderer whiteSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/white_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer whiteSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/white_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer whiteSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/white_samurai_armor_master_textures.png")
        );
    }
    
    // Gray Samurai (Onyx)
    public static SamuraiArmorRenderer graySamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gray_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer graySamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gray_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer graySamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gray_samurai_armor_master_textures.png")
        );
    }
    
    // Light variants for existing armors
    public static SamuraiArmorRenderer ironSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/iron_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer ironSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/iron_samurai_armor_master_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer goldSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gold_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer goldSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/gold_samurai_armor_master_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer diamondSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/diamond_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer diamondSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/diamond_samurai_armor_master_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer redSamuraiLight() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_light.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/red_samurai_armor_light_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer redSamuraiMaster() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor_master.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/red_samurai_armor_master_textures.png")
        );
    }
    
    // Ninja variants
    public static SamuraiArmorRenderer goldNinja() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/ninja_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/ninja_gold_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer diamondNinja() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/ninja_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/ninja_diamond_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer steelNinja() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/ninja_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/ninja_steel_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer netheriteNinja() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/ninja_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/ninja_netherite_armor_textures.png")
        );
    }
    
    // Special armors
    public static SamuraiArmorRenderer steelArmor() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/steel_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer amethystSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/amethyst_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer quartzSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/quartz_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer sculkSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/sculk_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer etyriteSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/etyrite_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer tyrSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/tyr_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer dracoSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/draco_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer livingSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/living_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer neptuniumSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/neptunium_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer brassSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/brass_samurai_armor_textures.png")
        );
    }
    
    public static SamuraiArmorRenderer mageSamurai() {
        return new SamuraiArmorRenderer(
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/samurai_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/armor/mage_samurai_armor_textures.png")
        );
    }
}
