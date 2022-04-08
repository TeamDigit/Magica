package com.digital.magica.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.lwjgl.system.CallbackI;

public class ModCreativeModeTab {

    public static final CreativeModeTab MAGICA_TAB = new CreativeModeTab("magicatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GEO_CRYSTAL.get());
        }
    };
}
