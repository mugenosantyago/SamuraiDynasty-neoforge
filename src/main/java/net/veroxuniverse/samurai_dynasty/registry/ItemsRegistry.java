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
    public static final DeferredItem<Item> TANEGASHIMA = ITEMS.registerItem("tanegashima",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI, 6.0f, -3.2f, props));
    // Netherite Weapons (Significantly stronger than base variants)
    public static final DeferredItem<Item> KATANA_NETHERITE = ITEMS.registerItem("katana_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 5.5f, -2.4f, props.fireResistant()));
    public static final DeferredItem<Item> WAKIZASHI_NETHERITE = ITEMS.registerItem("wakizashi_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.5f, -2.0f, props.fireResistant()));
    public static final DeferredItem<Item> KUNAI_NETHERITE = ITEMS.registerItem("kunai_netherite",
            props -> new NetheriteKunaiItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.5f, -1.8f, props.fireResistant()));
    public static final DeferredItem<Item> TETSUBO_NETHERITE = ITEMS.registerItem("tetsubo_netherite",
            props -> new TetsuboNetheriteItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 8.0f, -3.0f, props.fireResistant()));
    public static final DeferredItem<Item> ODACHI_NETHERITE = ITEMS.registerItem("odachi_netherite",
            props -> new OdachiNetheriteItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 8.0f, -3.0f, props.fireResistant()));
    public static final DeferredItem<Item> TONBUKIRI_NETHERITE = ITEMS.registerItem("tonbukiri_netherite",
            props -> new TonbukiriNetheriteItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 6.5f, -2.8f, props.fireResistant()));
    public static final DeferredItem<Item> KAMAYARI_NETHERITE = ITEMS.registerItem("kamayari_netherite",
            props -> new KamayariNetheriteItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 6.5f, -2.8f, props.fireResistant()));
    public static final DeferredItem<Item> NAGINATA_NETHERITE = ITEMS.registerItem("naginata_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 6.5f, -2.8f, props.fireResistant()));
    public static final DeferredItem<Item> NAGAMAKI_NETHERITE = ITEMS.registerItem("nagamaki_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 6.5f, -2.8f, props.fireResistant()));
    public static final DeferredItem<Item> SAI_NETHERITE = ITEMS.registerItem("sai_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.5f, -1.8f, props.fireResistant()));
    public static final DeferredItem<Item> SHUKO_NETHERITE = ITEMS.registerItem("shuko_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 3.5f, -1.6f, props.fireResistant()));
    public static final DeferredItem<Item> KAMA_NETHERITE = ITEMS.registerItem("kama_netherite",
            props -> new ESWeaponItem(ItemMaterialsRegistry.SAMURAI_NETHERITE, 4.5f, -2.0f, props.fireResistant()));
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
    // Ammo & Repair Items
    public static final DeferredItem<Item> BULLET = ITEMS.registerSimpleItem("bullet");
    public static final DeferredItem<Item> BRASS_REPAIR_KIT = ITEMS.registerSimpleItem("brass_repair_kit");
    public static final DeferredItem<Item> NEPTUNIUM_REPAIR_KIT = ITEMS.registerSimpleItem("neptunium_repair_kit");

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
    // Ninja - Iron
    public static final DeferredItem<Item> IRON_NINJA_HELMET = ITEMS.registerItem("iron_ninja_helmet",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.HELMET, props));
    public static final DeferredItem<Item> IRON_NINJA_CHESTPLATE = ITEMS.registerItem("iron_ninja_chestplate",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> IRON_NINJA_BOOTS = ITEMS.registerItem("iron_ninja_boots",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.BOOTS, props));
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.registerItem("ninja_leggings",
            props -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.LEGGINGS, props));
    // Ninja - Gold
    public static final DeferredItem<Item> GOLD_NINJA_HELMET = ITEMS.registerItem("gold_ninja_helmet",
            props -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GOLD_NINJA_CHESTPLATE = ITEMS.registerItem("gold_ninja_chestplate",
            props -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GOLD_NINJA_LEGGINGS = ITEMS.registerItem("gold_ninja_leggings",
            props -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GOLD_NINJA_BOOTS = ITEMS.registerItem("gold_ninja_boots",
            props -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.BOOTS, props));
    // Ninja - Diamond
    public static final DeferredItem<Item> DIAMOND_NINJA_HELMET = ITEMS.registerItem("diamond_ninja_helmet",
            props -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.HELMET, props));
    public static final DeferredItem<Item> DIAMOND_NINJA_CHESTPLATE = ITEMS.registerItem("diamond_ninja_chestplate",
            props -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> DIAMOND_NINJA_LEGGINGS = ITEMS.registerItem("diamond_ninja_leggings",
            props -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> DIAMOND_NINJA_BOOTS = ITEMS.registerItem("diamond_ninja_boots",
            props -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.BOOTS, props));
    // Ninja - Steel
    public static final DeferredItem<Item> STEEL_NINJA_HELMET = ITEMS.registerItem("steel_ninja_helmet",
            props -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.HELMET, props));
    public static final DeferredItem<Item> STEEL_NINJA_CHESTPLATE = ITEMS.registerItem("steel_ninja_chestplate",
            props -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> STEEL_NINJA_LEGGINGS = ITEMS.registerItem("steel_ninja_leggings",
            props -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> STEEL_NINJA_BOOTS = ITEMS.registerItem("steel_ninja_boots",
            props -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.BOOTS, props));
    // Ninja - Netherite
    public static final DeferredItem<Item> NETHERITE_NINJA_HELMET = ITEMS.registerItem("netherite_ninja_helmet",
            props -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_CHESTPLATE = ITEMS.registerItem("netherite_ninja_chestplate",
            props -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_LEGGINGS = ITEMS.registerItem("netherite_ninja_leggings",
            props -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_BOOTS = ITEMS.registerItem("netherite_ninja_boots",
            props -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.BOOTS, props.fireResistant()));
    // Netherite Samurai
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET = ITEMS.registerItem("netherite_samurai_helmet",
            props -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE = ITEMS.registerItem("netherite_samurai_chestplate",
            props -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS = ITEMS.registerItem("netherite_samurai_leggings",
            props -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS = ITEMS.registerItem("netherite_samurai_boots",
            props -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.BOOTS, props.fireResistant()));
    // Blue Samurai
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET = ITEMS.registerItem("blue_samurai_helmet",
            props -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.HELMET, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE = ITEMS.registerItem("blue_samurai_chestplate",
            props -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS = ITEMS.registerItem("blue_samurai_leggings",
            props -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS = ITEMS.registerItem("blue_samurai_boots",
            props -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.BOOTS, props));
    // Green Samurai
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET = ITEMS.registerItem("green_samurai_helmet",
            props -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE = ITEMS.registerItem("green_samurai_chestplate",
            props -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS = ITEMS.registerItem("green_samurai_leggings",
            props -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS = ITEMS.registerItem("green_samurai_boots",
            props -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.BOOTS, props));
    // White Samurai
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET = ITEMS.registerItem("white_samurai_helmet",
            props -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE = ITEMS.registerItem("white_samurai_chestplate",
            props -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS = ITEMS.registerItem("white_samurai_leggings",
            props -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS = ITEMS.registerItem("white_samurai_boots",
            props -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.BOOTS, props));
    // Gray Samurai
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET = ITEMS.registerItem("gray_samurai_helmet",
            props -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE = ITEMS.registerItem("gray_samurai_chestplate",
            props -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS = ITEMS.registerItem("gray_samurai_leggings",
            props -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS = ITEMS.registerItem("gray_samurai_boots",
            props -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.BOOTS, props));
    
    // ========== LIGHT VARIANTS ==========
    // Iron Samurai Light
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("iron_samurai_helmet_light",
            props -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.HELMET, props));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("iron_samurai_chestplate_light",
            props -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("iron_samurai_leggings_light",
            props -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("iron_samurai_boots_light",
            props -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.BOOTS, props));
    // Gold Samurai Light
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("gold_samurai_helmet_light",
            props -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("gold_samurai_chestplate_light",
            props -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("gold_samurai_leggings_light",
            props -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("gold_samurai_boots_light",
            props -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.BOOTS, props));
    // Diamond Samurai Light
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("diamond_samurai_helmet_light",
            props -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.HELMET, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("diamond_samurai_chestplate_light",
            props -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("diamond_samurai_leggings_light",
            props -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("diamond_samurai_boots_light",
            props -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.BOOTS, props));
    // Red Samurai Light
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("red_samurai_helmet_light",
            props -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.HELMET, props));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("red_samurai_chestplate_light",
            props -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("red_samurai_leggings_light",
            props -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("red_samurai_boots_light",
            props -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.BOOTS, props));
    // Blue Samurai Light
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("blue_samurai_helmet_light",
            props -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.HELMET, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("blue_samurai_chestplate_light",
            props -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("blue_samurai_leggings_light",
            props -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("blue_samurai_boots_light",
            props -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.BOOTS, props));
    // Green Samurai Light
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("green_samurai_helmet_light",
            props -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("green_samurai_chestplate_light",
            props -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("green_samurai_leggings_light",
            props -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("green_samurai_boots_light",
            props -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.BOOTS, props));
    // White Samurai Light
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("white_samurai_helmet_light",
            props -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("white_samurai_chestplate_light",
            props -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("white_samurai_leggings_light",
            props -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("white_samurai_boots_light",
            props -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.BOOTS, props));
    // Gray Samurai Light
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("gray_samurai_helmet_light",
            props -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("gray_samurai_chestplate_light",
            props -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("gray_samurai_leggings_light",
            props -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("gray_samurai_boots_light",
            props -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.BOOTS, props));
    // Netherite Samurai Light
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_LIGHT = ITEMS.registerItem("netherite_samurai_helmet_light",
            props -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.registerItem("netherite_samurai_chestplate_light",
            props -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.registerItem("netherite_samurai_leggings_light",
            props -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_LIGHT = ITEMS.registerItem("netherite_samurai_boots_light",
            props -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.BOOTS, props.fireResistant()));
    
    // ========== MASTER VARIANTS ==========
    // Iron Samurai Master
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_MASTER = ITEMS.registerItem("iron_samurai_helmet_master",
            props -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("iron_samurai_chestplate_master",
            props -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("iron_samurai_leggings_master",
            props -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("iron_samurai_boots_master",
            props -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.BOOTS, props));
    // Gold Samurai Master
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_MASTER = ITEMS.registerItem("gold_samurai_helmet_master",
            props -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("gold_samurai_chestplate_master",
            props -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("gold_samurai_leggings_master",
            props -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("gold_samurai_boots_master",
            props -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.BOOTS, props));
    // Diamond Samurai Master
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_MASTER = ITEMS.registerItem("diamond_samurai_helmet_master",
            props -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("diamond_samurai_chestplate_master",
            props -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("diamond_samurai_leggings_master",
            props -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("diamond_samurai_boots_master",
            props -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.BOOTS, props));
    // Red Samurai Master
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_MASTER = ITEMS.registerItem("red_samurai_helmet_master",
            props -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("red_samurai_chestplate_master",
            props -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("red_samurai_leggings_master",
            props -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("red_samurai_boots_master",
            props -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.BOOTS, props));
    // Blue Samurai Master
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_MASTER = ITEMS.registerItem("blue_samurai_helmet_master",
            props -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("blue_samurai_chestplate_master",
            props -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("blue_samurai_leggings_master",
            props -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("blue_samurai_boots_master",
            props -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.BOOTS, props));
    // Green Samurai Master
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_MASTER = ITEMS.registerItem("green_samurai_helmet_master",
            props -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("green_samurai_chestplate_master",
            props -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("green_samurai_leggings_master",
            props -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("green_samurai_boots_master",
            props -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.BOOTS, props));
    // White Samurai Master
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_MASTER = ITEMS.registerItem("white_samurai_helmet_master",
            props -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("white_samurai_chestplate_master",
            props -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("white_samurai_leggings_master",
            props -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("white_samurai_boots_master",
            props -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.BOOTS, props));
    // Gray Samurai Master
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_MASTER = ITEMS.registerItem("gray_samurai_helmet_master",
            props -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.HELMET, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("gray_samurai_chestplate_master",
            props -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("gray_samurai_leggings_master",
            props -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("gray_samurai_boots_master",
            props -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.BOOTS, props));
    // Netherite Samurai Master
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_MASTER = ITEMS.registerItem("netherite_samurai_helmet_master",
            props -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.registerItem("netherite_samurai_chestplate_master",
            props -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_MASTER = ITEMS.registerItem("netherite_samurai_leggings_master",
            props -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_MASTER = ITEMS.registerItem("netherite_samurai_boots_master",
            props -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.BOOTS, props.fireResistant()));
    
    // ========== SPECIAL ARMOR SETS ==========
    // Steel Armor
    public static final DeferredItem<Item> STEEL_HELMET = ITEMS.registerItem("steel_helmet",
            props -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.HELMET, props));
    public static final DeferredItem<Item> STEEL_CHESTPLATE = ITEMS.registerItem("steel_chestplate",
            props -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> STEEL_LEGGINGS = ITEMS.registerItem("steel_leggings",
            props -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> STEEL_BOOTS = ITEMS.registerItem("steel_boots",
            props -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.BOOTS, props));
    // Amethyst Samurai
    public static final DeferredItem<Item> AMETHYST_SAMURAI_HELMET = ITEMS.registerItem("amethyst_samurai_helmet",
            props -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.HELMET, props));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_CHESTPLATE = ITEMS.registerItem("amethyst_samurai_chestplate",
            props -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_LEGGINGS = ITEMS.registerItem("amethyst_samurai_leggings",
            props -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_BOOTS = ITEMS.registerItem("amethyst_samurai_boots",
            props -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.BOOTS, props));
    // Quartz Samurai
    public static final DeferredItem<Item> QUARTZ_SAMURAI_HELMET = ITEMS.registerItem("quartz_samurai_helmet",
            props -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.HELMET, props));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_CHESTPLATE = ITEMS.registerItem("quartz_samurai_chestplate",
            props -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_LEGGINGS = ITEMS.registerItem("quartz_samurai_leggings",
            props -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_BOOTS = ITEMS.registerItem("quartz_samurai_boots",
            props -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.BOOTS, props));
    // Sculk Samurai
    public static final DeferredItem<Item> SCULK_SAMURAI_HELMET = ITEMS.registerItem("sculk_samurai_helmet",
            props -> new SculkSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SCULK, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> SCULK_SAMURAI_CHESTPLATE = ITEMS.registerItem("sculk_samurai_chestplate",
            props -> new SculkSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SCULK, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> SCULK_SAMURAI_LEGGINGS = ITEMS.registerItem("sculk_samurai_leggings",
            props -> new SculkSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SCULK, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> SCULK_SAMURAI_BOOTS = ITEMS.registerItem("sculk_samurai_boots",
            props -> new SculkSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SCULK, ArmorType.BOOTS, props.fireResistant()));
    // Etyrite Samurai
    public static final DeferredItem<Item> ETYRITE_SAMURAI_HELMET = ITEMS.registerItem("etyrite_samurai_helmet",
            props -> new EtyriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ETYRITE, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> ETYRITE_SAMURAI_CHESTPLATE = ITEMS.registerItem("etyrite_samurai_chestplate",
            props -> new EtyriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ETYRITE, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> ETYRITE_SAMURAI_LEGGINGS = ITEMS.registerItem("etyrite_samurai_leggings",
            props -> new EtyriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ETYRITE, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> ETYRITE_SAMURAI_BOOTS = ITEMS.registerItem("etyrite_samurai_boots",
            props -> new EtyriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ETYRITE, ArmorType.BOOTS, props.fireResistant()));
    // Tyr Samurai
    public static final DeferredItem<Item> TYR_SAMURAI_HELMET = ITEMS.registerItem("tyr_samurai_helmet",
            props -> new TyrSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_TYR, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> TYR_SAMURAI_CHESTPLATE = ITEMS.registerItem("tyr_samurai_chestplate",
            props -> new TyrSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_TYR, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> TYR_SAMURAI_LEGGINGS = ITEMS.registerItem("tyr_samurai_leggings",
            props -> new TyrSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_TYR, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> TYR_SAMURAI_BOOTS = ITEMS.registerItem("tyr_samurai_boots",
            props -> new TyrSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_TYR, ArmorType.BOOTS, props.fireResistant()));
    // Draco Samurai
    public static final DeferredItem<Item> DRACO_SAMURAI_HELMET = ITEMS.registerItem("draco_samurai_helmet",
            props -> new DracoSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DRACO, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> DRACO_SAMURAI_CHESTPLATE = ITEMS.registerItem("draco_samurai_chestplate",
            props -> new DracoSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DRACO, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> DRACO_SAMURAI_LEGGINGS = ITEMS.registerItem("draco_samurai_leggings",
            props -> new DracoSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DRACO, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> DRACO_SAMURAI_BOOTS = ITEMS.registerItem("draco_samurai_boots",
            props -> new DracoSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DRACO, ArmorType.BOOTS, props.fireResistant()));
    // Living Samurai
    public static final DeferredItem<Item> LIVING_SAMURAI_HELMET = ITEMS.registerItem("living_samurai_helmet",
            props -> new LivingSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_LIVING, ArmorType.HELMET, props.fireResistant()));
    public static final DeferredItem<Item> LIVING_SAMURAI_CHESTPLATE = ITEMS.registerItem("living_samurai_chestplate",
            props -> new LivingSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_LIVING, ArmorType.CHESTPLATE, props.fireResistant()));
    public static final DeferredItem<Item> LIVING_SAMURAI_LEGGINGS = ITEMS.registerItem("living_samurai_leggings",
            props -> new LivingSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_LIVING, ArmorType.LEGGINGS, props.fireResistant()));
    public static final DeferredItem<Item> LIVING_SAMURAI_BOOTS = ITEMS.registerItem("living_samurai_boots",
            props -> new LivingSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_LIVING, ArmorType.BOOTS, props.fireResistant()));
    // Neptunium Samurai
    public static final DeferredItem<Item> NEPTUNIUM_SAMURAI_HELMET = ITEMS.registerItem("neptunium_samurai_helmet",
            props -> new NeptuniumSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NEPTUN, ArmorType.HELMET, props));
    public static final DeferredItem<Item> NEPTUNIUM_SAMURAI_CHESTPLATE = ITEMS.registerItem("neptunium_samurai_chestplate",
            props -> new NeptuniumSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NEPTUN, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> NEPTUNIUM_SAMURAI_LEGGINGS = ITEMS.registerItem("neptunium_samurai_leggings",
            props -> new NeptuniumSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NEPTUN, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> NEPTUNIUM_SAMURAI_BOOTS = ITEMS.registerItem("neptunium_samurai_boots",
            props -> new NeptuniumSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NEPTUN, ArmorType.BOOTS, props));
    // Brass Samurai
    public static final DeferredItem<Item> BRASS_SAMURAI_HELMET = ITEMS.registerItem("brass_samurai_helmet",
            props -> new BrassSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_BRASS, ArmorType.HELMET, props));
    public static final DeferredItem<Item> BRASS_SAMURAI_CHESTPLATE = ITEMS.registerItem("brass_samurai_chestplate",
            props -> new BrassSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_BRASS, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> BRASS_SAMURAI_LEGGINGS = ITEMS.registerItem("brass_samurai_leggings",
            props -> new BrassSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_BRASS, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> BRASS_SAMURAI_BOOTS = ITEMS.registerItem("brass_samurai_boots",
            props -> new BrassSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_BRASS, ArmorType.BOOTS, props));
    // Mage Samurai
    public static final DeferredItem<Item> MAGE_SAMURAI_HELMET = ITEMS.registerItem("mage_samurai_helmet",
            props -> new MageSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_MAGE, ArmorType.HELMET, props));
    public static final DeferredItem<Item> MAGE_SAMURAI_CHESTPLATE = ITEMS.registerItem("mage_samurai_chestplate",
            props -> new MageSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_MAGE, ArmorType.CHESTPLATE, props));
    public static final DeferredItem<Item> MAGE_SAMURAI_LEGGINGS = ITEMS.registerItem("mage_samurai_leggings",
            props -> new MageSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_MAGE, ArmorType.LEGGINGS, props));
    public static final DeferredItem<Item> MAGE_SAMURAI_BOOTS = ITEMS.registerItem("mage_samurai_boots",
            props -> new MageSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_MAGE, ArmorType.BOOTS, props));
    // Special - Straw Hat & Kimono
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
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.AKANAME.get(), props));
    public static final DeferredItem<Item> KITSUNE_SPAWN_EGG = ITEMS.registerItem("kitsune_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KITSUNE.get(), props));
    public static final DeferredItem<Item> ENENRA_SPAWN_EGG = ITEMS.registerItem("enenra_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ENENRA.get(), props));
    public static final DeferredItem<Item> ONI_SPAWN_EGG = ITEMS.registerItem("oni_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ONI.get(), props));
    public static final DeferredItem<Item> ONIBI_SPAWN_EGG = ITEMS.registerItem("onibi_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.ONIBI.get(), props));
    public static final DeferredItem<Item> JOROGUMO_SPAWN_EGG = ITEMS.registerItem("jorogumo_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.JOROGUMO.get(), props));
    public static final DeferredItem<Item> KOMAINU_SPAWN_EGG = ITEMS.registerItem("komainu_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KOMAINU.get(), props));
    public static final DeferredItem<Item> TANUKI_SPAWN_EGG = ITEMS.registerItem("tanuki_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.TANUKI.get(), props));
    public static final DeferredItem<Item> KAWAUSO_SPAWN_EGG = ITEMS.registerItem("kawauso_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.KAWAUSO.get(), props));
    public static final DeferredItem<Item> TWOTAILED_SPAWN_EGG = ITEMS.registerItem("twotailed_spawn_egg",
            props -> new net.minecraft.world.item.SpawnEggItem(ModEntityTypes.TWOTAILED.get(), props));

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
