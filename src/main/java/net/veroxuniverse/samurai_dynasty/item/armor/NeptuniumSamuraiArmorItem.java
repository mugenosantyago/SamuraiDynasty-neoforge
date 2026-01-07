package net.veroxuniverse.samurai_dynasty.item.armor;


import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

/**
 * Neptunium Samurai Armor - requires Aquaculture mod.
 * onArmorTick functionality removed in 1.21+, needs event-based implementation.
 */
public class NeptuniumSamuraiArmorItem extends SamuraiArmorItem {

    public NeptuniumSamuraiArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

}
