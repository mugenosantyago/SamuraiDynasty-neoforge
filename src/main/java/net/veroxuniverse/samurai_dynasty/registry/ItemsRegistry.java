package net.veroxuniverse.samurai_dynasty.registry;

import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, SamuraiDynastyMod.MOD_ID);

    // ========== MATERIALS / GEMS ==========
    public static final DeferredHolder<Item, Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredHolder<Item, Item> JADE = ITEMS.registerSimpleItem("jade");
    public static final DeferredHolder<Item, Item> AQUAMARINE = ITEMS.registerSimpleItem("aquamarine");
    public static final DeferredHolder<Item, Item> ONYX = ITEMS.registerSimpleItem("onyx");
    public static final DeferredHolder<Item, Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
