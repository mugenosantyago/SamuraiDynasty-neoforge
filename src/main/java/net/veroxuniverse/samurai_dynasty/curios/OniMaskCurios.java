package net.veroxuniverse.samurai_dynasty.curios;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

import java.util.List;

// TODO: Re-enable Curios integration when dependency is available
public class OniMaskCurios extends Item {
    public OniMaskCurios(Properties pProperties) {
        super(pProperties);
    }

    // Note: inventoryTick method removed due to 1.21.8 API changes
    // Curios effects will be re-enabled when Curios is available

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.add(Component.translatable("curios.samurai_dynasty.summary"));
            components.add(Component.literal(""));
            components.add(Component.translatable("curios.samurai_dynasty.nightvision").withStyle(ChatFormatting.GRAY));
            components.add(Component.translatable("curios.samurai_dynasty.immune_slowness").withStyle(ChatFormatting.GRAY));
            components.add(Component.translatable("curios.samurai_dynasty.immune_wither").withStyle(ChatFormatting.GRAY));
        } else if (stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.add(Component.translatable("curios.samurai_dynasty.summary"));
        }
    }
}
