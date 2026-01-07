package net.veroxuniverse.samurai_dynasty.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class OniKatanaItem extends ESWeaponItem {
    public OniKatanaItem(ToolMaterial pTier, float pAttackDamage, float pAttackSpeed, Properties pProperties) {
        super(pTier, pAttackDamage, pAttackSpeed, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @NotNull Item.TooltipContext context, @NotNull TooltipDisplay tooltipDisplay, @NotNull Consumer<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == ItemsRegistry.KATANA_ONI.get()) {
            components.accept(Component.literal("§8Hold [§7Shift§8] for Summary"));
            components.accept(Component.literal(""));
            components.accept(Component.literal("§7Applies §bFlames§7 on hit.").withStyle(ChatFormatting.GRAY));
            components.accept(Component.literal("§7Applies §bSlowness§7 on hit.").withStyle(ChatFormatting.GRAY));
            components.accept(Component.literal(""));
            components.accept(Component.literal("§7Ability [§eRight-Click§7]"));
            components.accept(Component.literal("§7Applies §bFire Resistance§7.").withStyle(ChatFormatting.GRAY));
        } else if (stack.getItem() == ItemsRegistry.KATANA_ONI.get()) {
            components.accept(Component.literal("§8Hold [§7Shift§8] for Summary"));
        }
    }

    public @NotNull InteractionResult use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        if (pHand == InteractionHand.MAIN_HAND) {
            pPlayer.getCooldowns().addCooldown(itemstack, 600);
            pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.NEUTRAL, 1.0F, 1.0F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0, false, false, false), pPlayer);
        }

        return InteractionResult.SUCCESS;
    }

    // Note: onLeftClickEntity removed due to 1.21.8 API changes
    // Attack effects are now handled through the damage system
}
