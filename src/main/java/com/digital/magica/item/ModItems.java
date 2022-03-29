package com.digital.magica.item;

import com.digital.magica.MagicaMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicaMod.MOD_ID);
    //
public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).durability(15).tab(CreativeModeTab.TAB_SEARCH)));
    //
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
