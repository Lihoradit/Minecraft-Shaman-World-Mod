package com.sltBot.shamanwrld.items;

import com.sltBot.shamanwrld.ShamanWorld;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JewsHarp {
    public static final DeferredRegister<Item> jewsHarp =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShamanWorld.MOD_ID);
    public static final RegistryObject<Item> ZIRCON = jewsHarp.register("jewsharp",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static void register (IEventBus eventBus){
        jewsHarp.register(eventBus);
    }
}
