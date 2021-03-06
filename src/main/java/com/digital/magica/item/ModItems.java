package com.digital.magica.item;

import com.digital.magica.MagicaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicaMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> NEO_CRYSTAL = ITEMS.register("neo_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> ZAU_CRYSTAL = ITEMS.register("zau_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> GEO_CRYSTAL = ITEMS.register("geo_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> OAU_CRYSTAL = ITEMS.register("oau_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> YAU_CRYSTAL = ITEMS.register("yau_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> POA_CRYSTAL = ITEMS.register("poa_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));

    public static final RegistryObject<Item> KOA_CRYSTAL = ITEMS.register("koa_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MAGICA_TAB)));
    //


    //Registry block item
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    // Registry item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
