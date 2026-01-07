package net.veroxuniverse.samurai_dynasty.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.custom.*;

import java.util.function.Supplier;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, SamuraiDynastyMod.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<AkanameEntity>> AKANAME =
            ENTITY_TYPES.register("akaname",
                    () -> EntityType.Builder.of(AkanameEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.8f)
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<KitsuneEntity>> KITSUNE =
            ENTITY_TYPES.register("kitsune",
                    () -> EntityType.Builder.of(KitsuneEntity::new, MobCategory.MONSTER)
                            .sized(1.3964844F, 1.6f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<EnenraEntity>> ENENRA =
            ENTITY_TYPES.register("enenra",
                    () -> EntityType.Builder.of(EnenraEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.8f)
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<OniEntity>> ONI =
            ENTITY_TYPES.register("oni",
                    () -> EntityType.Builder.of(OniEntity::new, MobCategory.MONSTER)
                            .sized(1.8f, 2.6f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<OnibiEntity>> ONIBI =
            ENTITY_TYPES.register("onibi",
                    () -> EntityType.Builder.of(OnibiEntity::new, MobCategory.MONSTER)
                            .sized(0.2f, 0.8f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<JorogumoEntity>> JOROGUMO =
            ENTITY_TYPES.register("jorogumo",
                    () -> EntityType.Builder.of(JorogumoEntity::new, MobCategory.MONSTER)
                            .sized(1.8f, 2.0f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<KomainuEntity>> KOMAINU =
            ENTITY_TYPES.register("komainu",
                    () -> EntityType.Builder.of(KomainuEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 0.8f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<TanukiEntity>> TANUKI =
            ENTITY_TYPES.register("tanuki",
                    () -> EntityType.Builder.of(TanukiEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 0.8f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<TwoTailedFox>> TWOTAILED =
            ENTITY_TYPES.register("twotailed",
                    () -> EntityType.Builder.of(TwoTailedFox::new, MobCategory.CREATURE)
                            .sized(1.0f, 0.8f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<KawausoEntity>> KAWAUSO =
            ENTITY_TYPES.register("kawauso",
                    () -> EntityType.Builder.of(KawausoEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 0.8f)
                            .fireImmune()
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<ThrownShurikenEntity>> SHURIKEN =
            ENTITY_TYPES.register("shuriken",
                    () -> EntityType.Builder.<ThrownShurikenEntity>of(ThrownShurikenEntity::new, MobCategory.MISC)
                            .sized(0.25F, 0.25F)
                            .clientTrackingRange(4)
                            .updateInterval(10)
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<KunaiEntity>> KUNAI =
            ENTITY_TYPES.register("kunai",
                    () -> EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC)
                            .sized(0.25F, 0.25F)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<NetheriteKunaiEntity>> KUNAI_NETHERITE =
            ENTITY_TYPES.register("kunai_netherite",
                    () -> EntityType.Builder.<NetheriteKunaiEntity>of(NetheriteKunaiEntity::new, MobCategory.MISC)
                            .sized(0.25F, 0.25F)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build());

    public static final DeferredHolder<EntityType<?>, EntityType<KitsuneProjectileEntity>> KITSUNE_PROJECTILE =
            ENTITY_TYPES.register("kitsune_projectile",
                    () -> EntityType.Builder.<KitsuneProjectileEntity>of(KitsuneProjectileEntity::new, MobCategory.MISC)
                            .sized(0.25F, 0.25F)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build());

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
