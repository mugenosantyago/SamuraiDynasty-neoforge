package net.veroxuniverse.samurai_dynasty;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry;
import net.veroxuniverse.samurai_dynasty.registry.BlocksRegistry;
import net.veroxuniverse.samurai_dynasty.registry.CreativeTabRegistry;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import net.veroxuniverse.samurai_dynasty.registry.ParticlesInit;
import net.veroxuniverse.samurai_dynasty.sound.ESSounds;
import org.slf4j.Logger;


@Mod(SamuraiDynastyMod.MOD_ID)
public class SamuraiDynastyMod {
    public static final String MOD_ID = "samurai_dynasty";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SamuraiDynastyMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register deferred registers
        ItemsRegistry.register(modEventBus);
        // BlocksRegistry.register(modEventBus); // Temporarily disabled to debug registration issue
        ModEntityTypes.register(modEventBus);
        ParticlesInit.register(modEventBus);
        // CreativeTabRegistry.register(modEventBus); // Temporarily disabled to debug registration issue
        ESSounds.register(modEventBus);
        ArmorMaterialsRegistry.register(modEventBus); // Moved after items

        // Register mod compatibility when those mods are loaded
        // TODO: Re-enable when compat mods are available for 1.21.4
        /*
        if (ModList.get().isLoaded("deeperdarker")) {
            DeeperDarkerCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("create")) {
            CreateCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("ars_nouveau")) {
            ArsNouveauCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("aquaculture")) {
            AquacultureCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("eldritch_end")) {
            EldritchEndCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("bloodmagic")) {
            BloodMagicCompat.register(modEventBus);
        }
        if (ModList.get().isLoaded("forbidden_arcanus")) {
            ForbiddenCompat.register(modEventBus);
        }
        */

        // Register common setup listener
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Samurai Dynasty common setup");

        // TODO: Re-enable when compat mods are available for 1.21.4
        /*
        if (ModList.get().isLoaded("ars_nouveau")) {
            ArsNouveauCompat.registerPerkProviders();
        }

        if (ModList.get().isLoaded("create")) {
            addIsWearingPredicate((player) ->
                    player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof BrassSamuraiArmorItem);
        }
        */
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Samurai Dynasty client setup");

            // TODO: Register armor renderers when AzureLib is available for 1.21.4
            // TODO: Register curios renderers when Curios is available for 1.21.4
            /*
            CuriosRendererRegistry.register(ItemsRegistry.ONI_MASK.get(), OniMaskRenderer::new);
            CuriosRendererRegistry.register(ItemsRegistry.KITSUNE_MASK.get(), KitsuneMaskRenderer::new);
            
            // Register item renderers
            AzItemRendererRegistry.register(KamayariItemRenderer::new, ItemsRegistry.KAMAYARI.get());
            // ... etc
            */
        }
    }
}
