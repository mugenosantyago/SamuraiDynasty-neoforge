package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.AkanameEntity;

/**
 * Renderer for Akaname entity using AzureLib 3.2.0 for 1.21.8
 */
public class AkanameRenderer extends AzEntityRenderer<AkanameEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/akaname.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/akaname.png");

    public AkanameRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<AkanameEntity> createConfig() {
        return AzEntityRendererConfig.<AkanameEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0.4f)
                .build();
    }
}
