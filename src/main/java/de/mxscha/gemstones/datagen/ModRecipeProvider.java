package de.mxscha.gemstones.datagen;

import de.mxscha.gemstones.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        // example Crafting
        ShapedRecipeBuilder.shaped(ModBlocks.EXAMPLE_BLOCK.get()).define('E', ModBlocks.ANOTHER_EXAMPLE_BLOCK.get()).pattern("E").pattern("E").pattern("E").
         unlockedBy("has_another_example_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ANOTHER_EXAMPLE_BLOCK.get()).build())).save(finishedRecipeConsumer);
    }
}
