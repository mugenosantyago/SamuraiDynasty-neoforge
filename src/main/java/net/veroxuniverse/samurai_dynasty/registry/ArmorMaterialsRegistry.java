package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;

import java.util.EnumMap;
import java.util.List;

/**
 * Armor materials for NeoForge 1.21.4+
 * 
 * Custom armor materials with proper stat progression based on rarity:
 * - Basic: Iron, Gold, Steel, Silver, Brass (Common materials) - 15-16 defense
 * - Rare: Ruby, Jade, Aquamarine, Onyx (Rare gems) - 20-22 defense, 2.0-2.5 toughness
 * - Epic: Amethyst, Quartz, Diamond (Epic tier) - 20 defense, 2.0 toughness
 * - Legendary: Netherite, Sculk, Etyrite (Legendary) - 24 defense, 3.0 toughness, 0.1 KB resist
 * - Mythic: Tyr, Draco, Living, Neptunium, Mage (Mythic) - 28+ defense, 4.0+ toughness, 0.15-0.2 KB resist
 * 
 * Master variants provide +1-2 defense and +0.5-1.0 toughness over regular variants
 */
public class ArmorMaterialsRegistry {

    // ===== BASIC TIER (Iron-level stats) =====
    // Defense: 15 (2/5/6/2), Toughness: 0, Durability: 15
    public static final ArmorMaterial SAMURAI_IRON = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 15, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_IRON_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 7);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 7);
            }), 18, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 1.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_STEEL = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 16, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.5F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_SILVER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_SILVER_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 7);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 7);
            }), 22, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 1.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_BRASS = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 14, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_GOLD = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 3);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 25, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_GOLD_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 4);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 6);
            }), 30, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.5F, 0.0F, false);

    // ===== RARE TIER (Better than Diamond) =====
    // Ruby - Defense: 22, Toughness: 2.5
    public static final ArmorMaterial SAMURAI_RUBY = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_RUBY_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.0F, 0.05F, false);

    // Jade - Defense: 21, Toughness: 2.0
    public static final ArmorMaterial SAMURAI_JADE = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 8);
            }), 19, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_JADE_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 9);
            }), 21, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false);

    // Aquamarine - Defense: 21, Toughness: 2.0
    public static final ArmorMaterial SAMURAI_AQUA = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 8);
            }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_AQUA_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 9);
            }), 22, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false);

    // Onyx - Defense: 22, Toughness: 2.5
    public static final ArmorMaterial SAMURAI_ONYX = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 17, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_ONYX_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 19, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.0F, 0.05F, false);

    // ===== EPIC TIER (Diamond-level) =====
    // Diamond - Defense: 20, Toughness: 2.0
    public static final ArmorMaterial SAMURAI_DIAMOND = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_DIAMOND_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 17, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_AMETHYST = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    public static final ArmorMaterial SAMURAI_QUARTZ = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    // ===== LEGENDARY TIER (Netherite-level) =====
    // Netherite - Defense: 24, Toughness: 3.0, Knockback Resistance: 0.1
    public static final ArmorMaterial SAMURAI_NETHERITE = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false);

    public static final ArmorMaterial SAMURAI_NETHERITE_MASTER = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false);

    public static final ArmorMaterial SAMURAI_SCULK = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 22, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false);

    public static final ArmorMaterial SAMURAI_ETYRITE = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 23, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false);

    // ===== MYTHIC TIER (Best armor - rarest materials) =====
    // Defense: 28+, Toughness: 4.0+, Knockback Resistance: 0.15+
    public static final ArmorMaterial SAMURAI_TYR = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 28, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false);

    public static final ArmorMaterial SAMURAI_DRACO = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false);

    public static final ArmorMaterial SAMURAI_LIVING = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 11);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 11);
            }), 35, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.5F, 0.2F, false);

    public static final ArmorMaterial SAMURAI_NEPTUN = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 10);
            }), 26, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false);

    public static final ArmorMaterial SAMURAI_MAGE = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 24, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.5F, 0.1F, false);

    // ===== NINJA ARMORS =====
    public static final ArmorMaterial NINJA_IRON = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 15, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial NINJA_GOLD = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 3);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 25, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial NINJA_DIAMOND = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false);

    public static final ArmorMaterial NINJA_STEEL = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 16, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.5F, 0.0F, false);

    public static final ArmorMaterial NINJA_NETHERITE = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false);

    // ===== SPECIAL ARMORS =====
    public static final ArmorMaterial STRAW = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 2);
                map.put(ArmorType.CHESTPLATE, 3);
                map.put(ArmorType.HELMET, 1);
                map.put(ArmorType.BODY, 3);
            }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> null, List.of(), 0.0F, 0.0F, false);

    public static final ArmorMaterial CLOTH = new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 2);
                map.put(ArmorType.CHESTPLATE, 3);
                map.put(ArmorType.HELMET, 1);
                map.put(ArmorType.BODY, 3);
            }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> null, List.of(), 0.0F, 0.0F, false);

    /**
     * Called to trigger static initialization.
     */
    public static void register(IEventBus eventBus) {
        // Static initialization is triggered by class loading
    }
}
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 9, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_IRON_MASTER = ARMOR_MATERIALS.register("samurai_iron_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 6);
            }), 12, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 1.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_STEEL = ARMOR_MATERIALS.register("samurai_steel",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 10, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.5F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_SILVER = ARMOR_MATERIALS.register("samurai_silver",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 15, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_SILVER_MASTER = ARMOR_MATERIALS.register("samurai_silver_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 7);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 6);
            }), 18, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 1.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_BRASS = ARMOR_MATERIALS.register("samurai_brass",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 11, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_GOLD = ARMOR_MATERIALS.register("samurai_gold",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 3);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 3);
            }), 25, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_GOLD_MASTER = ARMOR_MATERIALS.register("samurai_gold_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 4);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 4);
            }), 30, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.5F, 0.0F, false));

    // ===== RARE TIER (Better than Diamond) =====
    // Ruby - Defense: 22, Toughness: 2.5
    public static final Holder<ArmorMaterial> SAMURAI_RUBY = ARMOR_MATERIALS.register("samurai_ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 12, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_RUBY_MASTER = ARMOR_MATERIALS.register("samurai_ruby_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.0F, 0.0F, false));

    // Jade - Defense: 21, Toughness: 2.0
    public static final Holder<ArmorMaterial> SAMURAI_JADE = ARMOR_MATERIALS.register("samurai_jade",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 13, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_JADE_MASTER = ARMOR_MATERIALS.register("samurai_jade_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false));

    // Aquamarine - Defense: 21, Toughness: 2.0
    public static final Holder<ArmorMaterial> SAMURAI_AQUA = ARMOR_MATERIALS.register("samurai_aqua",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 14, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_AQUA_MASTER = ARMOR_MATERIALS.register("samurai_aqua_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 17, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false));

    // Onyx - Defense: 22, Toughness: 2.5
    public static final Holder<ArmorMaterial> SAMURAI_ONYX = ARMOR_MATERIALS.register("samurai_onyx",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 8);
            }), 11, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_ONYX_MASTER = ARMOR_MATERIALS.register("samurai_onyx_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 9);
            }), 14, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.0F, 0.0F, false));

    // ===== EPIC TIER (Diamond-level) =====
    // Diamond - Defense: 20, Toughness: 2.0
    public static final Holder<ArmorMaterial> SAMURAI_DIAMOND = ARMOR_MATERIALS.register("samurai_diamond",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 11);
            }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_DIAMOND_MASTER = ARMOR_MATERIALS.register("samurai_diamond_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 12);
            }), 13, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.5F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_AMETHYST = ARMOR_MATERIALS.register("samurai_amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 11);
            }), 12, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> SAMURAI_QUARTZ = ARMOR_MATERIALS.register("samurai_quartz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 11);
            }), 11, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    // ===== LEGENDARY TIER (Netherite-level) =====
    // Netherite - Defense: 24, Toughness: 3.0, Knockback Resistance: 0.1
    public static final Holder<ArmorMaterial> SAMURAI_NETHERITE = ARMOR_MATERIALS.register("samurai_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 13);
            }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false));

    public static final Holder<ArmorMaterial> SAMURAI_NETHERITE_MASTER = ARMOR_MATERIALS.register("samurai_netherite_master",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 14);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false));

    public static final Holder<ArmorMaterial> SAMURAI_SCULK = ARMOR_MATERIALS.register("samurai_sculk",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 13);
            }), 16, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false));

    public static final Holder<ArmorMaterial> SAMURAI_ETYRITE = ARMOR_MATERIALS.register("samurai_etyrite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 13);
            }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false));

    // ===== MYTHIC TIER (Best armor - rarest materials) =====
    // Defense: 26+, Toughness: 4.0+, Knockback Resistance: 0.15+
    public static final Holder<ArmorMaterial> SAMURAI_TYR = ARMOR_MATERIALS.register("samurai_tyr",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 14);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false));

    public static final Holder<ArmorMaterial> SAMURAI_DRACO = ARMOR_MATERIALS.register("samurai_draco",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 14);
            }), 22, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false));

    public static final Holder<ArmorMaterial> SAMURAI_LIVING = ARMOR_MATERIALS.register("samurai_living",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 11);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 15);
            }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.5F, 0.2F, false));

    public static final Holder<ArmorMaterial> SAMURAI_NEPTUN = ARMOR_MATERIALS.register("samurai_neptun",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS, 8);
                map.put(ArmorType.CHESTPLATE, 10);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 14);
            }), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 4.0F, 0.15F, false));

    public static final Holder<ArmorMaterial> SAMURAI_MAGE = ARMOR_MATERIALS.register("samurai_mage",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 13);
            }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 3.5F, 0.1F, false));

    // ===== NINJA ARMORS =====
    public static final Holder<ArmorMaterial> NINJA_IRON = ARMOR_MATERIALS.register("ninja_iron",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 9, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> NINJA_GOLD = ARMOR_MATERIALS.register("ninja_gold",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 3);
                map.put(ArmorType.CHESTPLATE, 5);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }), 25, SoundEvents.ARMOR_EQUIP_GOLD, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> NINJA_DIAMOND = ARMOR_MATERIALS.register("ninja_diamond",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 11);
            }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> null, List.of(), 2.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> NINJA_STEEL = ARMOR_MATERIALS.register("ninja_steel",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 6);
            }), 10, SoundEvents.ARMOR_EQUIP_IRON, () -> null, List.of(), 0.5F, 0.0F, false));

    public static final Holder<ArmorMaterial> NINJA_NETHERITE = ARMOR_MATERIALS.register("ninja_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS, 7);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 13);
            }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> null, List.of(), 3.0F, 0.1F, false));

    // ===== SPECIAL ARMORS =====
    public static final Holder<ArmorMaterial> STRAW = ARMOR_MATERIALS.register("straw",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 2);
                map.put(ArmorType.CHESTPLATE, 3);
                map.put(ArmorType.HELMET, 1);
                map.put(ArmorType.BODY, 3);
            }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> null, List.of(), 0.0F, 0.0F, false));

    public static final Holder<ArmorMaterial> CLOTH = ARMOR_MATERIALS.register("cloth",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 1);
                map.put(ArmorType.LEGGINGS, 2);
                map.put(ArmorType.CHESTPLATE, 3);
                map.put(ArmorType.HELMET, 1);
                map.put(ArmorType.BODY, 3);
            }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> null, List.of(), 0.0F, 0.0F, false));

    /**
     * Called to trigger static initialization and register armor materials.
     */
    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
