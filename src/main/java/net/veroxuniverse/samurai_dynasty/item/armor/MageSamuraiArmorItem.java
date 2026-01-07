package net.veroxuniverse.samurai_dynasty.item.armor;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

/**
 * Placeholder for Ars Nouveau Mage Armor integration.
 * When Ars Nouveau is available for NeoForge 1.21, this class should extend
 * ESAnimatedMagicArmor or AnimatedMagicArmor instead.
 */
public class MageSamuraiArmorItem extends SamuraiArmorItem {

    private int color = 0;

    public MageSamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    public int getColor(ItemStack stack) {
        return this.color;
    }

    // In 1.21.4, armor textures are handled via armor layers defined in ArmorMaterial
    // Custom texture overrides should be done via resource packs or data-driven armor models
}
