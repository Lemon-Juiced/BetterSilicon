package lemon_juice.better_silicon;

import lemon_juice.better_silicon.block.ModBlocks;
import lemon_juice.better_silicon.creativetab.CreativeTab;
import lemon_juice.better_silicon.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterSilicon.MOD_ID)
public class BetterSilicon {
    public static final String MOD_ID = "better_silicon";

    public BetterSilicon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        modEventBus.addListener(CreativeTab::registerTabs);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
