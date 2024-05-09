package com.sltBot.shamanworld.block;

import com.sltBot.shamanworld.ShamanWorld;
import com.sltBot.shamanworld.items.ModCreativeModeTab;
import com.sltBot.shamanworld.items.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, ShamanWorld.MOD_ID);

    public static final RegistryObject<Block> TOTEM_HOME_BLOCK =
            registerBlock("totem_home_block",()-> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime()), ModCreativeModeTab.SHAMAN_WORLD_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCK.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItem.ITEMS.register(name,()->new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCK.register(eventBus);
    }
}
