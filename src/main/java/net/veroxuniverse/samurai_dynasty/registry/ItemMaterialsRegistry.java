package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

/**
 * Tool materials for NeoForge 1.21.4.
 * In 1.21.4, ToolMaterial is created via static factory methods.
 */
public class ItemMaterialsRegistry {

    // Use vanilla tool materials as base for now
    // Custom materials would need proper tag setup
    public static final ToolMaterial SAMURAI = ToolMaterial.DIAMOND;
    
    public static final ToolMaterial SAMURAI_NETHERITE = ToolMaterial.NETHERITE;

}
