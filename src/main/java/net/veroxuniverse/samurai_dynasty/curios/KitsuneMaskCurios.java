package net.veroxuniverse.samurai_dynasty.curios;

import mod.azure.azurelib.common.api.AzRenderable;
import mod.azure.azurelib.common.render.RenderProvider;
import mod.azure.azurelib.common.render.armor.AzArmorRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.Equippable;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

import java.util.function.Consumer;

// TODO: Re-enable Curios integration when dependency is available
public class KitsuneMaskCurios extends Item implements AzRenderable {
    public KitsuneMaskCurios(Properties pProperties) {
        super(pProperties
                .component(DataComponents.EQUIPPABLE, 
                    Equippable.builder(EquipmentSlot.HEAD)
                        .setEquipSound(SoundEvents.ARMOR_EQUIP_LEATHER)
                        .build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown() && stack.getItem() == ItemsRegistry.KITSUNE_MASK.get()) {
            components.accept(Component.translatable("curios.samurai_dynasty.summary"));
            components.accept(Component.literal(""));
            components.accept(Component.translatable("curios.samurai_dynasty.speed").withStyle(ChatFormatting.GRAY));
            components.accept(Component.translatable("curios.samurai_dynasty.immune_slowness").withStyle(ChatFormatting.GRAY));
        } else if (stack.getItem() == ItemsRegistry.KITSUNE_MASK.get()) {
            components.accept(Component.translatable("curios.samurai_dynasty.summary"));
        }
    }

    @Override
    public void createRenderer(Consumer<RenderProvider> consumer) {
        consumer.accept(new RenderProvider() {
            private AzArmorRenderer renderer = null;

            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                    EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null) {
                    this.renderer = mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry.getOrNull(itemStack);
                }
                if (this.renderer != null) {
                    this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                    return (HumanoidModel<?>) this.renderer.rendererPipeline().armorModel();
                }
                return original;
            }
        });
    }
}
