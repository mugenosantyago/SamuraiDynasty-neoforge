package net.veroxuniverse.samurai_dynasty.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.client.entities.*;
import net.veroxuniverse.samurai_dynasty.client.projectiles.ThrownShurikenRenderer;
import net.veroxuniverse.samurai_dynasty.curios.model.KitsuneMaskModel;
import net.veroxuniverse.samurai_dynasty.curios.model.OniMaskModel;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.particle.BlueFlame;
import net.veroxuniverse.samurai_dynasty.registry.ParticlesInit;

@EventBusSubscriber(modid = SamuraiDynastyMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SamuraiDynastyClientMod {
    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticlesInit.BLUE_FLAME.get(), BlueFlame.Provider::new);
    }

    @SubscribeEvent
    public static void initItemColors(final RegisterColorHandlersEvent event) {
        // TODO: Re-enable when Ars Nouveau is available for NeoForge 1.21
        // Item color handlers registration - currently disabled
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        // TODO: Replace with proper renderers when AzureLib/GeckoLib is available for NeoForge 1.21
        // For now, using placeholder renderers that won't crash the game
        
        // Entity renderers - these need AzureLib which is not yet available
        // Commenting out the custom renderers until AzureLib is updated
        /*
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
        event.registerEntityRenderer(ModEntityTypes.SHURIKEN.get(), ThrownShurikenRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KITSUNE_PROJECTILE.get(), KitsuneProjectileRenderer::new);
        */
        
        // These use vanilla renderers and should work
        event.registerEntityRenderer(ModEntityTypes.KUNAI.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.KUNAI_NETHERITE.get(), ThrownItemRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerRenderers(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(OniMaskModel.LAYER_LOCATION, OniMaskModel::createBodyLayer);
        event.registerLayerDefinition(KitsuneMaskModel.LAYER_LOCATION, KitsuneMaskModel::createBodyLayer);
    }
}
