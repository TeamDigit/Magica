package com.digital.magica.item;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ModCreativeModeTab {

    public static final CreativeModeTab MAGICA_TAB = new CreativeModeTab("magicatab") {

        // Icon
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GEO_CRYSTAL.get());
        }
    };
}