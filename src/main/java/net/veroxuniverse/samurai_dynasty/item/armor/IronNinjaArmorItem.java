package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

/**
 * Iron Ninja Armor
 * 
 * Armor effects (Speed and Jump Boost) are now handled via event handlers in ModEvents.java
 * See: ModEvents.ForgeEvents.onEntityTick() for the implementation
 */
public class IronNinjaArmorItem extends SamuraiArmorItem {
    public IronNinjaArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }
}
