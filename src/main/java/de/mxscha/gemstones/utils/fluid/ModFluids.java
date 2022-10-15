package de.mxscha.gemstones.utils.fluid;


import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, GemStones.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_OIL_WATER = FLUIDS.register("oil_water_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.OIL_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_OIL_WATER = FLUIDS.register("flowing_oil_water", () -> new ForgeFlowingFluid.Flowing(ModFluids.OIL_WATER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties OIL_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ModFluidsTypes.OIL_FLUID_TYPE, SOURCE_OIL_WATER, FLOWING_OIL_WATER).slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.OIL_WATER_BLOCK).bucket(ModItems.OIL_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
