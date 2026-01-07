package net.veroxuniverse.samurai_dynasty.registry;

import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamuraiDynastyMod.MOD_ID);

    // Temporarily disabled all items to debug registration issue
    // TODO: Re-enable items one section at a time to find the problematic registration

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
