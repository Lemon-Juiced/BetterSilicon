package lemon_juice.better_silicon;

import lemon_juice.better_silicon.block.ModBlocks;
import lemon_juice.better_silicon.creativetab.ModCreativeTab;
import lemon_juice.better_silicon.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterSilicon.MOD_ID)
public class BetterSilicon {
    public static final String MOD_ID = "better_silicon";

    public BetterSilicon(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
