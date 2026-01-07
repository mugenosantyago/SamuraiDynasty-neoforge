package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ItemMaterialsRegistry {

    // In 1.21.4, tool materials are created using ToolMaterial record
    // Parameters: incorrectBlocksForDrops, durability, speed, attackDamageBonus, enchantmentValue, repairItems
    public static final ToolMaterial SAMURAI = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561,       // durability
            12.0f,      // speed
            5.0f,       // attack damage bonus
            12,         // enchantment value
            () -> Ingredient.of(ItemsRegistry.STEEL_INGOT.get())
    );

    public static final ToolMaterial SAMURAI_NETHERITE = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2561,       // durability
            12.0f,      // speed
            5.0f,       // attack damage bonus
            25,         // enchantment value
            () -> Ingredient.of(Items.NETHERITE_INGOT)
    );

}
