package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

public class IronNinjaArmorItem extends SamuraiArmorItem {
    public IronNinjaArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

    // Note: In 1.21.8, onArmorTick has been removed
    // Armor effects should be handled via custom event handlers or the equip component system
    // This method is kept for reference but not called
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide()) {
            ItemStack leggingsStack = player.getItemBySlot(EquipmentSlot.LEGS);
            if(leggingsStack.is(ItemsRegistry.NINJA_LEGGINGS.get())){
                player.addEffect(new MobEffectInstance(MobEffects.SPEED, 20, 0, false, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 20, 0, false, false, false));
            }
        }
    }
}
