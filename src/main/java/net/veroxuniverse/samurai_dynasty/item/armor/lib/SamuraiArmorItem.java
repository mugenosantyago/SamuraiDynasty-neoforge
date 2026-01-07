package net.veroxuniverse.samurai_dynasty.item.armor.lib;

import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class SamuraiArmorItem extends ArmorItem {

    protected final Holder<ArmorMaterial> materialHolder;

    public SamuraiArmorItem(Holder<ArmorMaterial> material, ArmorType type, Properties properties) {
        super(material, type, properties);
        this.materialHolder = material;
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    public Holder<ArmorMaterial> getMaterialHolder() {
        return this.materialHolder;
    }
}
