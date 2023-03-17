package lemon_juice.better_silicon.creativetab;

import lemon_juice.better_silicon.BetterSilicon;
import lemon_juice.better_silicon.block.ModBlocks;
import lemon_juice.better_silicon.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation BETTER_SILICON_TAB = new ResourceLocation(BetterSilicon.MOD_ID, "better_silicon");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(BETTER_SILICON_TAB, builder -> builder
                .title(Component.translatable("itemGroup.better_silicon"))
                .icon(() -> new ItemStack(ModItems.SILICON.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.SILICEOUS_COMPOUND.get()));
                    output.accept(new ItemStack(ModItems.SILICON.get()));
                    output.accept(new ItemStack(ModBlocks.SILICON_BLOCK.get()));
                }));
    }
}
