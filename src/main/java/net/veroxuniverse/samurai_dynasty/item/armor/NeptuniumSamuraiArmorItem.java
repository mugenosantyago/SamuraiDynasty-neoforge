package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;

import javax.annotation.Nonnull;

public class NeptuniumSamuraiArmorItem extends SamuraiArmorItem {

    // Note: In 1.21+, onArmorTick has been removed. This should be handled via
    // custom event handlers or inventory tick methods.
    public void onArmorTick(@Nonnull ItemStack stack, Level world, Player player) {
        // Check if player is in water using the fluid tags system
        if (player.isEyeInFluid(FluidTags.WATER)) {
            if (this.type == Type.HELMET) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 0, false, false, false));
            } else if (this.type == Type.CHESTPLATE) {
                player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 0, false, false, false));
            } else if (this.type == Type.BOOTS) {
                player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 0, false, false, false));
            }
        }
    }

    public NeptuniumSamuraiArmorItem(Holder<ArmorMaterial> material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

}
