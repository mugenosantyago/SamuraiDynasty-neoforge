package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.KomainuEntity;

public class KomainuRenderer extends AzEntityRenderer<KomainuEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/komainu.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/komainu.png");

    public KomainuRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<KomainuEntity> createConfig() {
        return AzEntityRendererConfig.<KomainuEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0.4f)
                .build();
    }
}
