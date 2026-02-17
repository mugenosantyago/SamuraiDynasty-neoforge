package net.veroxuniverse.samurai_dynasty.mixin;

import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.veroxuniverse.samurai_dynasty.client.CurrentRenderingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {

    @Inject(
        method = "render(Lnet/minecraft/world/entity/Entity;DDDFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/renderer/entity/EntityRenderer;)V",
        at = @At("HEAD")
    )
    private void onRenderEntityHead(Entity entity, double camX, double camY, double camZ, float partialTick,
            com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.MultiBufferSource buffer,
            int packedLight, EntityRenderer<?, ? extends EntityRenderState> renderer, CallbackInfo ci) {
        if (entity instanceof LivingEntity living) {
            CurrentRenderingEntity.set(living);
        }
    }

    @Inject(
        method = "render(Lnet/minecraft/world/entity/Entity;DDDFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/renderer/entity/EntityRenderer;)V",
        at = @At("RETURN")
    )
    private void onRenderEntityReturn(Entity entity, double camX, double camY, double camZ, float partialTick,
            com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.MultiBufferSource buffer,
            int packedLight, EntityRenderer<?, ? extends EntityRenderState> renderer, CallbackInfo ci) {
        CurrentRenderingEntity.clear();
    }
}
