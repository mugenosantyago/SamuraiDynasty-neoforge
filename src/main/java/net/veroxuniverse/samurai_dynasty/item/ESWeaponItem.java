package net.veroxuniverse.samurai_dynasty.item;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Base weapon item class for Samurai Dynasty.
 * In 1.21.8, SwordItem was removed, so weapons are now just Items with attack attributes.
 */
public class ESWeaponItem extends Item {

    protected final ToolMaterial toolMaterial;

    public ESWeaponItem(ToolMaterial pTier, float pAttackDamage, float pAttackSpeed, Properties pProperties) {
        super(pProperties.attributes(createAttributes(pTier, pAttackDamage, pAttackSpeed)));
        this.toolMaterial = pTier;
    }

    public static ItemAttributeModifiers createAttributes(ToolMaterial material, float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(
                                BASE_ATTACK_DAMAGE_ID,
                                attackDamage + material.attackDamageBonus(),
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(
                                BASE_ATTACK_SPEED_ID,
                                attackSpeed,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
    }

    // Note: canAttackBlock and hurtEnemy methods removed due to 1.21.8 API changes
    // Combat damage is now handled through the attribute modifiers system

    public ToolMaterial getToolMaterial() {
        return this.toolMaterial;
    }
}
