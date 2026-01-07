package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Armor materials registry for NeoForge 1.21.4.
 * In 1.21.4, ArmorMaterial is a record registered via DeferredRegister.
 */
public class ArmorMaterialsRegistry {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, SamuraiDynastyMod.MOD_ID);

    // ===== NINJA ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NINJA_GOLD = registerMaterial("ninja_gold",
            createDefenseMap(1, 2, 4, 1), 25, SoundEvents.ARMOR_EQUIP_GOLD,
            0.0F, 0.0F, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NINJA_IRON = registerMaterial("ninja_iron",
            createDefenseMap(2, 3, 5, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NINJA_DIAMOND = registerMaterial("ninja_diamond",
            createDefenseMap(3, 4, 7, 2), 12, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NINJA_STEEL = registerMaterial("ninja_steel",
            createDefenseMap(2, 3, 6, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.5F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT)); // Fallback until STEEL_INGOT is available

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NINJA_NETHERITE = registerMaterial("ninja_netherite",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT));

    // ===== SAMURAI RUBY ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_RUBY = registerMaterial("samurai_ruby",
            createDefenseMap(3, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND)); // Fallback

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_RUBY_MASTER = registerMaterial("samurai_ruby_master",
            createDefenseMap(2, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    // ===== SAMURAI ONYX ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_ONYX = registerMaterial("samurai_onyx",
            createDefenseMap(3, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_ONYX_MASTER = registerMaterial("samurai_onyx_master",
            createDefenseMap(2, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    // ===== SAMURAI AQUA ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_AQUA = registerMaterial("samurai_aqua",
            createDefenseMap(3, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_AQUA_MASTER = registerMaterial("samurai_aqua_master",
            createDefenseMap(2, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    // ===== SAMURAI JADE ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_JADE = registerMaterial("samurai_jade",
            createDefenseMap(3, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_JADE_MASTER = registerMaterial("samurai_jade_master",
            createDefenseMap(2, 6, 8, 2), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    // ===== SAMURAI DIAMOND ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_DIAMOND = registerMaterial("samurai_diamond",
            createDefenseMap(3, 6, 8, 2), 12, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_DIAMOND_MASTER = registerMaterial("samurai_diamond_master",
            createDefenseMap(2, 6, 8, 2), 12, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND));

    // ===== SAMURAI SILVER ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_SILVER = registerMaterial("samurai_silver",
            createDefenseMap(2, 5, 6, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.5F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_SILVER_MASTER = registerMaterial("samurai_silver_master",
            createDefenseMap(2, 5, 6, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    // ===== SAMURAI BRASS ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_BRASS = registerMaterial("samurai_brass",
            createDefenseMap(3, 6, 8, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            1.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT));

    // ===== SAMURAI NETHERITE ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_NETHERITE = registerMaterial("samurai_netherite",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_NETHERITE_MASTER = registerMaterial("samurai_netherite_master",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT));

    // ===== SAMURAI SCULK ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_SCULK = registerMaterial("samurai_sculk",
            createDefenseMap(4, 7, 9, 4), 25, SoundEvents.SCULK_BLOCK_PLACE,
            4.0F, 0.1F, () -> Ingredient.of(Items.ECHO_SHARD));

    // ===== SAMURAI AMETHYST ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_AMETHYST = registerMaterial("samurai_amethyst",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.AMETHYST_CLUSTER_PLACE,
            2.5F, 0.0F, () -> Ingredient.of(Items.AMETHYST_SHARD));

    // ===== SAMURAI NEPTUNIUM ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_NEPTUN = registerMaterial("samurai_neptun",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.5F, 0.0F, () -> Ingredient.of(Items.HEART_OF_THE_SEA));

    // ===== SAMURAI ETYRITE ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_ETYRITE = registerMaterial("samurai_etyrite",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(Items.NETHERITE_INGOT));

    // ===== SAMURAI QUARTZ ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_QUARTZ = registerMaterial("samurai_quartz",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.5F, 0.0F, () -> Ingredient.of(Items.QUARTZ));

    // ===== SAMURAI GOLD ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_GOLD = registerMaterial("samurai_gold",
            createDefenseMap(2, 4, 5, 2), 25, SoundEvents.ARMOR_EQUIP_GOLD,
            0.5F, 0.0F, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_GOLD_MASTER = registerMaterial("samurai_gold_master",
            createDefenseMap(2, 4, 5, 2), 25, SoundEvents.ARMOR_EQUIP_GOLD,
            0.0F, 0.0F, () -> Ingredient.of(Items.GOLD_INGOT));

    // ===== SAMURAI IRON ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_IRON = registerMaterial("samurai_iron",
            createDefenseMap(2, 5, 6, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.5F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_IRON_MASTER = registerMaterial("samurai_iron_master",
            createDefenseMap(2, 5, 6, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    // ===== SAMURAI STEEL ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_STEEL = registerMaterial("samurai_steel",
            createDefenseMap(3, 5, 7, 2), 12, SoundEvents.ARMOR_EQUIP_IRON,
            0.5F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    // ===== SPECIAL ARMORS =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> STRAW = registerMaterial("straw",
            createDefenseMap(1, 1, 1, 1), 7, SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F, 0.0F, () -> Ingredient.of(Items.WHEAT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_TYR = registerMaterial("samurai_tyr",
            createDefenseMap(8, 10, 12, 7), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.2F, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_DRACO = registerMaterial("samurai_draco",
            createDefenseMap(6, 8, 10, 6), 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.1F, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CLOTH = registerMaterial("cloth",
            createDefenseMap(1, 2, 3, 1), 12, SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F, 0.0F, () -> Ingredient.of(Items.STRING));

    // ===== MAGE ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_MAGE = registerMaterial("samurai_mage",
            createDefenseMap(3, 6, 8, 2), 25, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F, 0.0F, () -> Ingredient.of(Items.GOLD_INGOT));

    // ===== LIVING ARMOR =====
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SAMURAI_LIVING = registerMaterial("samurai_living",
            createDefenseMap(3, 6, 8, 3), 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F, 0.05F, () -> Ingredient.of(Items.REDSTONE));

    /**
     * Creates a defense map for armor pieces.
     * Order: boots, leggings, chestplate, helmet
     */
    private static Map<ArmorType, Integer> createDefenseMap(int boots, int leggings, int chestplate, int helmet) {
        return Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, boots);
            map.put(ArmorType.LEGGINGS, leggings);
            map.put(ArmorType.CHESTPLATE, chestplate);
            map.put(ArmorType.HELMET, helmet);
            map.put(ArmorType.BODY, chestplate);
        });
    }

    /**
     * Registers an armor material using DeferredRegister.
     */
    private static DeferredHolder<ArmorMaterial, ArmorMaterial> registerMaterial(
            String name, Map<ArmorType, Integer> defense,
            int enchantmentValue, SoundEvent equipSound,
            float toughness, float knockbackResistance,
            Supplier<Ingredient> repairIngredient) {
        
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(
                defense,
                enchantmentValue,
                Holder.direct(equipSound),
                repairIngredient,
                toughness,
                knockbackResistance,
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, name)
        ));
    }

    /**
     * Register this registry to the mod event bus.
     */
    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
