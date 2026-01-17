package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.block.DragonBlock;
import net.veroxuniverse.samurai_dynasty.block.RoofBlock;
import net.veroxuniverse.samurai_dynasty.block.StatueBlock;

import java.util.function.Supplier;

public class BlocksRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SamuraiDynastyMod.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // Helper properties - In 1.21.8, noLootTable() prevents block ID check during construction
    // Loot tables are handled via JSON data files
    private static BlockBehaviour.Properties oreProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(3.0f, 3.0f)
                .sound(SoundType.STONE)
                .noLootTable();
    }

    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.DEEPSLATE)
                .strength(4.5f, 3.0f)
                .sound(SoundType.DEEPSLATE)
                .noLootTable();
    }

    private static BlockBehaviour.Properties metalBlockProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL)
                .noLootTable();
    }

    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(1.5f, 6.0f)
                .sound(SoundType.STONE)
                .noLootTable();
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> deferredBlock = BLOCKS.register(name, block);
        // Register block item using the deferred block (no .get() call)
        BLOCK_ITEMS.registerSimpleBlockItem(deferredBlock);
        return deferredBlock;
    }

    private static <T extends Block> DeferredBlock<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    // ========== ORES ==========
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), oreProperties()));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties()));
    public static final DeferredBlock<Block> JADE_ORE = registerBlock("jade_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), oreProperties()));
    public static final DeferredBlock<Block> DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties()));
    public static final DeferredBlock<Block> AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), oreProperties()));
    public static final DeferredBlock<Block> DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties()));
    public static final DeferredBlock<Block> ONYX_ORE = registerBlock("onyx_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), oreProperties()));
    public static final DeferredBlock<Block> DEEPSLATE_ONYX_ORE = registerBlock("deepslate_onyx_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties()));
    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), oreProperties()));
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), deepslateOreProperties()));

    // ========== STORAGE BLOCKS ==========
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.COLOR_GREEN)));
    public static final DeferredBlock<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> ONYX_BLOCK = registerBlock("onyx_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.COLOR_BLACK)));
    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.CLAY)));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(metalBlockProperties().mapColor(MapColor.COLOR_GRAY)));

    // ========== SPIRIT STONE ==========
    public static final DeferredBlock<Block> SPIRIT_STONE_BASE = registerBlock("spirit_stone_base",
            () -> new Block(stoneProperties()));

    public static final DeferredBlock<Block> SPIRIT_STONE = registerBlock("spirit_stone",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> SPIRIT_STONE_STAIRS = registerBlock("spirit_stone_stairs",
            () -> new StairBlock(Blocks.STONE.defaultBlockState(), stoneProperties()));
    public static final DeferredBlock<Block> SPIRIT_STONE_SLAB = registerBlock("spirit_stone_slab",
            () -> new SlabBlock(stoneProperties()));
    public static final DeferredBlock<Block> SPIRIT_STONE_WALL = registerBlock("spirit_stone_wall",
            () -> new WallBlock(stoneProperties()));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICKS = registerBlock("mossy_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_STAIRS = registerBlock("mossy_spirit_stone_brick_stairs",
            () -> new StairBlock(Blocks.STONE.defaultBlockState(), stoneProperties()));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_SLAB = registerBlock("mossy_spirit_stone_brick_slab",
            () -> new SlabBlock(stoneProperties()));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_WALL = registerBlock("mossy_spirit_stone_brick_wall",
            () -> new WallBlock(stoneProperties()));
    public static final DeferredBlock<Block> DRAGON_SPIRIT_STONE = registerBlock("dragon_spirit_stone",
            () -> new DragonBlock(stoneProperties()));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE = registerBlock("polished_spirit_stone",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_STAIRS = registerBlock("polished_spirit_stone_stairs",
            () -> new StairBlock(Blocks.STONE.defaultBlockState(), stoneProperties()));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_SLAB = registerBlock("polished_spirit_stone_slab",
            () -> new SlabBlock(stoneProperties()));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_WALL = registerBlock("polished_spirit_stone_wall",
            () -> new WallBlock(stoneProperties()));
    public static final DeferredBlock<Block> CHISELED_SPIRIT_STONE_BRICKS = registerBlock("chiseled_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> CHISELED_PATTERN_SPIRIT_STONE_BRICKS = registerBlock("chiseled_pattern_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> MOSAIC_SPIRIT_STONE_BRICKS = registerBlock("mosaic_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> PATTERN_SPIRIT_STONE_BRICKS = registerBlock("pattern_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> PATTERN_MOSSY_SPIRIT_STONE_BRICKS = registerBlock("pattern_mossy_spirit_stone_bricks",
            () -> new Block(stoneProperties()));
    public static final DeferredBlock<Block> PATH_SPIRIT_STONE_BRICKS = registerBlock("path_spirit_stone_bricks",
            () -> new Block(stoneProperties()));

    // ========== DECORATIVE BLOCKS ==========
    public static final DeferredBlock<Block> TANUKI_STATUE = registerBlock("tanuki_statue",
            () -> new StatueBlock(stoneProperties().noOcclusion()));
    public static final DeferredBlock<Block> KOMAINU_STATUE = registerBlock("komainu_statue",
            () -> new StatueBlock(stoneProperties().noOcclusion()));
    public static final DeferredBlock<Block> KAWAUSO_STATUE = registerBlock("kawauso_statue",
            () -> new StatueBlock(stoneProperties().noOcclusion()));

    public static final DeferredBlock<Block> STONE_ROOF = registerBlock("stone_roof",
            () -> new RoofBlock(stoneProperties().noOcclusion()));
    public static final DeferredBlock<Block> STONE_ROOF_CORNER = registerBlock("stone_roof_corner",
            () -> new RoofBlock(stoneProperties().noOcclusion()));
    public static final DeferredBlock<Block> STONE_ROOF_TOP = registerBlock("stone_roof_top",
            () -> new RoofBlock(stoneProperties().noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
