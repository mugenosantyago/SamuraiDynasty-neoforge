package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.KitsuneEntity;

public class KitsuneRenderer extends AzEntityRenderer<KitsuneEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/kitsune.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/kitsune.png");

    public KitsuneRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<KitsuneEntity> createConfig() {
        return AzEntityRendererConfig.<KitsuneEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0.5f)
                .build();
    }
}
