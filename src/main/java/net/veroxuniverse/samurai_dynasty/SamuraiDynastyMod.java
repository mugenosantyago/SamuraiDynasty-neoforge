package net.veroxuniverse.samurai_dynasty;

import com.mojang.logging.LogUtils;
import mod.azure.azurelib.common.animation.cache.AzIdentityRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
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
        net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry.register(modEventBus);
        BlocksRegistry.register(modEventBus);
        ItemsRegistry.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ParticlesInit.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        ESSounds.register(modEventBus);

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
        
        // Register client setup listener
        modEventBus.addListener(this::clientSetup);
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Samurai Dynasty client setup");
        
        // Register armor renderers with AzureLib 3.2.0
        event.enqueueWork(() -> {
            net.veroxuniverse.samurai_dynasty.client.armors.ArmorRendererRegistry.registerAll();
            LOGGER.info("Registered armor renderers with AzArmorRendererRegistry");
        });
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Samurai Dynasty common setup");

        // Register armor items with AzIdentityRegistry for proper animation triggering
        event.enqueueWork(() -> {
            AzIdentityRegistry.register(
                    ItemsRegistry.IRON_SAMURAI_HELMET.get(),
                    ItemsRegistry.IRON_SAMURAI_CHESTPLATE.get(),
                    ItemsRegistry.IRON_SAMURAI_LEGGINGS.get(),
                    ItemsRegistry.IRON_SAMURAI_BOOTS.get(),
                    ItemsRegistry.GOLD_SAMURAI_HELMET.get(),
                    ItemsRegistry.GOLD_SAMURAI_CHESTPLATE.get(),
                    ItemsRegistry.GOLD_SAMURAI_LEGGINGS.get(),
                    ItemsRegistry.GOLD_SAMURAI_BOOTS.get(),
                    ItemsRegistry.DIAMOND_SAMURAI_HELMET.get(),
                    ItemsRegistry.DIAMOND_SAMURAI_CHESTPLATE.get(),
                    ItemsRegistry.DIAMOND_SAMURAI_LEGGINGS.get(),
                    ItemsRegistry.DIAMOND_SAMURAI_BOOTS.get(),
                    ItemsRegistry.RED_SAMURAI_HELMET.get(),
                    ItemsRegistry.RED_SAMURAI_CHESTPLATE.get(),
                    ItemsRegistry.RED_SAMURAI_LEGGINGS.get(),
                    ItemsRegistry.RED_SAMURAI_BOOTS.get(),
                    ItemsRegistry.IRON_NINJA_HELMET.get(),
                    ItemsRegistry.IRON_NINJA_CHESTPLATE.get(),
                    ItemsRegistry.IRON_NINJA_BOOTS.get(),
                    ItemsRegistry.NINJA_LEGGINGS.get(),
                    ItemsRegistry.STRAW_HAT.get(),
                    ItemsRegistry.KIMONO.get(),
                    ItemsRegistry.ONI_MASK.get(),
                    ItemsRegistry.KITSUNE_MASK.get()
            );
            LOGGER.info("Registered armor items with AzIdentityRegistry");
        });

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

}
