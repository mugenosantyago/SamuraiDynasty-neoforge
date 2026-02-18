package net.veroxuniverse.samurai_dynasty.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.client.entities.*;
import net.veroxuniverse.samurai_dynasty.client.projectiles.ThrownShurikenRenderer;
import net.veroxuniverse.samurai_dynasty.curios.model.KitsuneMaskModel;
import net.veroxuniverse.samurai_dynasty.curios.model.OniMaskModel;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.item.YumiBow;
import net.veroxuniverse.samurai_dynasty.particle.BlueFlame;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import net.veroxuniverse.samurai_dynasty.registry.ParticlesInit;

@EventBusSubscriber(modid = SamuraiDynastyMod.MOD_ID, value = Dist.CLIENT)
public class SamuraiDynastyClientMod {

    /** Helmet head/hat hiding is done in LivingEntityRendererHelmetMixin (port from 1.21.1). */

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> registerYumiItemProperties());
    }

    /** Register pull/pulling item model properties for Yumi so bow draw animation works. */
    private static void registerYumiItemProperties() {
        ItemProperties.register(ItemsRegistry.YUMI.get(), ResourceLocation.withDefaultNamespace("pull"),
                (stack, level, living, seed) -> {
                    if (living == null) return 0.0F;
                    if (living.getUseItem() != stack) return 0.0F;
                    int useTicks = living.getTicksUsingItem();
                    return YumiBow.getPowerForTime(useTicks);
                });
        ItemProperties.register(ItemsRegistry.YUMI.get(), ResourceLocation.withDefaultNamespace("pulling"),
                (stack, level, living, seed) -> living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F);
    }

    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticlesInit.BLUE_FLAME.get(), BlueFlame.Provider::new);
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        // AzureLib 3.2.0 entity renderers
        event.registerEntityRenderer(ModEntityTypes.AKANAME.get(), AkanameRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.ENENRA.get(), EnenraRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.ONI.get(), OniRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.ONIBI.get(), OnibiRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KITSUNE.get(), KitsuneRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.JOROGUMO.get(), JorogumoRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KOMAINU.get(), KomainuRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.TANUKI.get(), TanukiRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KAWAUSO.get(), KawausoRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.TWOTAILED.get(), TwoTailedRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KITSUNE_PROJECTILE.get(), KitsuneProjectileRenderer::new);
        
        // Shuriken uses its own renderer
        event.registerEntityRenderer(ModEntityTypes.SHURIKEN.get(), ThrownShurikenRenderer::new);
        
        // Vanilla projectile renderers for kunai
        event.registerEntityRenderer(ModEntityTypes.KUNAI.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KUNAI_NETHERITE.get(), ThrownItemRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerRenderers(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(OniMaskModel.LAYER_LOCATION, OniMaskModel::createBodyLayer);
        event.registerLayerDefinition(KitsuneMaskModel.LAYER_LOCATION, KitsuneMaskModel::createBodyLayer);
    }
}
