package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.item.*;
import net.veroxuniverse.samurai_dynasty.item.armor.*;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // ========== WEAPONS (Using ESWeaponItem with attack damage/speed) ==========
    public static final DeferredItem<Item> KATANA = ITEMS.registerItem("katana",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 3.0f, -2.4f, props));
    public static final DeferredItem<Item> WAKIZASHI = ITEMS.registerItem("wakizashi",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 2.0f, -2.0f, props));
    public static final DeferredItem<Item> NAGINATA = ITEMS.registerItem("naginata",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 4.0f, -2.8f, props));
    public static final DeferredItem<Item> NAGAMAKI = ITEMS.registerItem("nagamaki",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 4.0f, -2.8f, props));
    public static final DeferredItem<Item> SHUKO = ITEMS.registerItem("shuko",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 1.0f, -1.6f, props));
    public static final DeferredItem<Item> TETSUBO = ITEMS.registerItem("tetsubo",
            props -> new TetsuboItem(ItemMaterialsRegistry.SAMURAI, 5.0f, -3.0f, props));
    public static final DeferredItem<Item> ODACHI = ITEMS.registerItem("odachi",
            props -> new OdachiItem(ItemMaterialsRegistry.SAMURAI, 5.0f, -3.0f, props));
    public static final DeferredItem<Item> TONBUKIRI = ITEMS.registerItem("tonbukiri",
            props -> new TonbukiriItem(ItemMaterialsRegistry.SAMURAI, 4.0f, -2.8f, props));
    public static final DeferredItem<Item> KAMAYARI = ITEMS.registerItem("kamayari",
            props -> new KamayariItem(ItemMaterialsRegistry.SAMURAI, 4.0f, -2.8f, props));
    public static final DeferredItem<Item> KUNAI = ITEMS.registerItem("kunai",
            props -> new KunaiItem(ItemMaterialsRegistry.SAMURAI, 2.0f, -1.8f, props));
    public static final DeferredItem<Item> KAMA = ITEMS.registerItem("kama",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 2.0f, -2.0f, props));
    public static final DeferredItem<Item> SAI = ITEMS.registerItem("sai",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 2.0f, -1.8f, props));
    public static final DeferredItem<Item> SHURIKEN = ITEMS.registerItem("shuriken",
            props -> new ShurikenItem(props));
    // Netherite Weapons
    public static final DeferredItem<Item> KATANA_NETHERITE = ITEMS.registerItem("katana_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props.fireResistant()));
    public static final DeferredItem<Item> WAKIZASHI_NETHERITE = ITEMS.registerItem("wakizashi_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 3.0f, -2.0f, props.fireResistant()));
    public static final DeferredItem<Item> KUNAI_NETHERITE = ITEMS.registerItem("kunai_netherite",
            props -> new NetheriteKunaiItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 3.0f, -1.8f, props.fireResistant()));
    // Special Katanas (with abilities)
    public static final DeferredItem<Item> KATANA_ONI = ITEMS.registerItem("katana_oni",
            props -> new OniKatanaItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props));
    public static final DeferredItem<Item> KATANA_KITSUNE = ITEMS.registerItem("katana_kitsune",
            props -> new KitsuneKatanaItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props));
    public static final DeferredItem<Item> KATANA_KITSUNE_BLUE = ITEMS.registerItem("katana_kitsune_blue",
            props -> new KitsuneKatanaBlueItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props));
    public static final DeferredItem<Item> KATANA_AKANAME = ITEMS.registerItem("katana_akaname",
            props -> new AkanameKatanaItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props));
    public static final DeferredItem<Item> KATANA_JOROGUMO = ITEMS.registerItem("katana_jorogumo",
            props -> new JorogumoKatanaItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.0f, -2.4f, props));
    // Crafting Components
    public static final DeferredItem<Item> KNIVE_HANDLE = ITEMS.registerSimpleItem("knive_handle");
    public static final DeferredItem<Item> KATANA_HANDLE = ITEMS.registerSimpleItem("katana_handle");
    public static final DeferredItem<Item> SPEAR_HANDLE = ITEMS.registerSimpleItem("spear_handle");

    // ========== ARMOR (Using SamuraiArmorItem with proper armor properties) ==========
    // Iron Samurai
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET = ITEMS.registerItem("iron_samurai_helmet",
            props -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.HELMET, props));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE = ITEMS.registerItem("iron_samurai_chestplate",
            props -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS = ITEMS.registerItem("iron_samurai_leggings",
            props -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS = ITEMS.registerItem("iron_samurai_boots",
            props -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.BOOTS, props));
    // Gold Samurai
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET = ITEMS.registerItem("gold_samurai_helmet",
            props -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE = ITEMS.registerItem("gold_samurai_chestplate",
            props -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS = ITEMS.registerItem("gold_samurai_leggings",
            props -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS = ITEMS.registerItem("gold_samurai_boots",
            props -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.BOOTS, props));
    // Diamond Samurai
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET = ITEMS.registerItem("diamond_samurai_helmet",
            props -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.HELMET, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE = ITEMS.registerItem("diamond_samurai_chestplate",
            props -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS = ITEMS.registerItem("diamond_samurai_leggings",
            props -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS = ITEMS.registerItem("diamond_samurai_boots",
            props -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.BOOTS, props));
    // Red Samurai
    public static final DeferredItem<Item> RED_SAMURAI_HELMET = ITEMS.registerItem("red_samurai_helmet",
            props -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.HELMET, props));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE = ITEMS.registerItem("red_samurai_chestplate",
            props -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS = ITEMS.registerItem("red_samurai_leggings",
            props -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS = ITEMS.registerItem("red_samurai_boots",
            props -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.BOOTS, props));
    // Ninja
    public static final DeferredItem<Item> IRON_NINJA_HELMET = ITEMS.registerItem("iron_ninja_helmet",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.HELMET, props));
    public static final DeferredItem<Item> IRON_NINJA_CHESTPLATE = ITEMS.registerItem("iron_ninja_chestplate",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> IRON_NINJA_BOOTS = ITEMS.registerItem("iron_ninja_boots",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.BOOTS, props));
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.registerItem("ninja_leggings",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.LEGGINGS, props));
    // Special
    public static final DeferredItem<Item> STRAW_HAT = ITEMS.registerItem("straw_hat",
            props -> new StrawHatArmorItem(ArmorMaterialsRegistry.STRAW, ArmorType.HELMET, props));
    public static final DeferredItem<Item> KIMONO = ITEMS.registerItem("kimono",
            props -> new KimonoArmorItem(ArmorMaterialsRegistry.CLOTH, ArmorType.CHESTPLATE, props));
    
    // ========== CURIOS ==========
    public static final DeferredItem<Item> ONI_MASK = ITEMS.registerItem("oni_mask",
            properties -> new net.veroxuniverse.samurai_dynasty.curios.OniMaskCurios(properties.fireResistant().stacksTo(1)));
    public static final DeferredItem<Item> KITSUNE_MASK = ITEMS.registerItem("kitsune_mask",
            properties -> new net.veroxuniverse.samurai_dynasty.curios.KitsuneMaskCurios(properties.fireResistant().stacksTo(1)));

    // ========== SPAWN EGGS ==========
    public static final DeferredItem<Item> AKANAME_SPAWN_EGG = ITEMS.registerItem("akaname_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.AKANAME.get(), 0x4a5568, 0xff6b9d, props));
    public static final DeferredItem<Item> KITSUNE_SPAWN_EGG = ITEMS.registerItem("kitsune_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KITSUNE.get(), 0xff8c42, 0xffe5d9, props));
    public static final DeferredItem<Item> ENENRA_SPAWN_EGG = ITEMS.registerItem("enenra_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ENENRA.get(), 0x2d2d2d, 0x6e6e6e, props));
    public static final DeferredItem<Item> ONI_SPAWN_EGG = ITEMS.registerItem("oni_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ONI.get(), 0xd92027, 0x3d1f1f, props));
    public static final DeferredItem<Item> ONIBI_SPAWN_EGG = ITEMS.registerItem("onibi_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ONIBI.get(), 0x00ffff, 0x0080ff, props));
    public static final DeferredItem<Item> JOROGUMO_SPAWN_EGG = ITEMS.registerItem("jorogumo_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.JOROGUMO.get(), 0x2d1b1b, 0xff0000, props));
    public static final DeferredItem<Item> KOMAINU_SPAWN_EGG = ITEMS.registerItem("komainu_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KOMAINU.get(), 0xd4af7a, 0x8b6f47, props));
    public static final DeferredItem<Item> TANUKI_SPAWN_EGG = ITEMS.registerItem("tanuki_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.TANUKI.get(), 0x8b5a3c, 0xe8d5c4, props));
    public static final DeferredItem<Item> KAWAUSO_SPAWN_EGG = ITEMS.registerItem("kawauso_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KAWAUSO.get(), 0x6d4c41, 0xb8a391, props));
    public static final DeferredItem<Item> TWOTAILED_SPAWN_EGG = ITEMS.registerItem("twotailed_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.TWOTAILED.get(), 0xff6b42, 0xffffff, props));

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
    // Block items are registered via BlocksRegistry using registerSimpleBlockItem
    // This avoids the circular dependency / timing issue with block registration

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
