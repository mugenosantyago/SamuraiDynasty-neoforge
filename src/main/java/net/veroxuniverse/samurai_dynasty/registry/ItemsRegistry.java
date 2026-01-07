package net.veroxuniverse.samurai_dynasty.registry;

import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
