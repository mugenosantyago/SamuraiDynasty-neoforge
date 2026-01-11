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
    public static final DeferredItem<Item> SHURIKEN = ITEMS.registerSimpleItem("shuriken");
    // Netherite Weapons
    public static final DeferredItem<Item> KATANA_NETHERITE = ITEMS.registerSimpleItem("katana_netherite");
    public static final DeferredItem<Item> WAKIZASHI_NETHERITE = ITEMS.registerSimpleItem("wakizashi_netherite");
    public static final DeferredItem<Item> KUNAI_NETHERITE = ITEMS.registerSimpleItem("kunai_netherite");
    // Special Katanas
    public static final DeferredItem<Item> KATANA_ONI = ITEMS.registerSimpleItem("katana_oni");
    public static final DeferredItem<Item> KATANA_KITSUNE = ITEMS.registerSimpleItem("katana_kitsune");
    public static final DeferredItem<Item> KATANA_KITSUNE_BLUE = ITEMS.registerSimpleItem("katana_kitsune_blue");
    public static final DeferredItem<Item> KATANA_AKANAME = ITEMS.registerSimpleItem("katana_akaname");
    public static final DeferredItem<Item> KATANA_JOROGUMO = ITEMS.registerSimpleItem("katana_jorogumo");
    // Crafting Components
    public static final DeferredItem<Item> KNIVE_HANDLE = ITEMS.registerSimpleItem("knive_handle");
    public static final DeferredItem<Item> KATANA_HANDLE = ITEMS.registerSimpleItem("katana_handle");
    public static final DeferredItem<Item> SPEAR_HANDLE = ITEMS.registerSimpleItem("spear_handle");

    // ========== ARMOR (Registered as simple items - proper armor system disabled for 1.21.8) ==========
    // Iron Samurai
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET = ITEMS.registerSimpleItem("iron_samurai_helmet");
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("iron_samurai_chestplate");
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("iron_samurai_leggings");
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS = ITEMS.registerSimpleItem("iron_samurai_boots");
    // Gold Samurai
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET = ITEMS.registerSimpleItem("gold_samurai_helmet");
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("gold_samurai_chestplate");
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("gold_samurai_leggings");
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS = ITEMS.registerSimpleItem("gold_samurai_boots");
    // Diamond Samurai
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET = ITEMS.registerSimpleItem("diamond_samurai_helmet");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("diamond_samurai_chestplate");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("diamond_samurai_leggings");
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS = ITEMS.registerSimpleItem("diamond_samurai_boots");
    // Red Samurai
    public static final DeferredItem<Item> RED_SAMURAI_HELMET = ITEMS.registerSimpleItem("red_samurai_helmet");
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE = ITEMS.registerSimpleItem("red_samurai_chestplate");
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS = ITEMS.registerSimpleItem("red_samurai_leggings");
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS = ITEMS.registerSimpleItem("red_samurai_boots");
    // Ninja
    public static final DeferredItem<Item> IRON_NINJA_HELMET = ITEMS.registerSimpleItem("iron_ninja_helmet");
    public static final DeferredItem<Item> IRON_NINJA_CHESTPLATE = ITEMS.registerSimpleItem("iron_ninja_chestplate");
    public static final DeferredItem<Item> IRON_NINJA_BOOTS = ITEMS.registerSimpleItem("iron_ninja_boots");
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.registerSimpleItem("ninja_leggings");
    // Special
    public static final DeferredItem<Item> STRAW_HAT = ITEMS.registerSimpleItem("straw_hat");
    public static final DeferredItem<Item> KIMONO = ITEMS.registerSimpleItem("kimono");
    
    // ========== CURIOS ==========
    public static final DeferredItem<Item> ONI_MASK = ITEMS.registerItem("oni_mask",
            properties -> new net.veroxuniverse.samurai_dynasty.curios.OniMaskCurios(properties.fireResistant().stacksTo(1)));
    public static final DeferredItem<Item> KITSUNE_MASK = ITEMS.registerItem("kitsune_mask",
            properties -> new net.veroxuniverse.samurai_dynasty.curios.KitsuneMaskCurios(properties.fireResistant().stacksTo(1)));

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
    public static final DeferredItem<Item> CLOTH = ITEMS.registerSimpleItem("cloth");
    public static final DeferredItem<Item> SPIRIT_UPGRADE_SMITHING_TEMPLATE = ITEMS.registerSimpleItem("spirit_upgrade_smithing_template");
    // Mob Drops
    public static final DeferredItem<Item> KITSUNE_HIDE = ITEMS.registerSimpleItem("kitsune_hide");
    public static final DeferredItem<Item> KITSUNE_TAIL = ITEMS.registerSimpleItem("kitsune_tail");
    public static final DeferredItem<Item> AKANAME_TONGUE = ITEMS.registerSimpleItem("akaname_tongue");
    public static final DeferredItem<Item> SPIRIT_FLAME = ITEMS.registerSimpleItem("spirit_flame");
    public static final DeferredItem<Item> JOROGUMO_EYE = ITEMS.registerSimpleItem("jorogumo_eye");
    public static final DeferredItem<Item> ONI_HORN = ITEMS.registerSimpleItem("oni_horn");

    // ========== BLOCK ITEMS ==========
    // TODO: Blocks remain disabled - NeoForge 1.21.8 has registration timing bugs
    // BlockItem registration requires blocks to be registered first, but causes circular dependency
    // Workaround: Use data-driven block item models or wait for NeoForge fix

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
