package net.veroxuniverse.samurai_dynasty.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.compat.DeeperDarkerCompat;
import net.veroxuniverse.samurai_dynasty.item.armor.lib.SamuraiArmorItem;
import net.veroxuniverse.samurai_dynasty.registry.ArmorMaterialsRegistry;

public class SculkSamuraiArmorItem extends SamuraiArmorItem {

    public SculkSamuraiArmorItem(Holder<ArmorMaterial> material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers() {
        ItemAttributeModifiers modifiers = super.getDefaultAttributeModifiers();
        
        // Add speed boost for leggings
        if (this.type == Type.LEGGINGS) {
            ItemAttributeModifiers.Builder builder = ItemAttributeModifiers.builder();
            modifiers.modifiers().forEach(entry -> builder.add(entry.attribute(), entry.modifier(), entry.slot()));
            builder.add(
                    Attributes.MOVEMENT_SPEED,
                    new AttributeModifier(
                            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "sculk_leggings_speed"),
                            0.05,
                            AttributeModifier.Operation.ADD_VALUE
                    ),
                    EquipmentSlotGroup.LEGS
            );
            return builder.build();
        }
        
        return modifiers;
    }

    // Note: In 1.21+, onArmorTick has been removed. This should be handled via
    // custom event handlers or inventory tick methods.
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide()) {
            if(player.getInventory().getArmor(EquipmentSlot.HEAD.getIndex()).is(DeeperDarkerCompat.SCULK_SAMURAI_HELMET.get())) {
                if(player.hasEffect(MobEffects.BLINDNESS)) player.removeEffect(MobEffects.BLINDNESS);
                if(player.hasEffect(MobEffects.DARKNESS)) player.removeEffect(MobEffects.DARKNESS);
            }
        }
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return this.materialHolder.is(ArmorMaterialsRegistry.SAMURAI_SCULK.unwrapKey().orElseThrow());
    }

}
