package io.github.stachesebastian.createfa;

import com.simibubi.create.AllItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreateFoodAdditionsTab extends CreativeModeTab {
    public CreateFoodAdditionsTab()
    {
        super ("createfatab");
    }

    @Override
    public ItemStack makeIcon() {
        return AllItems.HONEYED_APPLE.get().getDefaultInstance();
    }
}
