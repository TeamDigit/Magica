package com.digital.magica.block;

import com.digital.magica.MagicaMod;
import com.digital.magica.custom.TestBlock;
import com.digital.magica.item.ModCreativeModeTab;
import com.digital.magica.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.digital.magica.item.ModItems.registerBlockItem;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicaMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new TestBlock(BlockBehaviour.Properties.of(Material.ICE).strength(5f).requiresCorrectToolForDrops().sound(SoundType.BAMBOO)), ModCreativeModeTab.MAGICA_TAB);


    // Registry block object
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // Registry block
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
