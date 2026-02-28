package net.veroxuniverse.samurai_dynasty.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.veroxuniverse.samurai_dynasty.client.CurrentRenderingEntity;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hide the hat layer (outer head skin overlay) when wearing a Samurai Dynasty 3D helmet.
 *
 * The injection must happen AFTER model.setupAnim() runs inside render(), because
 * setupAnim() resets hat.visible to whatever the player's skin settings say (usually true).
 * Injecting at HEAD would be overridden by setupAnim before renderToBuffer is called.
 *
 * We inject just before model.renderToBuffer() — which is called after setupAnim() — so
 * our hat.visible = false takes effect for that frame's render, then we restore it on RETURN.
 *
 * Entity access uses CurrentRenderingEntity (set by EntityRenderDispatcherMixin, which has
 * defaultRequire:1 and is always applied), not the old AzArmorRenderContext path which was
 * unreliable in 1.21.8.
 */
@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererHelmetMixin {

    @Shadow
    protected abstract EntityModel<? extends LivingEntityRenderState> getModel();

    @Unique
    private static final ThreadLocal<Boolean> samuraiDynasty$savedHat = new ThreadLocal<>();

    @Unique
    private boolean samuraiDynasty$shouldHideHat(LivingEntityRenderState state) {
        LivingEntity entity = CurrentRenderingEntity.get();
        if (entity == null) return false;
        ItemStack headStack = entity.getItemBySlot(EquipmentSlot.HEAD);
        if (headStack.isEmpty()) return false;
        if (!(headStack.getItem() instanceof SamuraiArmorItem item)) return false;
        if (item.getArmorType() != ArmorType.HELMET) return false;
        return AzArmorRendererRegistry.getOrNull(headStack) != null;
    }

    /**
     * Inject just before model.renderToBuffer() so we run after setupAnim() has finished
     * (setupAnim resets hat.visible based on player skin settings).
     */
    @Inject(
        method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/model/EntityModel;renderToBuffer(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"
        )
    )
    private void samuraiDynasty$beforeRenderToBuffer(
        LivingEntityRenderState state,
        PoseStack poseStack,
        MultiBufferSource buffer,
        int packedLight,
        CallbackInfo ci
    ) {
        if (!samuraiDynasty$shouldHideHat(state)) return;
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
        PoseStack poseStack,
        MultiBufferSource buffer,
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
