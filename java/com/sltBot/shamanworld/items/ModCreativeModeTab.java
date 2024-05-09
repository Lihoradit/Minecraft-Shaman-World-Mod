package com.sltBot.shamanworld.items;

import com.sltBot.shamanworld.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SHAMAN_WORLD_TAB = new CreativeModeTab("shamanworldtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TOTEM_HOME_BLOCK.get());
        }
    };
}
