package com.stachegamer1609.createfa;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CreateFoodAdditionsTab extends CreativeModeTab {
    public CreateFoodAdditionsTab()
    {
        super ("createfatab");
    }

    @Override
    public ItemStack makeIcon() {
        return Items.HONEY_BOTTLE.getDefaultInstance();
    }
}
