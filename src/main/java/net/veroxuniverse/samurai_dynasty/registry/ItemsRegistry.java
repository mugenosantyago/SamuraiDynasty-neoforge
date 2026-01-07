package net.veroxuniverse.samurai_dynasty.registry;

import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // ========== WEAPONS ==========
    public static final DeferredItem<Item> KUNAI = ITEMS.registerSimpleItem("kunai");
    public static final DeferredItem<Item> KUNAI_NETHERITE = ITEMS.registerSimpleItem("kunai_netherite");
    public static final DeferredItem<Item> SHURIKEN = ITEMS.registerSimpleItem("shuriken");
    public static final DeferredItem<Item> KAMAYARI = ITEMS.registerSimpleItem("kamayari");
    public static final DeferredItem<Item> KATANA_ONI = ITEMS.registerSimpleItem("katana_oni");
    public static final DeferredItem<Item> KATANA_KITSUNE = ITEMS.registerSimpleItem("katana_kitsune");
    public static final DeferredItem<Item> KATANA_KITSUNE_BLUE = ITEMS.registerSimpleItem("katana_kitsune_blue");
    public static final DeferredItem<Item> KATANA_AKANAME = ITEMS.registerSimpleItem("katana_akaname");
    public static final DeferredItem<Item> KATANA_JOROGUMO = ITEMS.registerSimpleItem("katana_jorogumo");

    // ========== ARMOR ==========
    public static final DeferredItem<Item> RED_SAMURAI_HELMET = ITEMS.registerSimpleItem("red_samurai_helmet");
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.registerSimpleItem("ninja_leggings");
    
    // ========== CURIOS ==========
    public static final DeferredItem<Item> ONI_MASK = ITEMS.registerSimpleItem("oni_mask");
    public static final DeferredItem<Item> KITSUNE_MASK = ITEMS.registerSimpleItem("kitsune_mask");

    // ========== MATERIALS / GEMS ==========
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<Item> JADE = ITEMS.registerSimpleItem("jade");
    public static final DeferredItem<Item> AQUAMARINE = ITEMS.registerSimpleItem("aquamarine");
    public static final DeferredItem<Item> ONYX = ITEMS.registerSimpleItem("onyx");
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");

    // ========== BLOCK ITEMS ==========
    public static final DeferredItem<BlockItem> RUBY_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.RUBY_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_RUBY_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DEEPSLATE_RUBY_ORE);
    public static final DeferredItem<BlockItem> JADE_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.JADE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_JADE_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DEEPSLATE_JADE_ORE);
    public static final DeferredItem<BlockItem> AQUAMARINE_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.AQUAMARINE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_AQUAMARINE_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DEEPSLATE_AQUAMARINE_ORE);
    public static final DeferredItem<BlockItem> ONYX_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.ONYX_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_ONYX_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DEEPSLATE_ONYX_ORE);
    public static final DeferredItem<BlockItem> SILVER_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.SILVER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DEEPSLATE_SILVER_ORE);
    public static final DeferredItem<BlockItem> RUBY_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.RUBY_BLOCK);
    public static final DeferredItem<BlockItem> JADE_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.JADE_BLOCK);
    public static final DeferredItem<BlockItem> AQUAMARINE_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.AQUAMARINE_BLOCK);
    public static final DeferredItem<BlockItem> ONYX_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.ONYX_BLOCK);
    public static final DeferredItem<BlockItem> SILVER_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.SILVER_BLOCK);
    public static final DeferredItem<BlockItem> STEEL_BLOCK = ITEMS.registerSimpleBlockItem(BlocksRegistry.STEEL_BLOCK);
    public static final DeferredItem<BlockItem> SPIRIT_STONE_BASE = ITEMS.registerSimpleBlockItem(BlocksRegistry.SPIRIT_STONE_BASE);
    public static final DeferredItem<BlockItem> SPIRIT_STONE = ITEMS.registerSimpleBlockItem(BlocksRegistry.SPIRIT_STONE);
    public static final DeferredItem<BlockItem> SPIRIT_STONE_STAIRS = ITEMS.registerSimpleBlockItem(BlocksRegistry.SPIRIT_STONE_STAIRS);
    public static final DeferredItem<BlockItem> SPIRIT_STONE_SLAB = ITEMS.registerSimpleBlockItem(BlocksRegistry.SPIRIT_STONE_SLAB);
    public static final DeferredItem<BlockItem> SPIRIT_STONE_WALL = ITEMS.registerSimpleBlockItem(BlocksRegistry.SPIRIT_STONE_WALL);
    public static final DeferredItem<BlockItem> MOSSY_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.MOSSY_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> MOSSY_SPIRIT_STONE_BRICK_STAIRS = ITEMS.registerSimpleBlockItem(BlocksRegistry.MOSSY_SPIRIT_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> MOSSY_SPIRIT_STONE_BRICK_SLAB = ITEMS.registerSimpleBlockItem(BlocksRegistry.MOSSY_SPIRIT_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> MOSSY_SPIRIT_STONE_BRICK_WALL = ITEMS.registerSimpleBlockItem(BlocksRegistry.MOSSY_SPIRIT_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> DRAGON_SPIRIT_STONE = ITEMS.registerSimpleBlockItem(BlocksRegistry.DRAGON_SPIRIT_STONE);
    public static final DeferredItem<BlockItem> POLISHED_SPIRIT_STONE = ITEMS.registerSimpleBlockItem(BlocksRegistry.POLISHED_SPIRIT_STONE);
    public static final DeferredItem<BlockItem> POLISHED_SPIRIT_STONE_STAIRS = ITEMS.registerSimpleBlockItem(BlocksRegistry.POLISHED_SPIRIT_STONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_SPIRIT_STONE_SLAB = ITEMS.registerSimpleBlockItem(BlocksRegistry.POLISHED_SPIRIT_STONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_SPIRIT_STONE_WALL = ITEMS.registerSimpleBlockItem(BlocksRegistry.POLISHED_SPIRIT_STONE_WALL);
    public static final DeferredItem<BlockItem> CHISELED_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.CHISELED_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> CHISELED_PATTERN_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.CHISELED_PATTERN_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> MOSAIC_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.MOSAIC_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> PATTERN_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.PATTERN_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> PATTERN_MOSSY_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.PATTERN_MOSSY_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> PATH_SPIRIT_STONE_BRICKS = ITEMS.registerSimpleBlockItem(BlocksRegistry.PATH_SPIRIT_STONE_BRICKS);
    public static final DeferredItem<BlockItem> TANUKI_STATUE = ITEMS.registerSimpleBlockItem(BlocksRegistry.TANUKI_STATUE);
    public static final DeferredItem<BlockItem> KOMAINU_STATUE = ITEMS.registerSimpleBlockItem(BlocksRegistry.KOMAINU_STATUE);
    public static final DeferredItem<BlockItem> KAWAUSO_STATUE = ITEMS.registerSimpleBlockItem(BlocksRegistry.KAWAUSO_STATUE);
    public static final DeferredItem<BlockItem> STONE_ROOF = ITEMS.registerSimpleBlockItem(BlocksRegistry.STONE_ROOF);
    public static final DeferredItem<BlockItem> STONE_ROOF_CORNER = ITEMS.registerSimpleBlockItem(BlocksRegistry.STONE_ROOF_CORNER);
    public static final DeferredItem<BlockItem> STONE_ROOF_TOP = ITEMS.registerSimpleBlockItem(BlocksRegistry.STONE_ROOF_TOP);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
