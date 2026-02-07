package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Base armor item class for Samurai Dynasty.
 * In 1.21.8, ArmorItem was removed, so armor is now just Items with equipment properties.
 * 
 * Custom stat progression based on material tier (defense shown for full set):
 * - Basic (Iron/Steel/Brass/Silver): 15 defense, 0 toughness
 * - Basic Master: 19 defense, 1 toughness  
 * - Gold: 11 defense, 0 toughness, high enchantability
 * - Gold Master: 15 defense, 0.5 toughness
 * - Diamond: 20 defense, 2 toughness
 * - Rare Gems (Ruby/Jade/Aqua/Onyx): 22 defense, 2.5 toughness
 * - Rare Master: 26 defense, 3.5 toughness, 0.05 KB resist
 * - Netherite: 24 defense, 3 toughness, 0.1 KB resist
 * - Netherite Master: 28 defense, 4 toughness, 0.15 KB resist
 * - Mythic (Tyr/Draco/Living/etc): 29 defense, 4 toughness, 0.15 KB resist
 */
public class SamuraiArmorItem extends Item {

    protected final ArmorMaterial armorMaterial;
    protected final ArmorType armorType;

    public SamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(createArmorProperties(material, type, properties));
        this.armorMaterial = material;
        this.armorType = type;
    }

    private static Properties createArmorProperties(ArmorMaterial material, ArmorType type, Properties properties) {
        EquipmentSlot slot = type.getSlot();
        
        // Calculate durability based on material durability multiplier
        int durabilityMultiplier = material.durability();
        int baseDurability = type.getDurability(durabilityMultiplier);
        
        ItemAttributeModifiers.Builder attributeBuilder = ItemAttributeModifiers.builder();
        
        // Get custom defense based on material tier
        ArmorStats stats = getArmorStats(material, type);
        
        attributeBuilder.add(
                Attributes.ARMOR,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_" + type.getName()),
                        stats.defense,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add armor toughness
        attributeBuilder.add(
                Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_toughness_" + type.getName()),
                        stats.toughness,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add knockback resistance for high-tier materials
        if (stats.knockbackResistance > 0) {
            attributeBuilder.add(
                    Attributes.KNOCKBACK_RESISTANCE,
                    new AttributeModifier(
                            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_knockback_resistance"),
                            stats.knockbackResistance,
                            AttributeModifier.Operation.ADD_VALUE
                    ),
                    EquipmentSlotGroup.bySlot(slot)
            );
        }
        
        // Add equippable component so armor can be equipped
        // Use empty equipment asset to prevent vanilla 2D layer from rendering
        ResourceKey<EquipmentAsset> emptyAsset = ResourceKey.create(
                ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath("minecraft", "equipment_asset")),
                ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "empty")
        );
        
        Equippable equippable = Equippable.builder(slot)
                .setEquipSound(material.equipSound())
                .setAsset(emptyAsset)  // Empty asset = no vanilla rendering
                .build();
        
        return properties
                .durability(baseDurability)
                .attributes(attributeBuilder.build())
                .component(net.minecraft.core.component.DataComponents.EQUIPPABLE, equippable);
    }

    /**
     * Get custom armor stats based on material and type.
     * Different materials have different stat progressions based on rarity.
     */
    private static ArmorStats getArmorStats(ArmorMaterial material, ArmorType type) {
        // Check material by object equality to determine tier
        MaterialTier tier = getMaterialTier(material);
        
        return switch (tier) {
            case IRON -> switch (type) {
                case HELMET -> new ArmorStats(2, 0.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(6, 0.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(5, 0.0f, 0.0f);
                case BOOTS -> new ArmorStats(2, 0.0f, 0.0f);
                default -> new ArmorStats(5, 0.0f, 0.0f);
            };
            case IRON_MASTER -> switch (type) {
                case HELMET -> new ArmorStats(3, 1.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(7, 1.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(6, 1.0f, 0.0f);
                case BOOTS -> new ArmorStats(3, 1.0f, 0.0f);
                default -> new ArmorStats(6, 1.0f, 0.0f);
            };
            case GOLD -> switch (type) {
                case HELMET -> new ArmorStats(2, 0.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(5, 0.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(3, 0.0f, 0.0f);
                case BOOTS -> new ArmorStats(1, 0.0f, 0.0f);
                default -> new ArmorStats(3, 0.0f, 0.0f);
            };
            case GOLD_MASTER -> switch (type) {
                case HELMET -> new ArmorStats(3, 0.5f, 0.0f);
                case CHESTPLATE -> new ArmorStats(6, 0.5f, 0.0f);
                case LEGGINGS -> new ArmorStats(4, 0.5f, 0.0f);
                case BOOTS -> new ArmorStats(2, 0.5f, 0.0f);
                default -> new ArmorStats(4, 0.5f, 0.0f);
            };
            case RARE_GEM -> switch (type) {
                case HELMET -> new ArmorStats(4, 2.5f, 0.0f);
                case CHESTPLATE -> new ArmorStats(9, 2.5f, 0.0f);
                case LEGGINGS -> new ArmorStats(6, 2.5f, 0.0f);
                case BOOTS -> new ArmorStats(3, 2.5f, 0.0f);
                default -> new ArmorStats(8, 2.5f, 0.0f);
            };
            case RARE_GEM_MASTER -> switch (type) {
                case HELMET -> new ArmorStats(5, 3.5f, 0.05f);
                case CHESTPLATE -> new ArmorStats(10, 3.5f, 0.05f);
                case LEGGINGS -> new ArmorStats(7, 3.5f, 0.05f);
                case BOOTS -> new ArmorStats(4, 3.5f, 0.05f);
                default -> new ArmorStats(9, 3.5f, 0.05f);
            };
            case DIAMOND -> switch (type) {
                case HELMET -> new ArmorStats(3, 2.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(8, 2.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(6, 2.0f, 0.0f);
                case BOOTS -> new ArmorStats(3, 2.0f, 0.0f);
                default -> new ArmorStats(8, 2.0f, 0.0f);
            };
            case DIAMOND_MASTER -> switch (type) {
                case HELMET -> new ArmorStats(4, 3.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(9, 3.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(7, 3.0f, 0.0f);
                case BOOTS -> new ArmorStats(4, 3.0f, 0.0f);
                default -> new ArmorStats(9, 3.0f, 0.0f);
            };
            case NETHERITE -> switch (type) {
                case HELMET -> new ArmorStats(4, 3.0f, 0.1f);
                case CHESTPLATE -> new ArmorStats(9, 3.0f, 0.1f);
                case LEGGINGS -> new ArmorStats(7, 3.0f, 0.1f);
                case BOOTS -> new ArmorStats(4, 3.0f, 0.1f);
                default -> new ArmorStats(9, 3.0f, 0.1f);
            };
            case NETHERITE_MASTER -> switch (type) {
                case HELMET -> new ArmorStats(5, 4.0f, 0.15f);
                case CHESTPLATE -> new ArmorStats(10, 4.0f, 0.15f);
                case LEGGINGS -> new ArmorStats(8, 4.0f, 0.15f);
                case BOOTS -> new ArmorStats(5, 4.0f, 0.15f);
                default -> new ArmorStats(10, 4.0f, 0.15f);
            };
            case MYTHIC -> switch (type) {
                case HELMET -> new ArmorStats(5, 4.0f, 0.15f);
                case CHESTPLATE -> new ArmorStats(11, 4.0f, 0.15f);
                case LEGGINGS -> new ArmorStats(8, 4.0f, 0.15f);
                case BOOTS -> new ArmorStats(5, 4.0f, 0.15f);
                default -> new ArmorStats(10, 4.0f, 0.15f);
            };
            case LEATHER -> switch (type) {
                case HELMET -> new ArmorStats(1, 0.0f, 0.0f);
                case CHESTPLATE -> new ArmorStats(3, 0.0f, 0.0f);
                case LEGGINGS -> new ArmorStats(2, 0.0f, 0.0f);
                case BOOTS -> new ArmorStats(1, 0.0f, 0.0f);
                default -> new ArmorStats(2, 0.0f, 0.0f);
            };
        };
    }
    
    /**
     * Determine material tier based on object reference.
     */
    private static MaterialTier getMaterialTier(ArmorMaterial material) {
        // Check by object equality
        if (material == ArmorMaterialsRegistry.SAMURAI_IRON || 
            material == ArmorMaterialsRegistry.SAMURAI_STEEL ||
            material == ArmorMaterialsRegistry.SAMURAI_BRASS ||
            material == ArmorMaterialsRegistry.SAMURAI_SILVER ||
            material == ArmorMaterialsRegistry.NINJA_IRON ||
            material == ArmorMaterialsRegistry.NINJA_STEEL ||
            material == ArmorMaterials.IRON) {
            return MaterialTier.IRON;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_IRON_MASTER ||
            material == ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER) {
            return MaterialTier.IRON_MASTER;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_GOLD ||
            material == ArmorMaterialsRegistry.NINJA_GOLD ||
            material == ArmorMaterials.GOLD) {
            return MaterialTier.GOLD;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER) {
            return MaterialTier.GOLD_MASTER;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_RUBY ||
            material == ArmorMaterialsRegistry.SAMURAI_JADE ||
            material == ArmorMaterialsRegistry.SAMURAI_AQUA ||
            material == ArmorMaterialsRegistry.SAMURAI_ONYX) {
            return MaterialTier.RARE_GEM;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER ||
            material == ArmorMaterialsRegistry.SAMURAI_JADE_MASTER ||
            material == ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER ||
            material == ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER) {
            return MaterialTier.RARE_GEM_MASTER;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_DIAMOND ||
            material == ArmorMaterialsRegistry.SAMURAI_AMETHYST ||
            material == ArmorMaterialsRegistry.SAMURAI_QUARTZ ||
            material == ArmorMaterialsRegistry.NINJA_DIAMOND ||
            material == ArmorMaterials.DIAMOND) {
            return MaterialTier.DIAMOND;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER) {
            return MaterialTier.DIAMOND_MASTER;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_NETHERITE ||
            material == ArmorMaterialsRegistry.SAMURAI_SCULK ||
            material == ArmorMaterialsRegistry.SAMURAI_ETYRITE ||
            material == ArmorMaterialsRegistry.NINJA_NETHERITE ||
            material == ArmorMaterials.NETHERITE) {
            return MaterialTier.NETHERITE;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER) {
            return MaterialTier.NETHERITE_MASTER;
        }
        if (material == ArmorMaterialsRegistry.SAMURAI_TYR ||
            material == ArmorMaterialsRegistry.SAMURAI_DRACO ||
            material == ArmorMaterialsRegistry.SAMURAI_LIVING ||
            material == ArmorMaterialsRegistry.SAMURAI_NEPTUN ||
            material == ArmorMaterialsRegistry.SAMURAI_MAGE) {
            return MaterialTier.MYTHIC;
        }
        if (material == ArmorMaterialsRegistry.STRAW ||
            material == ArmorMaterialsRegistry.CLOTH ||
            material == ArmorMaterials.LEATHER) {
            return MaterialTier.LEATHER;
        }
        
        return MaterialTier.IRON; // Default
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    public ArmorMaterial getArmorMaterial() {
        return this.armorMaterial;
    }
    
    public ArmorType getArmorType() {
        return this.armorType;
    }
    
    /**
     * Record to hold armor stats (defense, toughness, knockback resistance)
     */
    private record ArmorStats(int defense, float toughness, float knockbackResistance) {
    }
    
    /**
     * Material tier enum for determining armor stats
     */
    private enum MaterialTier {
        LEATHER,
        IRON,
        IRON_MASTER,
        GOLD,
        GOLD_MASTER,
        DIAMOND,
        DIAMOND_MASTER,
        RARE_GEM,          // Ruby, Jade, Aqua, Onyx
        RARE_GEM_MASTER,   // Master variants of rare gems
        NETHERITE,
        NETHERITE_MASTER,
        MYTHIC             // Tyr, Draco, Living, Neptunium, Mage
    }
}
