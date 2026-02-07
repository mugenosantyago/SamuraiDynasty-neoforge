package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
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
        
        // Calculate durability based on material durability multiplier
        int durabilityMultiplier = material.durability();
        int baseDurability = type.getDurability(durabilityMultiplier);
        
        ItemAttributeModifiers.Builder attributeBuilder = ItemAttributeModifiers.builder();
        
        // Get defense from material (uses the material's defense values per armor type)
        int defense = material.getDefense(type);
        
        attributeBuilder.add(
                Attributes.ARMOR,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_" + type.getName()),
                        defense,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add armor toughness from material
        float toughness = material.toughness();
        attributeBuilder.add(
                Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_toughness_" + type.getName()),
                        toughness,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add knockback resistance if material has it
        float knockbackResistance = material.knockbackResistance();
        if (knockbackResistance > 0) {
            attributeBuilder.add(
                    Attributes.KNOCKBACK_RESISTANCE,
                    new AttributeModifier(
                            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_knockback_resistance"),
                            knockbackResistance,
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
}
