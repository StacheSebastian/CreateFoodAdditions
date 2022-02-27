package io.github.stachesebastian.createfa.core.init;

import io.github.stachesebastian.createfa.CreateFoodAdditions;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateFoodAdditions.MOD_ID);


}
