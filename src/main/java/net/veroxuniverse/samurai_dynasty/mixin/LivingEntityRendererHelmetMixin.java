package net.veroxuniverse.samurai_dynasty.mixin;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hide the hat layer (outer head skin overlay) when wearing a Samurai Dynasty helmet.
 * Without this the player's second-skin hat mesh renders on top of the 3D helmet and
 * shows through it at the top of the head.
 *
 * Previously this mixin relied on AzArmorRenderContext.getCurrentEntity(), which was set
 * by MixinLivingEntityRenderer.extractRenderState (require=0 — silently absent in 1.21.8).
 * That meant entity was always null and the hat was never hidden.
 *
 * Now we read headEquipment directly from the HumanoidRenderState that is passed as a
 * parameter to render(), which is always available.
 */
@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererHelmetMixin {

    @Shadow
    protected abstract EntityModel<? extends LivingEntityRenderState> getModel();

    @Unique
    private static final ThreadLocal<Boolean> samuraiDynasty$savedHat = new ThreadLocal<>();

    @Inject(
        method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
        at = @At("HEAD")
    )
    private void samuraiDynasty$onRenderHead(
        LivingEntityRenderState state,
        com.mojang.blaze3d.vertex.PoseStack poseStack,
        net.minecraft.client.renderer.MultiBufferSource buffer,
        int packedLight,
        CallbackInfo ci
    ) {
        if (!(state instanceof HumanoidRenderState humanoidState)) return;

        ItemStack headStack = humanoidState.headEquipment;
        if (headStack == null || headStack.isEmpty()) return;
        if (!(headStack.getItem() instanceof SamuraiArmorItem item) || item.getArmorType() != ArmorType.HELMET) return;
        if (AzArmorRendererRegistry.getOrNull(headStack) == null) return;

        EntityModel<?> model = getModel();
        if (model instanceof HumanoidModel<?> humanoid) {
            samuraiDynasty$savedHat.set(humanoid.hat.visible);
            humanoid.hat.visible = false;
        }
    }

    @Inject(
        method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
        at = @At("RETURN")
    )
    private void samuraiDynasty$onRenderReturn(
        LivingEntityRenderState state,
        com.mojang.blaze3d.vertex.PoseStack poseStack,
        net.minecraft.client.renderer.MultiBufferSource buffer,
        int packedLight,
        CallbackInfo ci
    ) {
        Boolean savedHat = samuraiDynasty$savedHat.get();
        if (savedHat == null) return;
        EntityModel<?> model = getModel();
        if (model instanceof HumanoidModel<?> humanoid) {
            humanoid.hat.visible = savedHat;
        }
        samuraiDynasty$savedHat.remove();
    }
}
