package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

/**
 * Placeholder for Blood Magic Living Armor integration.
 * Blood Magic is not yet available for NeoForge 1.21, so this is a simplified version.
 * When Blood Magic becomes available, this class should be updated to implement
 * ILivingContainer and ExpandedArmor interfaces.
 */
public class LivingSamuraiArmorItem extends SamuraiArmorItem {

    public LivingSamuraiArmorItem(Holder<ArmorMaterial> material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true; // Living armor makes piglins neutral
    }

}
