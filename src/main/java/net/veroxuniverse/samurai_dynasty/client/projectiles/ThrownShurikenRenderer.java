package net.veroxuniverse.samurai_dynasty.client.projectiles;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.ThrownShurikenEntity;

public class ThrownShurikenRenderer extends AzEntityRenderer<ThrownShurikenEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/shuriken.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/shuriken.png");

    public ThrownShurikenRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<ThrownShurikenEntity> createConfig() {
        return AzEntityRendererConfig.<ThrownShurikenEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0f)
                .build();
    }
}
