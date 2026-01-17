package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.OniEntity;

public class OniRenderer extends AzEntityRenderer<OniEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/oni.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/oni.png");

    public OniRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<OniEntity> createConfig() {
        return AzEntityRendererConfig.<OniEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0.7f)
                .build();
    }
}
