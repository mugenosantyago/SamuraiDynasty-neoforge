package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

/**
 * Base armor item class for Samurai Dynasty.
 * In 1.21.8, ArmorItem was removed, so armor is now just Items with equipment properties.
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
        
        // Add armor attributes
        ItemAttributeModifiers.Builder attributeBuilder = ItemAttributeModifiers.builder();
        
        // Add armor defense
        attributeBuilder.add(
                Attributes.ARMOR,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_" + type.getName()),
                        material.defense().getOrDefault(type, 0),
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add armor toughness
        if (material.toughness() > 0) {
            attributeBuilder.add(
                    Attributes.ARMOR_TOUGHNESS,
                    new AttributeModifier(
                            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_toughness_" + type.getName()),
                            material.toughness(),
                            AttributeModifier.Operation.ADD_VALUE
                    ),
                    EquipmentSlotGroup.bySlot(slot)
            );
        }
        
        // Add knockback resistance
        if (material.knockbackResistance() > 0) {
            attributeBuilder.add(
                    Attributes.KNOCKBACK_RESISTANCE,
                    new AttributeModifier(
                            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_knockback_resistance_" + type.getName()),
                            material.knockbackResistance(),
                            AttributeModifier.Operation.ADD_VALUE
                    ),
                    EquipmentSlotGroup.bySlot(slot)
            );
        }
        
        return properties
                .durability(material.durability(type))
                .attributes(attributeBuilder.build());
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
    
    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return armorMaterial.enchantmentValue();
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return armorMaterial.repairIngredient().get().test(repairCandidate);
    }
}
