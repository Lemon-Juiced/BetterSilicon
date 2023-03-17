package lemon_juice.better_silicon.item;

import lemon_juice.better_silicon.BetterSilicon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterSilicon.MOD_ID);

    public static final RegistryObject<Item> SILICEOUS_COMPOUND = ITEMS.register("siliceous_compound", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
