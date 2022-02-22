package com.stachegamer1609.createfa;

import com.stachegamer1609.createfa.core.init.FluidInit;
import com.stachegamer1609.createfa.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateFoodAdditions.MOD_ID)
public class CreateFoodAdditions {
    public static final String MOD_ID = "createfa";

    public static final CreativeModeTab createfatab = new CreateFoodAdditionsTab();

    public CreateFoodAdditions() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        FluidInit.FLUIDS.register(bus);
    }
}