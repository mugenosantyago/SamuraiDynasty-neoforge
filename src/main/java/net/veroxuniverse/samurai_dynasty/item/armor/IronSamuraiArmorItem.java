package net.veroxuniverse.samurai_dynasty.item.armor;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry;

public class IronSamuraiArmorItem extends SamuraiArmorItem {

    public IronSamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return this.materialHolder.is(ArmorMaterialsRegistry.SAMURAI_IRON.unwrapKey().orElseThrow());
    }

}
