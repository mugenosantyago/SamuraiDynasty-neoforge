package net.veroxuniverse.samurai_dynasty.item.armor;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry;

public class SculkSamuraiArmorItem extends SamuraiArmorItem {
    
    private final ArmorType armorType;

    public SculkSamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
        this.armorType = type;
    }

    // Note: In 1.21.4, getDefaultAttributeModifiers takes ItemStack parameter
    // Custom attribute modifiers should be set via Item.Properties in the constructor

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return this.armorMaterial == ArmorMaterialsRegistry.SAMURAI_SCULK;
    }

}
