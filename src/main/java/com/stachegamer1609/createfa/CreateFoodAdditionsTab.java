package com.stachegamer1609.createfa;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CreateFoodAdditionsTab extends ItemGroup {
    public CreateFoodAdditionsTab()
    {
        super ("createfatab");
    }

    @Override
    public ItemStack makeIcon() {
        return Items.HONEY_BOTTLE.getDefaultInstance();
    }
}
