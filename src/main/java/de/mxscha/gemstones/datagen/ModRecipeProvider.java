package de.mxscha.gemstones.datagen;

import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
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
        ShapedRecipeBuilder.shaped(ModBlocks.SAPPHIRE_BLOCK.get()).define('E', ModItems.SAPPHIRE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
         unlockedBy("has_another_sapphire_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SAPPHIRE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get()).define('E', ModItems.RUBY_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
                unlockedBy("has_another_ruby_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RUBY_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CITRINE_BLOCK.get()).define('E', ModItems.CITRINE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
                unlockedBy("has_another_citrine_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.CITRINE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.AMETHYST_BLOCK.get()).define('E', ModItems.AMETHYST_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
                unlockedBy("has_another_amethyst_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.AMETHYST_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.DIOPSIDE_BLOCK.get()).define('E', ModItems.DIOPSIDE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
                unlockedBy("has_another_diopside_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DIOPSIDE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.JADE_BLOCK.get()).define('E', ModItems.JADE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").
                unlockedBy("has_another_jade_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.JADE_GEM.get()).build())).save(finishedRecipeConsumer);
    }
}
