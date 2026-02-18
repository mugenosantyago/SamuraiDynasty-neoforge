package net.veroxuniverse.samurai_dynasty.client.item;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.samurai_dynasty.item.YumiBow;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;
import org.jetbrains.annotations.Nullable;

/**
 * Item model property that returns bow pull progress (0–1) for Yumi so range_dispatch can show pulling models.
 */
public record YumiPullProperty() implements RangeSelectItemModelProperty {

    public static final MapCodec<YumiPullProperty> MAP_CODEC = MapCodec.unit(new YumiPullProperty());

    @Override
    public float get(ItemStack stack, @Nullable ClientLevel level, @Nullable LivingEntity entity, int seed) {
        if (entity == null || !stack.is(ItemsRegistry.YUMI.get())) return 0.0F;
        if (entity.getUseItem() != stack) return 0.0F;
        int duration = stack.getItem().getUseDuration(stack, entity);
        int remaining = entity.getUseItemRemainingTicks();
        int charge = duration - remaining;
        return YumiBow.getPowerForTime(charge);
    }

    @Override
    public MapCodec<YumiPullProperty> type() {
        return MAP_CODEC;
    }
}
