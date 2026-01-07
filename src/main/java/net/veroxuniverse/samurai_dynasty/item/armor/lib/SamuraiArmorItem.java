package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class SamuraiArmorItem extends ArmorItem {

    protected final ArmorMaterial armorMaterial;

    public SamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
        this.armorMaterial = material;
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    public ArmorMaterial getArmorMaterial() {
        return this.armorMaterial;
    }
}
