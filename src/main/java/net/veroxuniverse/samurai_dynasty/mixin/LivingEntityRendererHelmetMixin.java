package net.veroxuniverse.samurai_dynasty.mixin;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorType;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hide the player head and hat when wearing a Samurai Dynasty helmet so only the 3D helmet shows.
 * We run inside the render method; entity comes from AzureLib context (set in extractRenderState).
 */
@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererHelmetMixin {

    @Shadow
    protected abstract EntityModel<? extends LivingEntityRenderState> getModel();

    @Unique
    private static final ThreadLocal<Boolean> samuraiDynasty$savedHat = new ThreadLocal<>();
    @Unique
    private static final ThreadLocal<Boolean> samuraiDynasty$savedHead = new ThreadLocal<>();

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
        LivingEntity entity = mod.azure.azurelib.common.render.armor.AzArmorRenderContext.getCurrentEntity();
        if (entity == null) return;
        if (!(entity.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof SamuraiArmorItem item) || item.getArmorType() != ArmorType.HELMET) {
            return;
        }
        EntityModel<?> model = getModel();
        if (model instanceof HumanoidModel<?> humanoid) {
            samuraiDynasty$savedHat.set(humanoid.hat.visible);
            samuraiDynasty$savedHead.set(humanoid.head.visible);
            humanoid.hat.visible = false;
            humanoid.head.visible = false;
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
        Boolean savedHead = samuraiDynasty$savedHead.get();
        if (savedHat == null && savedHead == null) return;
        EntityModel<?> model = getModel();
        if (model instanceof HumanoidModel<?> humanoid) {
            if (savedHat != null) humanoid.hat.visible = savedHat;
            if (savedHead != null) humanoid.head.visible = savedHead;
        }
        samuraiDynasty$savedHat.remove();
        samuraiDynasty$savedHead.remove();
    }
}
