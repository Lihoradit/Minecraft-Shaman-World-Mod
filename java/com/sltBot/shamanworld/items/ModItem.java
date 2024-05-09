package com.sltBot.shamanworld.items;

import com.sltBot.shamanworld.ShamanWorld;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShamanWorld.MOD_ID);
    public static final RegistryObject<Item> jewsharp = ITEMS.register("jewsharp",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHAMAN_WORLD_TAB)));
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
