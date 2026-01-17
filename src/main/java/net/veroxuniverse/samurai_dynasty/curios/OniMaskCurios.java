package net.veroxuniverse.samurai_dynasty.curios;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.Equippable;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

import java.util.function.Consumer;

// TODO: Re-enable Curios integration when dependency is available
public class OniMaskCurios extends Item {
    public OniMaskCurios(Properties pProperties) {
        super(pProperties
                .component(DataComponents.EQUIPPABLE, 
                    Equippable.builder(EquipmentSlot.HEAD)
                        .setEquipSound(SoundEvents.ARMOR_EQUIP_LEATHER)
                        .build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.accept(Component.translatable("curios.samurai_dynasty.summary"));
            components.accept(Component.literal(""));
            components.accept(Component.translatable("curios.samurai_dynasty.nightvision").withStyle(ChatFormatting.GRAY));
            components.accept(Component.translatable("curios.samurai_dynasty.immune_slowness").withStyle(ChatFormatting.GRAY));
            components.accept(Component.translatable("curios.samurai_dynasty.immune_wither").withStyle(ChatFormatting.GRAY));
        } else if (stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.accept(Component.translatable("curios.samurai_dynasty.summary"));
        }
    }
}
