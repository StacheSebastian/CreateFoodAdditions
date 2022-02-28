package io.github.stachesebastian.createfa.core.init;

import com.simibubi.create.content.contraptions.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.FluidEntry;
import io.github.stachesebastian.createfa.CreateFoodAdditions;

public class FluidInit {

    private static final CreateRegistrate REGISTRATE = CreateFoodAdditions.registrate();

    public FluidInit() {}
    public static void register() {}

    public static final FluidEntry<VirtualFluid> PANCAKE_BATTER = REGISTRATE.virtualFluid("pancake_batter")
            .lang(f -> "fluid.createfa.pancake_batter")
            .register();

}
