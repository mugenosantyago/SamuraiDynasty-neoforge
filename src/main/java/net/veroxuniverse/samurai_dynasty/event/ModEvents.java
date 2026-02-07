package net.veroxuniverse.samurai_dynasty.event;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.entity.custom.*;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

public class ModEvents {

    @EventBusSubscriber(modid = SamuraiDynastyMod.MOD_ID)
    public static class ModEventBusEvents {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.AKANAME.get(), AkanameEntity.createAttributes().build());
            event.put(ModEntityTypes.ENENRA.get(), EnenraEntity.createAttributes().build());
            event.put(ModEntityTypes.ONI.get(), OniEntity.createAttributes().build());
            event.put(ModEntityTypes.KITSUNE.get(), KitsuneEntity.createAttributes().build());
            event.put(ModEntityTypes.ONIBI.get(), OnibiEntity.createAttributes().build());
            event.put(ModEntityTypes.JOROGUMO.get(), JorogumoEntity.createAttributes().build());
            event.put(ModEntityTypes.KOMAINU.get(), KomainuEntity.createAttributes().build());
            event.put(ModEntityTypes.TANUKI.get(), TanukiEntity.createAttributes().build());
            event.put(ModEntityTypes.KAWAUSO.get(), KawausoEntity.createAttributes().build());
            event.put(ModEntityTypes.TWOTAILED.get(), TwoTailedFox.createAttributes().build());
        }

        @SubscribeEvent
        public static void entitySpawnRestriction(RegisterSpawnPlacementsEvent event) {
            event.register(ModEntityTypes.ONI.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.ENENRA.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.AKANAME.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.KITSUNE.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.JOROGUMO.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.TANUKI.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.KAWAUSO.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.TWOTAILED.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
            event.register(ModEntityTypes.KOMAINU.get(),
                    SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        }

    }

    @EventBusSubscriber(modid = SamuraiDynastyMod.MOD_ID)
    public static class ForgeEvents {
        
        @SubscribeEvent
        public static void onEntityTick(EntityTickEvent.Post event) {
            if (event.getEntity() instanceof Player player) {
                if (!player.level().isClientSide()) {
                    // Check if player is wearing ninja leggings
                    if (player.getItemBySlot(EquipmentSlot.LEGS).is(ItemsRegistry.NINJA_LEGGINGS.get())) {
                        // Apply speed and jump boost effects
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 0, false, false, false));
                        player.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 0, false, false, false));
                    }
                }
            }
        }
    }

}
