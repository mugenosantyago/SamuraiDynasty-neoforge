package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
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
        
        // Add armor attributes - use default durability based on type
        int baseDurability = switch (type) {
            case BOOTS -> 195;
            case LEGGINGS -> 225;
            case CHESTPLATE -> 240;
            case HELMET -> 165;
            case BODY -> 240;
        };
        
        ItemAttributeModifiers.Builder attributeBuilder = ItemAttributeModifiers.builder();
        
        // Add armor defense - use default values
        int defense = switch (type) {
            case BOOTS -> 2;
            case LEGGINGS -> 5;
            case CHESTPLATE -> 6;
            case HELMET -> 2;
            case BODY -> 6;
        };
        
        attributeBuilder.add(
                Attributes.ARMOR,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_" + type.getName()),
                        defense,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add armor toughness (default 2.0 for iron-level armor)
        attributeBuilder.add(
                Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "armor_toughness_" + type.getName()),
                        2.0,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.bySlot(slot)
        );
        
        // Add equippable component so armor can be equipped
        // Note: Visual rendering requires armor textures in assets/samurai_dynasty/textures/models/armor/
        // Or AzureLib for 3D animated models (not yet available for 1.21.8)
        Equippable equippable = Equippable.builder(slot)
                .setEquipSound(Holder.direct(SoundEvents.ARMOR_EQUIP_IRON.value()))
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
