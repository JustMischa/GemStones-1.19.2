package de.mxscha.gemstones.utils.fluid;

import com.mojang.math.Vector3f;
import de.mxscha.gemstones.GemStones;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidsTypes {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation OIL_OVERLAY_RL = new ResourceLocation(GemStones.MOD_ID, "misc/in_oil_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GemStones.MOD_ID);

    public static final RegistryObject<FluidType> OIL_FLUID_TYPE = register("oil_fluid", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5), 0xA1E038D0, 224f, 56f, 208f);

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties, int color, float red, float blue, float green) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, OIL_OVERLAY_RL, color, new Vector3f(red / 255f, blue / 255f, green / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
