package lemon_juice.better_silicon.creativetab;

import lemon_juice.better_silicon.BetterSilicon;
import lemon_juice.better_silicon.block.ModBlocks;
import lemon_juice.better_silicon.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.f_279569_, BetterSilicon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_SILICON_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_silicon"))
            .icon(() -> new ItemStack(ModItems.SILICON.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_SILICON_TAB.get()){
            event.accept(ModItems.SILICEOUS_COMPOUND.get());
            event.accept(ModItems.SILICON.get());
            event.accept(ModBlocks.SILICON_BLOCK.get());
        }
    }

    /******************************** Registry ********************************/

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
