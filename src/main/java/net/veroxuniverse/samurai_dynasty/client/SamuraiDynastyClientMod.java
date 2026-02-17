package net.veroxuniverse.samurai_dynasty.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.client.event.RenderLivingEvent;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.client.entities.*;
import net.veroxuniverse.samurai_dynasty.client.projectiles.ThrownShurikenRenderer;
import net.veroxuniverse.samurai_dynasty.client.CurrentRenderingEntity;
import net.veroxuniverse.samurai_dynasty.curios.model.KitsuneMaskModel;
import net.veroxuniverse.samurai_dynasty.curios.model.OniMaskModel;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import net.veroxuniverse.samurai_dynasty.particle.BlueFlame;
import net.veroxuniverse.samurai_dynasty.registry.ParticlesInit;

@EventBusSubscriber(modid = SamuraiDynastyMod.MOD_ID, value = Dist.CLIENT)
public class SamuraiDynastyClientMod {

    /** When wearing our helmet, we hide only the hat layer (top of head) so the face stays visible. */
    private static final ThreadLocal<Boolean> SAVED_HAT_VISIBLE = new ThreadLocal<>();

    @SubscribeEvent
    public static void onRenderLivingPre(RenderLivingEvent.Pre<?, ?, ?> event) {
        LivingEntity entity = CurrentRenderingEntity.get();
        if (entity == null || !(entity.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof SamuraiArmorItem item) || item.getArmorType() != ArmorType.HELMET) {
            return;
        }
        if (event.getRenderer().getModel() instanceof HumanoidModel<?> humanoid) {
            SAVED_HAT_VISIBLE.set(humanoid.hat.visible);
            humanoid.hat.visible = false;
        }
    }

    @SubscribeEvent
    public static void onRenderLivingPost(RenderLivingEvent.Post<?, ?, ?> event) {
        if (SAVED_HAT_VISIBLE.get() == null) {
            return;
        }
        if (event.getRenderer().getModel() instanceof HumanoidModel<?> humanoid) {
            humanoid.hat.visible = SAVED_HAT_VISIBLE.get();
        }
        SAVED_HAT_VISIBLE.remove();
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
