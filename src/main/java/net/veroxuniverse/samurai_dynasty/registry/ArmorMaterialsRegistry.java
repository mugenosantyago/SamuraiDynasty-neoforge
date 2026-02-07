package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.neoforged.bus.api.IEventBus;

/**
 * Armor materials for NeoForge 1.21.4.
 * 
 * Uses vanilla armor materials as base. Stats are customized per-armor-piece
 * in the SamuraiArmorItem class to provide proper progression.
 * 
 * Material Tiers (Defense values set in SamuraiArmorItem):
 * - Iron/Steel/Brass/Silver: 15 defense, 0-1 toughness
 * - Gold: 11 defense, 0 toughness, high enchantability
 * - Diamond: 20 defense, 2 toughness
 * - Ruby/Jade/Aqua/Onyx: 22 defense, 2.5 toughness (Rare tier)
 * - Netherite/Sculk/Etyrite: 24 defense, 3 toughness, 0.1 KB resist (Legendary)
 * - Tyr/Draco/Living/Neptunium/Mage: 28 defense, 4 toughness, 0.15 KB resist (Mythic)
 * - Master variants: +2 defense, +1 toughness over regular
 */
public class ArmorMaterialsRegistry {

    // ===== NINJA ARMORS =====
    public static final ArmorMaterial NINJA_GOLD = ArmorMaterials.GOLD;
    public static final ArmorMaterial NINJA_IRON = ArmorMaterials.IRON;
    public static final ArmorMaterial NINJA_DIAMOND = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial NINJA_STEEL = ArmorMaterials.IRON;
    public static final ArmorMaterial NINJA_NETHERITE = ArmorMaterials.NETHERITE;

    // ===== SAMURAI ARMORS =====
    // Rare Gems (Better than Diamond)
    public static final ArmorMaterial SAMURAI_RUBY = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_RUBY_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_ONYX = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_ONYX_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_AQUA = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_AQUA_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_JADE = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_JADE_MASTER = ArmorMaterials.DIAMOND;
    
    // Epic Tier
    public static final ArmorMaterial SAMURAI_DIAMOND = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_DIAMOND_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_AMETHYST = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_QUARTZ = ArmorMaterials.DIAMOND;
    
    // Basic Tier
    public static final ArmorMaterial SAMURAI_SILVER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_SILVER_MASTER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_BRASS = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_GOLD = ArmorMaterials.GOLD;
    public static final ArmorMaterial SAMURAI_GOLD_MASTER = ArmorMaterials.GOLD;
    public static final ArmorMaterial SAMURAI_IRON = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_IRON_MASTER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_STEEL = ArmorMaterials.IRON;
    
    // Legendary Tier
    public static final ArmorMaterial SAMURAI_NETHERITE = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_NETHERITE_MASTER = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_SCULK = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_ETYRITE = ArmorMaterials.NETHERITE;
    
    // Mythic Tier (Compat mods - highest stats)
    public static final ArmorMaterial SAMURAI_NEPTUN = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_TYR = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_DRACO = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_LIVING = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_MAGE = ArmorMaterials.NETHERITE;

    // ===== SPECIAL ARMORS =====
    public static final ArmorMaterial STRAW = ArmorMaterials.LEATHER;
    public static final ArmorMaterial CLOTH = ArmorMaterials.LEATHER;

    /**
     * Called to trigger static initialization.
     */
    public static void register(IEventBus eventBus) {
        // Static initialization is triggered by class loading
    }
}
