package de.mxscha.gemstones.utils.recipes;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.utils.recipes.custom.OilGeneratorRecipe;
import de.mxscha.gemstones.utils.screen.OilGeneratorMenu;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, GemStones.MOD_ID);

    public static final RegistryObject<RecipeSerializer<OilGeneratorRecipe>> OIL_GENERATOR_SERIALIZER = SERIALIZERS.register("oil_generator", () -> OilGeneratorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
