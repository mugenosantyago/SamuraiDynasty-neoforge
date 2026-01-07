package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.item.*;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // ========== SAMURAI ARMOR - IRON ==========
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET = ITEMS.registerSimpleItem("iron_samurai_helmet");
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("iron_samurai_chestplate");
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("iron_samurai_leggings");
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS = ITEMS.registerSimpleItem("iron_samurai_boots");
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("iron_samurai_helmet_light");
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("iron_samurai_chestplate_light");
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("iron_samurai_leggings_light");
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("iron_samurai_boots_light");
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("iron_samurai_helmet_master");
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("iron_samurai_chestplate_master");
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("iron_samurai_leggings_master");
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("iron_samurai_boots_master");

    // ========== SAMURAI ARMOR - WHITE/SILVER ==========
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET = ITEMS.registerSimpleItem("white_samurai_helmet");
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("white_samurai_chestplate");
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("white_samurai_leggings");
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS = ITEMS.registerSimpleItem("white_samurai_boots");
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("white_samurai_helmet_light");
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("white_samurai_chestplate_light");
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("white_samurai_leggings_light");
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("white_samurai_boots_light");
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("white_samurai_helmet_master");
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("white_samurai_chestplate_master");
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("white_samurai_leggings_master");
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("white_samurai_boots_master");

    // ========== SAMURAI ARMOR - GOLD ==========
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET = ITEMS.registerSimpleItem("gold_samurai_helmet");
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("gold_samurai_chestplate");
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("gold_samurai_leggings");
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS = ITEMS.registerSimpleItem("gold_samurai_boots");
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("gold_samurai_helmet_light");
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("gold_samurai_chestplate_light");
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("gold_samurai_leggings_light");
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("gold_samurai_boots_light");
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("gold_samurai_helmet_master");
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("gold_samurai_chestplate_master");
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("gold_samurai_leggings_master");
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("gold_samurai_boots_master");

    // ========== SAMURAI ARMOR - DIAMOND ==========
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET = ITEMS.registerSimpleItem("diamond_samurai_helmet");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("diamond_samurai_chestplate");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("diamond_samurai_leggings");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS = ITEMS.registerSimpleItem("diamond_samurai_boots");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("diamond_samurai_helmet_light");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("diamond_samurai_chestplate_light");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("diamond_samurai_leggings_light");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("diamond_samurai_boots_light");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("diamond_samurai_helmet_master");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("diamond_samurai_chestplate_master");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("diamond_samurai_leggings_master");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("diamond_samurai_boots_master");

    // ========== SAMURAI ARMOR - NETHERITE ==========
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET = ITEMS.registerItem("netherite_samurai_helmet",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE = ITEMS.registerItem("netherite_samurai_chestplate",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS = ITEMS.registerItem("netherite_samurai_leggings",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS = ITEMS.registerItem("netherite_samurai_boots",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("netherite_samurai_helmet_light");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("netherite_samurai_chestplate_light");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("netherite_samurai_leggings_light");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("netherite_samurai_boots_light");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("netherite_samurai_helmet_master");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("netherite_samurai_chestplate_master");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("netherite_samurai_leggings_master");
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("netherite_samurai_boots_master");

    // ========== SAMURAI ARMOR - AMETHYST ==========
    public static final DeferredItem<Item> AMETHYST_SAMURAI_HELMET = ITEMS.registerItem("amethyst_samurai_helmet",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_CHESTPLATE = ITEMS.registerItem("amethyst_samurai_chestplate",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_LEGGINGS = ITEMS.registerItem("amethyst_samurai_leggings",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_BOOTS = ITEMS.registerItem("amethyst_samurai_boots",
            properties -> new Item(properties.fireResistant()));

    // ========== SAMURAI ARMOR - QUARTZ ==========
    public static final DeferredItem<Item> QUARTZ_SAMURAI_HELMET = ITEMS.registerItem("quartz_samurai_helmet",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_CHESTPLATE = ITEMS.registerItem("quartz_samurai_chestplate",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_LEGGINGS = ITEMS.registerItem("quartz_samurai_leggings",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_BOOTS = ITEMS.registerItem("quartz_samurai_boots",
            properties -> new Item(properties.fireResistant()));

    // ========== SAMURAI ARMOR - RED/RUBY ==========
    public static final DeferredItem<Item> RED_SAMURAI_HELMET = ITEMS.registerSimpleItem("red_samurai_helmet");
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("red_samurai_chestplate");
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("red_samurai_leggings");
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS = ITEMS.registerSimpleItem("red_samurai_boots");
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("red_samurai_helmet_light");
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("red_samurai_chestplate_light");
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("red_samurai_leggings_light");
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("red_samurai_boots_light");
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("red_samurai_helmet_master");
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("red_samurai_chestplate_master");
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("red_samurai_leggings_master");
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("red_samurai_boots_master");

    // ========== SAMURAI ARMOR - BLUE/AQUAMARINE ==========
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET = ITEMS.registerSimpleItem("blue_samurai_helmet");
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("blue_samurai_chestplate");
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("blue_samurai_leggings");
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS = ITEMS.registerSimpleItem("blue_samurai_boots");
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("blue_samurai_helmet_light");
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("blue_samurai_chestplate_light");
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("blue_samurai_leggings_light");
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("blue_samurai_boots_light");
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("blue_samurai_helmet_master");
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("blue_samurai_chestplate_master");
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("blue_samurai_leggings_master");
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("blue_samurai_boots_master");

    // ========== SAMURAI ARMOR - GREEN/JADE ==========
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET = ITEMS.registerSimpleItem("green_samurai_helmet");
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("green_samurai_chestplate");
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("green_samurai_leggings");
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS = ITEMS.registerSimpleItem("green_samurai_boots");
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("green_samurai_helmet_light");
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("green_samurai_chestplate_light");
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("green_samurai_leggings_light");
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("green_samurai_boots_light");
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("green_samurai_helmet_master");
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("green_samurai_chestplate_master");
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("green_samurai_leggings_master");
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("green_samurai_boots_master");

    // ========== SAMURAI ARMOR - GRAY/ONYX ==========
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET = ITEMS.registerSimpleItem("gray_samurai_helmet");
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("gray_samurai_chestplate");
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("gray_samurai_leggings");
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS = ITEMS.registerSimpleItem("gray_samurai_boots");
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_LIGHT = ITEMS.registerSimpleItem("gray_samurai_helmet_light");
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerSimpleItem("gray_samurai_chestplate_light");
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerSimpleItem("gray_samurai_leggings_light");
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_LIGHT = ITEMS.registerSimpleItem("gray_samurai_boots_light");
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_MASTER = ITEMS.registerSimpleItem("gray_samurai_helmet_master");
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerSimpleItem("gray_samurai_chestplate_master");
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_MASTER = ITEMS.registerSimpleItem("gray_samurai_leggings_master");
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_MASTER = ITEMS.registerSimpleItem("gray_samurai_boots_master");

    // ========== STEEL ARMOR ==========
    public static final DeferredItem<Item> STEEL_HELMET = ITEMS.registerSimpleItem("steel_helmet");
    public static final DeferredItem<Item> STEEL_CHESTPLATE = ITEMS.registerSimpleItem("steel_chestplate");
    public static final DeferredItem<Item> STEEL_LEGGINGS = ITEMS.registerSimpleItem("steel_leggings");
    public static final DeferredItem<Item> STEEL_BOOTS = ITEMS.registerSimpleItem("steel_boots");

    // ========== NINJA ARMOR - IRON ==========
    public static final DeferredItem<Item> IRON_NINJA_HELMET = ITEMS.registerSimpleItem("iron_ninja_helmet");
    public static final DeferredItem<Item> IRON_NINJA_CHESTPLATE = ITEMS.registerSimpleItem("iron_ninja_chestplate");
    public static final DeferredItem<Item> IRON_NINJA_BOOTS = ITEMS.registerSimpleItem("iron_ninja_boots");

    // ========== NINJA ARMOR - STEEL ==========
    public static final DeferredItem<Item> STEEL_NINJA_HELMET = ITEMS.registerSimpleItem("steel_ninja_helmet");
    public static final DeferredItem<Item> STEEL_NINJA_CHESTPLATE = ITEMS.registerSimpleItem("steel_ninja_chestplate");
    public static final DeferredItem<Item> STEEL_NINJA_BOOTS = ITEMS.registerSimpleItem("steel_ninja_boots");

    // ========== NINJA ARMOR - GOLD ==========
    public static final DeferredItem<Item> GOLD_NINJA_HELMET = ITEMS.registerSimpleItem("gold_ninja_helmet");
    public static final DeferredItem<Item> GOLD_NINJA_CHESTPLATE = ITEMS.registerSimpleItem("gold_ninja_chestplate");
    public static final DeferredItem<Item> GOLD_NINJA_BOOTS = ITEMS.registerSimpleItem("gold_ninja_boots");

    // ========== NINJA ARMOR - DIAMOND ==========
    public static final DeferredItem<Item> DIAMOND_NINJA_HELMET = ITEMS.registerSimpleItem("diamond_ninja_helmet");
    public static final DeferredItem<Item> DIAMOND_NINJA_CHESTPLATE = ITEMS.registerSimpleItem("diamond_ninja_chestplate");
    public static final DeferredItem<Item> DIAMOND_NINJA_BOOTS = ITEMS.registerSimpleItem("diamond_ninja_boots");

    // ========== NINJA ARMOR - NETHERITE ==========
    public static final DeferredItem<Item> NETHERITE_NINJA_HELMET = ITEMS.registerItem("netherite_ninja_helmet",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_CHESTPLATE = ITEMS.registerItem("netherite_ninja_chestplate",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_BOOTS = ITEMS.registerItem("netherite_ninja_boots",
            properties -> new Item(properties.fireResistant()));

    // ========== SHARED NINJA LEGGINGS ==========
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.registerSimpleItem("ninja_leggings");

    // ========== SPECIAL ARMOR ==========
    public static final DeferredItem<Item> KIMONO = ITEMS.registerSimpleItem("kimono");
    public static final DeferredItem<Item> STRAW_HAT = ITEMS.registerSimpleItem("straw_hat");

    // ========== CURIOS / MASKS ==========
    public static final DeferredItem<Item> ONI_MASK = ITEMS.registerItem("oni_mask",
            properties -> new Item(properties.fireResistant().stacksTo(1)));
    public static final DeferredItem<Item> KITSUNE_MASK = ITEMS.registerItem("kitsune_mask",
            properties -> new Item(properties.fireResistant().stacksTo(1)));

    // ========== CRAFTING COMPONENTS ==========
    public static final DeferredItem<Item> KNIVE_HANDLE = ITEMS.registerSimpleItem("knive_handle");
    public static final DeferredItem<Item> KATANA_HANDLE = ITEMS.registerSimpleItem("katana_handle");
    public static final DeferredItem<Item> SPEAR_HANDLE = ITEMS.registerSimpleItem("spear_handle");

    // ========== WEAPONS - BASIC ==========
    public static final DeferredItem<Item> KATANA = ITEMS.registerSimpleItem("katana");
    public static final DeferredItem<Item> WAKIZASHI = ITEMS.registerSimpleItem("wakizashi");
    public static final DeferredItem<Item> NAGINATA = ITEMS.registerSimpleItem("naginata");
    public static final DeferredItem<Item> NAGAMAKI = ITEMS.registerSimpleItem("nagamaki");
    public static final DeferredItem<Item> SHUKO = ITEMS.registerSimpleItem("shuko");
    public static final DeferredItem<Item> TETSUBO = ITEMS.registerSimpleItem("tetsubo");
    public static final DeferredItem<Item> ODACHI = ITEMS.registerSimpleItem("odachi");
    public static final DeferredItem<Item> TONBUKIRI = ITEMS.registerSimpleItem("tonbukiri");
    public static final DeferredItem<Item> KAMAYARI = ITEMS.registerSimpleItem("kamayari");
    public static final DeferredItem<Item> KUNAI = ITEMS.registerSimpleItem("kunai");
    public static final DeferredItem<Item> KAMA = ITEMS.registerSimpleItem("kama");
    public static final DeferredItem<Item> SAI = ITEMS.registerSimpleItem("sai");

    public static final DeferredItem<Item> SHURIKEN = ITEMS.registerItem("shuriken",
            properties -> new Item(properties.stacksTo(16)));

    // ========== WEAPONS - NETHERITE ==========
    public static final DeferredItem<Item> KATANA_NETHERITE = ITEMS.registerItem("katana_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> WAKIZASHI_NETHERITE = ITEMS.registerItem("wakizashi_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> KATANA_ONI = ITEMS.registerItem("katana_oni",
            properties -> new Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final DeferredItem<Item> KATANA_KITSUNE = ITEMS.registerItem("katana_kitsune",
            properties -> new Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final DeferredItem<Item> KATANA_KITSUNE_BLUE = ITEMS.registerItem("katana_kitsune_blue",
            properties -> new Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final DeferredItem<Item> KATANA_AKANAME = ITEMS.registerItem("katana_akaname",
            properties -> new Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final DeferredItem<Item> KATANA_JOROGUMO = ITEMS.registerItem("katana_jorogumo",
            properties -> new Item(properties.rarity(Rarity.RARE).fireResistant()));

    public static final DeferredItem<Item> NAGINATA_NETHERITE = ITEMS.registerItem("naginata_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> NAGAMAKI_NETHERITE = ITEMS.registerItem("nagamaki_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> SHUKO_NETHERITE = ITEMS.registerItem("shuko_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> TETSUBO_NETHERITE = ITEMS.registerItem("tetsubo_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> ODACHI_NETHERITE = ITEMS.registerSimpleItem("odachi_netherite");
    public static final DeferredItem<Item> TONBUKIRI_NETHERITE = ITEMS.registerSimpleItem("tonbukiri_netherite");
    public static final DeferredItem<Item> KAMAYARI_NETHERITE = ITEMS.registerSimpleItem("kamayari_netherite");
    public static final DeferredItem<Item> KUNAI_NETHERITE = ITEMS.registerItem("kunai_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> KAMA_NETHERITE = ITEMS.registerItem("kama_netherite",
            properties -> new Item(properties.fireResistant()));
    public static final DeferredItem<Item> SAI_NETHERITE = ITEMS.registerItem("sai_netherite",
            properties -> new Item(properties.fireResistant()));

    // ========== SPAWN EGGS ==========
    public static final DeferredItem<Item> AKANAME_SPAWN_EGG = ITEMS.register("akaname_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.AKANAME, 0x5e100a, 0xa88c8a, new Item.Properties()));
    public static final DeferredItem<Item> ENENRA_SPAWN_EGG = ITEMS.register("enenra_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.ENENRA, 0x08090a, 0xa88c8a, new Item.Properties()));
    public static final DeferredItem<Item> ONI_SPAWN_EGG = ITEMS.register("oni_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.ONI, 0xce1841, 0xead9ce, new Item.Properties()));
    public static final DeferredItem<Item> KITSUNE_SPAWN_EGG = ITEMS.register("kitsune_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.KITSUNE, 0xff9356, 0xdd0885, new Item.Properties()));
    public static final DeferredItem<Item> KITSUNE_SMALL_SPAWN_EGG = ITEMS.register("kitsune_small_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.TWOTAILED, 0xF1F0ED, 0x2596be, new Item.Properties()));
    public static final DeferredItem<Item> ONIBI_SPAWN_EGG = ITEMS.register("onibi_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.ONIBI, 0x85929E, 0x0097FF, new Item.Properties()));
    public static final DeferredItem<Item> JOROGUMO_SPAWN_EGG = ITEMS.register("jorogumo_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.JOROGUMO, 0x5f3799, 0xffcedd, new Item.Properties()));
    public static final DeferredItem<Item> KOMAINU_SPAWN_EGG = ITEMS.register("komainu_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.KOMAINU, 0x00ffc8, 0xff7200, new Item.Properties()));
    public static final DeferredItem<Item> TANUKI_SPAWN_EGG = ITEMS.register("tanuki_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.TANUKI, 0x544719, 0x3186e0, new Item.Properties()));
    public static final DeferredItem<Item> KAWAUSO_SPAWN_EGG = ITEMS.register("kawauso_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntityTypes.KAWAUSO, 0x544719, 0x096e0f, new Item.Properties()));

    // ========== MATERIALS / GEMS ==========
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<Item> JADE = ITEMS.registerSimpleItem("jade");
    public static final DeferredItem<Item> AQUAMARINE = ITEMS.registerSimpleItem("aquamarine");
    public static final DeferredItem<Item> ONYX = ITEMS.registerSimpleItem("onyx");
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.registerSimpleItem("silver_nugget");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.registerSimpleItem("steel_nugget");
    public static final DeferredItem<Item> AMETHYST_INGOT = ITEMS.registerSimpleItem("amethyst_ingot");
    public static final DeferredItem<Item> QUARTZ_INGOT = ITEMS.registerSimpleItem("quartz_ingot");

    // ========== MOB DROPS ==========
    public static final DeferredItem<Item> KITSUNE_HIDE = ITEMS.registerSimpleItem("kitsune_hide");
    public static final DeferredItem<Item> KITSUNE_TAIL = ITEMS.registerSimpleItem("kitsune_tail");
    public static final DeferredItem<Item> AKANAME_TONGUE = ITEMS.registerSimpleItem("akaname_tongue");
    public static final DeferredItem<Item> SPIRIT_FLAME = ITEMS.registerSimpleItem("spirit_flame");
    public static final DeferredItem<Item> JOROGUMO_EYE = ITEMS.registerSimpleItem("jorogumo_eye");
    public static final DeferredItem<Item> ONI_HORN = ITEMS.registerSimpleItem("oni_horn");

    // ========== MISC ==========
    public static final DeferredItem<Item> CLOTH = ITEMS.registerSimpleItem("cloth");
    public static final DeferredItem<Item> SPIRIT_UPGRADE_SMITHING_TMEPLATE = ITEMS.registerSimpleItem("spirit_upgrade_smithing_template");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
