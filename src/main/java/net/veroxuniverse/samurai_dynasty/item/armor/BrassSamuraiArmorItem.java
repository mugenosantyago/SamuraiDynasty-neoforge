package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.veroxuniverse.samurai_dynasty.compat.CreateCompat;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BrassSamuraiArmorItem extends SamuraiArmorItem {

    private static final List<Predicate<Player>> IS_WEARING_PREDICATES = new ArrayList<>();

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == CreateCompat.BRASS_SAMURAI_HELMET.get()) {
            components.add(Component.literal("§8Hold [§7Shift§8] for Summary"));
            components.add(Component.literal(""));
            components.add(Component.literal("§7Enhanced with §bEngineer's Goggles§7.").withStyle(ChatFormatting.GRAY));
         } else if (stack.getItem() == CreateCompat.BRASS_SAMURAI_HELMET.get()) {
            components.add(Component.literal("§8Hold [§7Shift§8] for Summary"));
        }

        super.appendHoverText(stack, context, components, flag);
    }

    public BrassSamuraiArmorItem(Holder<ArmorMaterial> material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

}
