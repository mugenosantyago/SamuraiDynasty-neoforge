package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
// import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.entity.ModEntityTypes;
import net.veroxuniverse.samurai_dynasty.item.armor.*;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // ========== SAMURAI ARMOR - IRON ==========
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET = ITEMS.register("iron_samurai_helmet",
            () -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE = ITEMS.register("iron_samurai_chestplate",
            () -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS = ITEMS.register("iron_samurai_leggings",
            () -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS = ITEMS.register("iron_samurai_boots",
            () -> new IronSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_LIGHT = ITEMS.register("iron_samurai_helmet_light",
            () -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("iron_samurai_chestplate_light",
            () -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("iron_samurai_leggings_light",
            () -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_LIGHT = ITEMS.register("iron_samurai_boots_light",
            () -> new IronSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_IRON, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_HELMET_MASTER = ITEMS.register("iron_samurai_helmet_master",
            () -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("iron_samurai_chestplate_master",
            () -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_LEGGINGS_MASTER = ITEMS.register("iron_samurai_leggings_master",
            () -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SAMURAI_BOOTS_MASTER = ITEMS.register("iron_samurai_boots_master",
            () -> new IronSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_IRON_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - WHITE/SILVER ==========
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET = ITEMS.register("white_samurai_helmet",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE = ITEMS.register("white_samurai_chestplate",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS = ITEMS.register("white_samurai_leggings",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS = ITEMS.register("white_samurai_boots",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_LIGHT = ITEMS.register("white_samurai_helmet_light",
            () -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("white_samurai_chestplate_light",
            () -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("white_samurai_leggings_light",
            () -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_LIGHT = ITEMS.register("white_samurai_boots_light",
            () -> new WhiteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_SILVER, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_HELMET_MASTER = ITEMS.register("white_samurai_helmet_master",
            () -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("white_samurai_chestplate_master",
            () -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_LEGGINGS_MASTER = ITEMS.register("white_samurai_leggings_master",
            () -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SAMURAI_BOOTS_MASTER = ITEMS.register("white_samurai_boots_master",
            () -> new WhiteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_SILVER_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - GOLD ==========
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET = ITEMS.register("gold_samurai_helmet",
            () -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE = ITEMS.register("gold_samurai_chestplate",
            () -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS = ITEMS.register("gold_samurai_leggings",
            () -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS = ITEMS.register("gold_samurai_boots",
            () -> new GoldSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_LIGHT = ITEMS.register("gold_samurai_helmet_light",
            () -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("gold_samurai_chestplate_light",
            () -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("gold_samurai_leggings_light",
            () -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_LIGHT = ITEMS.register("gold_samurai_boots_light",
            () -> new GoldSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_GOLD, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_HELMET_MASTER = ITEMS.register("gold_samurai_helmet_master",
            () -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("gold_samurai_chestplate_master",
            () -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_LEGGINGS_MASTER = ITEMS.register("gold_samurai_leggings_master",
            () -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SAMURAI_BOOTS_MASTER = ITEMS.register("gold_samurai_boots_master",
            () -> new GoldSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_GOLD_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - DIAMOND ==========
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET = ITEMS.register("diamond_samurai_helmet",
            () -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE = ITEMS.register("diamond_samurai_chestplate",
            () -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS = ITEMS.register("diamond_samurai_leggings",
            () -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS = ITEMS.register("diamond_samurai_boots",
            () -> new DiamondSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_LIGHT = ITEMS.register("diamond_samurai_helmet_light",
            () -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("diamond_samurai_chestplate_light",
            () -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("diamond_samurai_leggings_light",
            () -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_LIGHT = ITEMS.register("diamond_samurai_boots_light",
            () -> new DiamondSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_HELMET_MASTER = ITEMS.register("diamond_samurai_helmet_master",
            () -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("diamond_samurai_chestplate_master",
            () -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_LEGGINGS_MASTER = ITEMS.register("diamond_samurai_leggings_master",
            () -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SAMURAI_BOOTS_MASTER = ITEMS.register("diamond_samurai_boots_master",
            () -> new DiamondSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_DIAMOND_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - NETHERITE ==========
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET = ITEMS.register("netherite_samurai_helmet",
            () -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE = ITEMS.register("netherite_samurai_chestplate",
            () -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS = ITEMS.register("netherite_samurai_leggings",
            () -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.LEGGINGS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS = ITEMS.register("netherite_samurai_boots",
            () -> new NetheriteSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.BOOTS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_LIGHT = ITEMS.register("netherite_samurai_helmet_light",
            () -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("netherite_samurai_chestplate_light",
            () -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("netherite_samurai_leggings_light",
            () -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.LEGGINGS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_LIGHT = ITEMS.register("netherite_samurai_boots_light",
            () -> new NetheriteSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE, ArmorType.BOOTS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_HELMET_MASTER = ITEMS.register("netherite_samurai_helmet_master",
            () -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("netherite_samurai_chestplate_master",
            () -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_LEGGINGS_MASTER = ITEMS.register("netherite_samurai_leggings_master",
            () -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.LEGGINGS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_SAMURAI_BOOTS_MASTER = ITEMS.register("netherite_samurai_boots_master",
            () -> new NetheriteSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_NETHERITE_MASTER, ArmorType.BOOTS, new Item.Properties().fireResistant()));

    // ========== SAMURAI ARMOR - AMETHYST ==========
    public static final DeferredItem<Item> AMETHYST_SAMURAI_HELMET = ITEMS.register("amethyst_samurai_helmet",
            () -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_CHESTPLATE = ITEMS.register("amethyst_samurai_chestplate",
            () -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_LEGGINGS = ITEMS.register("amethyst_samurai_leggings",
            () -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.LEGGINGS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> AMETHYST_SAMURAI_BOOTS = ITEMS.register("amethyst_samurai_boots",
            () -> new AmethystSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AMETHYST, ArmorType.BOOTS, new Item.Properties().fireResistant()));

    // ========== SAMURAI ARMOR - QUARTZ ==========
    public static final DeferredItem<Item> QUARTZ_SAMURAI_HELMET = ITEMS.register("quartz_samurai_helmet",
            () -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_CHESTPLATE = ITEMS.register("quartz_samurai_chestplate",
            () -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_LEGGINGS = ITEMS.register("quartz_samurai_leggings",
            () -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.LEGGINGS, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> QUARTZ_SAMURAI_BOOTS = ITEMS.register("quartz_samurai_boots",
            () -> new QuartzSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_QUARTZ, ArmorType.BOOTS, new Item.Properties().fireResistant()));

    // ========== SAMURAI ARMOR - RED/RUBY ==========
    public static final DeferredItem<Item> RED_SAMURAI_HELMET = ITEMS.register("red_samurai_helmet",
            () -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE = ITEMS.register("red_samurai_chestplate",
            () -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS = ITEMS.register("red_samurai_leggings",
            () -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS = ITEMS.register("red_samurai_boots",
            () -> new RedSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_LIGHT = ITEMS.register("red_samurai_helmet_light",
            () -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("red_samurai_chestplate_light",
            () -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("red_samurai_leggings_light",
            () -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_LIGHT = ITEMS.register("red_samurai_boots_light",
            () -> new RedSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_RUBY, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_HELMET_MASTER = ITEMS.register("red_samurai_helmet_master",
            () -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("red_samurai_chestplate_master",
            () -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_LEGGINGS_MASTER = ITEMS.register("red_samurai_leggings_master",
            () -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> RED_SAMURAI_BOOTS_MASTER = ITEMS.register("red_samurai_boots_master",
            () -> new RedSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_RUBY_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - BLUE/AQUAMARINE ==========
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET = ITEMS.register("blue_samurai_helmet",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE = ITEMS.register("blue_samurai_chestplate",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS = ITEMS.register("blue_samurai_leggings",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS = ITEMS.register("blue_samurai_boots",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_LIGHT = ITEMS.register("blue_samurai_helmet_light",
            () -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("blue_samurai_chestplate_light",
            () -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("blue_samurai_leggings_light",
            () -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_LIGHT = ITEMS.register("blue_samurai_boots_light",
            () -> new BlueSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_AQUA, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_HELMET_MASTER = ITEMS.register("blue_samurai_helmet_master",
            () -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("blue_samurai_chestplate_master",
            () -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_LEGGINGS_MASTER = ITEMS.register("blue_samurai_leggings_master",
            () -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SAMURAI_BOOTS_MASTER = ITEMS.register("blue_samurai_boots_master",
            () -> new BlueSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_AQUA_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - GREEN/JADE ==========
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET = ITEMS.register("green_samurai_helmet",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE = ITEMS.register("green_samurai_chestplate",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS = ITEMS.register("green_samurai_leggings",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS = ITEMS.register("green_samurai_boots",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_LIGHT = ITEMS.register("green_samurai_helmet_light",
            () -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("green_samurai_chestplate_light",
            () -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("green_samurai_leggings_light",
            () -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_LIGHT = ITEMS.register("green_samurai_boots_light",
            () -> new GreenSamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_JADE, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_HELMET_MASTER = ITEMS.register("green_samurai_helmet_master",
            () -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("green_samurai_chestplate_master",
            () -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_LEGGINGS_MASTER = ITEMS.register("green_samurai_leggings_master",
            () -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SAMURAI_BOOTS_MASTER = ITEMS.register("green_samurai_boots_master",
            () -> new GreenSamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_JADE_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== SAMURAI ARMOR - GRAY/ONYX ==========
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET = ITEMS.register("gray_samurai_helmet",
            () -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE = ITEMS.register("gray_samurai_chestplate",
            () -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS = ITEMS.register("gray_samurai_leggings",
            () -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS = ITEMS.register("gray_samurai_boots",
            () -> new GraySamuraiArmorItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_LIGHT = ITEMS.register("gray_samurai_helmet_light",
            () -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_LIGHT = ITEMS.register("gray_samurai_chestplate_light",
            () -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_LIGHT = ITEMS.register("gray_samurai_leggings_light",
            () -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_LIGHT = ITEMS.register("gray_samurai_boots_light",
            () -> new GraySamuraiArmorLightItem(ArmorMaterialsRegistry.SAMURAI_ONYX, ArmorType.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_HELMET_MASTER = ITEMS.register("gray_samurai_helmet_master",
            () -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_CHESTPLATE_MASTER = ITEMS.register("gray_samurai_chestplate_master",
            () -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_LEGGINGS_MASTER = ITEMS.register("gray_samurai_leggings_master",
            () -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SAMURAI_BOOTS_MASTER = ITEMS.register("gray_samurai_boots_master",
            () -> new GraySamuraiArmorMasterItem(ArmorMaterialsRegistry.SAMURAI_ONYX_MASTER, ArmorType.BOOTS, new Item.Properties()));

    // ========== STEEL ARMOR ==========
    public static final DeferredItem<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new SteelArmorItem(ArmorMaterialsRegistry.SAMURAI_STEEL, ArmorType.BOOTS, new Item.Properties()));

    // ========== NINJA ARMOR - IRON ==========
    public static final DeferredItem<Item> IRON_NINJA_HELMET = ITEMS.register("iron_ninja_helmet",
            () -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> IRON_NINJA_CHESTPLATE = ITEMS.register("iron_ninja_chestplate",
            () -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> IRON_NINJA_BOOTS = ITEMS.register("iron_ninja_boots",
            () -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.BOOTS, new Item.Properties()));

    // ========== NINJA ARMOR - STEEL ==========
    public static final DeferredItem<Item> STEEL_NINJA_HELMET = ITEMS.register("steel_ninja_helmet",
            () -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NINJA_CHESTPLATE = ITEMS.register("steel_ninja_chestplate",
            () -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NINJA_BOOTS = ITEMS.register("steel_ninja_boots",
            () -> new SteelNinjaArmorItem(ArmorMaterialsRegistry.NINJA_STEEL, ArmorType.BOOTS, new Item.Properties()));

    // ========== NINJA ARMOR - GOLD ==========
    public static final DeferredItem<Item> GOLD_NINJA_HELMET = ITEMS.register("gold_ninja_helmet",
            () -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_NINJA_CHESTPLATE = ITEMS.register("gold_ninja_chestplate",
            () -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_NINJA_BOOTS = ITEMS.register("gold_ninja_boots",
            () -> new GoldNinjaArmorItem(ArmorMaterialsRegistry.NINJA_GOLD, ArmorType.BOOTS, new Item.Properties()));

    // ========== NINJA ARMOR - DIAMOND ==========
    public static final DeferredItem<Item> DIAMOND_NINJA_HELMET = ITEMS.register("diamond_ninja_helmet",
            () -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_NINJA_CHESTPLATE = ITEMS.register("diamond_ninja_chestplate",
            () -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_NINJA_BOOTS = ITEMS.register("diamond_ninja_boots",
            () -> new DiamondNinjaArmorItem(ArmorMaterialsRegistry.NINJA_DIAMOND, ArmorType.BOOTS, new Item.Properties()));

    // ========== NINJA ARMOR - NETHERITE ==========
    public static final DeferredItem<Item> NETHERITE_NINJA_HELMET = ITEMS.register("netherite_ninja_helmet",
            () -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.HELMET, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_CHESTPLATE = ITEMS.register("netherite_ninja_chestplate",
            () -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> NETHERITE_NINJA_BOOTS = ITEMS.register("netherite_ninja_boots",
            () -> new NetheriteNinjaArmorItem(ArmorMaterialsRegistry.NINJA_NETHERITE, ArmorType.BOOTS, new Item.Properties().fireResistant()));

    // ========== SHARED NINJA LEGGINGS ==========
    public static final DeferredItem<Item> NINJA_LEGGINGS = ITEMS.register("ninja_leggings",
            () -> new IronNinjaArmorItem(ArmorMaterialsRegistry.NINJA_IRON, ArmorType.LEGGINGS, new Item.Properties()));

    // ========== SPECIAL ARMOR ==========
    public static final DeferredItem<Item> KIMONO = ITEMS.register("kimono",
            () -> new KimonoArmorItem(ArmorMaterialsRegistry.CLOTH, ArmorType.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> STRAW_HAT = ITEMS.register("straw_hat",
            () -> new StrawHatArmorItem(ArmorMaterialsRegistry.STRAW, ArmorType.HELMET, new Item.Properties()));

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
    // TODO: Re-enable spawn eggs - requires fixing entity type registration timing
    // Spawn eggs cause "Block id not set" error due to registration order issues
    /*
    public static final DeferredItem<Item> AKANAME_SPAWN_EGG = ITEMS.register("akaname_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.AKANAME.get(), new Item.Properties()));
    public static final DeferredItem<Item> ENENRA_SPAWN_EGG = ITEMS.register("enenra_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.ENENRA.get(), new Item.Properties()));
    public static final DeferredItem<Item> ONI_SPAWN_EGG = ITEMS.register("oni_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.ONI.get(), new Item.Properties()));
    public static final DeferredItem<Item> KITSUNE_SPAWN_EGG = ITEMS.register("kitsune_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.KITSUNE.get(), new Item.Properties()));
    public static final DeferredItem<Item> KITSUNE_SMALL_SPAWN_EGG = ITEMS.register("kitsune_small_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.TWOTAILED.get(), new Item.Properties()));
    public static final DeferredItem<Item> ONIBI_SPAWN_EGG = ITEMS.register("onibi_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.ONIBI.get(), new Item.Properties()));
    public static final DeferredItem<Item> JOROGUMO_SPAWN_EGG = ITEMS.register("jorogumo_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.JOROGUMO.get(), new Item.Properties()));
    public static final DeferredItem<Item> KOMAINU_SPAWN_EGG = ITEMS.register("komainu_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.KOMAINU.get(), new Item.Properties()));
    public static final DeferredItem<Item> TANUKI_SPAWN_EGG = ITEMS.register("tanuki_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.TANUKI.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAWAUSO_SPAWN_EGG = ITEMS.register("kawauso_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.KAWAUSO.get(), new Item.Properties()));
    */

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
