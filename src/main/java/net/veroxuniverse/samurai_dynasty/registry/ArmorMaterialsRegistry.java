package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.neoforged.bus.api.IEventBus;

/**
 * Armor materials for NeoForge 1.21.4.
 * 
 * In 1.21.4, armor materials are plain records accessed via ArmorMaterials class.
 */
public class ArmorMaterialsRegistry {

    // Use vanilla armor materials as base
    // Custom armor textures can be implemented via resource packs/data generation

    // ===== NINJA ARMORS =====
    public static final ArmorMaterial NINJA_GOLD = ArmorMaterials.GOLD;
    public static final ArmorMaterial NINJA_IRON = ArmorMaterials.IRON;
    public static final ArmorMaterial NINJA_DIAMOND = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial NINJA_STEEL = ArmorMaterials.IRON;
    public static final ArmorMaterial NINJA_NETHERITE = ArmorMaterials.NETHERITE;

    // ===== SAMURAI ARMORS =====
    public static final ArmorMaterial SAMURAI_RUBY = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_RUBY_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_ONYX = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_ONYX_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_AQUA = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_AQUA_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_JADE = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_JADE_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_DIAMOND = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_DIAMOND_MASTER = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_SILVER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_SILVER_MASTER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_BRASS = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_NETHERITE = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_NETHERITE_MASTER = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_SCULK = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_AMETHYST = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_NEPTUN = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_ETYRITE = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_QUARTZ = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_GOLD = ArmorMaterials.GOLD;
    public static final ArmorMaterial SAMURAI_GOLD_MASTER = ArmorMaterials.GOLD;
    public static final ArmorMaterial SAMURAI_IRON = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_IRON_MASTER = ArmorMaterials.IRON;
    public static final ArmorMaterial SAMURAI_STEEL = ArmorMaterials.IRON;

    // ===== SPECIAL ARMORS =====
    public static final ArmorMaterial STRAW = ArmorMaterials.LEATHER;
    public static final ArmorMaterial SAMURAI_TYR = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial SAMURAI_DRACO = ArmorMaterials.NETHERITE;
    public static final ArmorMaterial CLOTH = ArmorMaterials.LEATHER;
    public static final ArmorMaterial SAMURAI_MAGE = ArmorMaterials.DIAMOND;
    public static final ArmorMaterial SAMURAI_LIVING = ArmorMaterials.NETHERITE;

    /**
     * Called to trigger static initialization.
     */
    public static void register(IEventBus eventBus) {
        // Static initialization is triggered by class loading
    }
}
