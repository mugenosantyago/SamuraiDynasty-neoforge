package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

public class BlocksRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SamuraiDynastyMod.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // Helper method - uses registerBlock() which sets block ID before construction
    private static DeferredBlock<Block> registerSimpleBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, Block::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerOreBlock(String name, UniformInt xp, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name,
                p -> new DropExperienceBlock(xp, p), props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerStairBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name,
                p -> new StairBlock(Blocks.STONE.defaultBlockState(), p), props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerSlabBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, SlabBlock::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerWallBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, WallBlock::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerStatueBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, StatueBlock::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerDragonBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, DragonBlock::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static DeferredBlock<Block> registerRoofBlock(String name, BlockBehaviour.Properties props) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, RoofBlock::new, props);
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    // ========== ORES ==========
    public static final DeferredBlock<Block> RUBY_ORE = registerOreBlock("ruby_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerOreBlock("deepslate_ruby_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> JADE_ORE = registerOreBlock("jade_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_JADE_ORE = registerOreBlock("deepslate_jade_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> AQUAMARINE_ORE = registerOreBlock("aquamarine_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_AQUAMARINE_ORE = registerOreBlock("deepslate_aquamarine_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> ONYX_ORE = registerOreBlock("onyx_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_ONYX_ORE = registerOreBlock("deepslate_onyx_ore",
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> SILVER_ORE = registerOreBlock("silver_ore",
            UniformInt.of(0, 2),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerOreBlock("deepslate_silver_ore",
            UniformInt.of(0, 2),
            BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE));

    // ========== STORAGE BLOCKS ==========
    public static final DeferredBlock<Block> RUBY_BLOCK = registerSimpleBlock("ruby_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0f, 6.0f).sound(SoundType.METAL));
    public static final DeferredBlock<Block> JADE_BLOCK = registerSimpleBlock("jade_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(5.0f, 6.0f).sound(SoundType.METAL));
    public static final DeferredBlock<Block> AQUAMARINE_BLOCK = registerSimpleBlock("aquamarine_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(5.0f, 6.0f).sound(SoundType.METAL));
    public static final DeferredBlock<Block> ONYX_BLOCK = registerSimpleBlock("onyx_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(5.0f, 6.0f).sound(SoundType.METAL));
    public static final DeferredBlock<Block> SILVER_BLOCK = registerSimpleBlock("silver_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.CLAY).strength(5.0f, 6.0f).sound(SoundType.METAL));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerSimpleBlock("steel_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(5.0f, 6.0f).sound(SoundType.METAL));

    // ========== SPIRIT STONE ==========
    public static final DeferredBlock<Block> SPIRIT_STONE_BASE = registerSimpleBlock("spirit_stone_base",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SPIRIT_STONE = registerSimpleBlock("spirit_stone",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SPIRIT_STONE_STAIRS = registerStairBlock("spirit_stone_stairs",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SPIRIT_STONE_SLAB = registerSlabBlock("spirit_stone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SPIRIT_STONE_WALL = registerWallBlock("spirit_stone_wall",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICKS = registerSimpleBlock("mossy_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_STAIRS = registerStairBlock("mossy_spirit_stone_brick_stairs",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_SLAB = registerSlabBlock("mossy_spirit_stone_brick_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_SPIRIT_STONE_BRICK_WALL = registerWallBlock("mossy_spirit_stone_brick_wall",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DRAGON_SPIRIT_STONE = registerDragonBlock("dragon_spirit_stone",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE = registerSimpleBlock("polished_spirit_stone",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_STAIRS = registerStairBlock("polished_spirit_stone_stairs",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_SLAB = registerSlabBlock("polished_spirit_stone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_SPIRIT_STONE_WALL = registerWallBlock("polished_spirit_stone_wall",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> CHISELED_SPIRIT_STONE_BRICKS = registerSimpleBlock("chiseled_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> CHISELED_PATTERN_SPIRIT_STONE_BRICKS = registerSimpleBlock("chiseled_pattern_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSAIC_SPIRIT_STONE_BRICKS = registerSimpleBlock("mosaic_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> PATTERN_SPIRIT_STONE_BRICKS = registerSimpleBlock("pattern_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> PATTERN_MOSSY_SPIRIT_STONE_BRICKS = registerSimpleBlock("pattern_mossy_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> PATH_SPIRIT_STONE_BRICKS = registerSimpleBlock("path_spirit_stone_bricks",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE));

    // ========== DECORATIVE BLOCKS ==========
    public static final DeferredBlock<Block> TANUKI_STATUE = registerStatueBlock("tanuki_statue",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());
    public static final DeferredBlock<Block> KOMAINU_STATUE = registerStatueBlock("komainu_statue",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());
    public static final DeferredBlock<Block> KAWAUSO_STATUE = registerStatueBlock("kawauso_statue",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());

    public static final DeferredBlock<Block> STONE_ROOF = registerRoofBlock("stone_roof",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());
    public static final DeferredBlock<Block> STONE_ROOF_CORNER = registerRoofBlock("stone_roof_corner",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());
    public static final DeferredBlock<Block> STONE_ROOF_TOP = registerRoofBlock("stone_roof_top",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).noOcclusion());

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
