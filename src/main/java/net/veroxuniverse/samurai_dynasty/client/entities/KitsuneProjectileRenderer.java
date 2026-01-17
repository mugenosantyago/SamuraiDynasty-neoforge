package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.render.entity.AzEntityRenderer;
import mod.azure.azurelib.common.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.KitsuneProjectileEntity;

public class KitsuneProjectileRenderer extends AzEntityRenderer<KitsuneProjectileEntity> {
    
    private static final ResourceLocation MODEL = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "geo/kitsune_projectile.geo.json");
    
    private static final ResourceLocation TEXTURE = 
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "textures/entity/kitsune_projectile.png");

    public KitsuneProjectileRenderer(EntityRendererProvider.Context context) {
        super(createConfig(), context);
    }
    
    private static AzEntityRendererConfig<KitsuneProjectileEntity> createConfig() {
        return AzEntityRendererConfig.<KitsuneProjectileEntity>builder(MODEL, TEXTURE)
                .setShadowRadius(0f)
                .build();
    }
}
