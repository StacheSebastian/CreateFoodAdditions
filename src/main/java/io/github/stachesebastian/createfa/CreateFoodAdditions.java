package io.github.stachesebastian.createfa;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;
import io.github.stachesebastian.createfa.core.init.FluidInit;
import io.github.stachesebastian.createfa.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateFoodAdditions.MOD_ID)
public class CreateFoodAdditions {
    public static final String MOD_ID = "createfa";
    private static final NonNullLazyValue<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MOD_ID);

    public static final CreativeModeTab createfatab = new CreateFoodAdditionsTab();

    public CreateFoodAdditions() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        FluidInit.register();
    }

    public static CreateRegistrate registrate() {
        return (CreateRegistrate)REGISTRATE.get();
    }

}