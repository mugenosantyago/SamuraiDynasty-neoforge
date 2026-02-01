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
}
