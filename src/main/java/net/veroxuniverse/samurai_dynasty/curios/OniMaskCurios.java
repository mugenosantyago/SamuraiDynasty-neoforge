package net.veroxuniverse.samurai_dynasty.curios;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

// TODO: Re-enable Curios integration when dependency is available
// This class has been stubbed to compile without Curios API
public class OniMaskCurios extends Item {
    public OniMaskCurios(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        // Curios tick replacement - only works when in inventory
        if (!(entity instanceof Player player)){
            return;
        }
        // Only apply effects if in offhand or main hand for now
        // Full Curios support will be re-added when dependency is available
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.add(Component.translatable("curios.samurai_dynasty.summary"));
            components.add(Component.literal(""));
            components.add(Component.translatable( "curios.samurai_dynasty.nightvision").withStyle(ChatFormatting.GRAY));
            components.add(Component.translatable("curios.samurai_dynasty.immune_slowness").withStyle(ChatFormatting.GRAY));
            components.add(Component.translatable("curios.samurai_dynasty.immune_wither").withStyle(ChatFormatting.GRAY));
        } else if (stack.getItem() == ItemsRegistry.ONI_MASK.get()) {
            components.add(Component.translatable("curios.samurai_dynasty.summary"));
        }

        super.appendHoverText(stack, context, components, flag);
    }
}
