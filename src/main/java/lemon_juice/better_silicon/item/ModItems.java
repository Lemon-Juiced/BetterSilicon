package lemon_juice.better_silicon.item;

import lemon_juice.better_silicon.BetterSilicon;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterSilicon.MOD_ID);

    public static final DeferredItem<Item> SILICEOUS_COMPOUND = ITEMS.register("siliceous_compound", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
