package de.mxscha.gemstones.datagen;

import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        // example Crafting
        ShapedRecipeBuilder.shaped(ModBlocks.SAPPHIRE_BLOCK.get()).define('E', ModItems.SAPPHIRE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_sapphire_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SAPPHIRE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get()).define('E', ModItems.RUBY_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_ruby_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RUBY_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CITRINE_BLOCK.get()).define('E', ModItems.CITRINE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_citrine_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.CITRINE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.AMETHYST_BLOCK.get()).define('E', ModItems.AMETHYST_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_amethyst_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.AMETHYST_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.DIOPSIDE_BLOCK.get()).define('E', ModItems.DIOPSIDE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_diopside_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DIOPSIDE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.JADE_BLOCK.get()).define('E', ModItems.JADE_GEM.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_jade_gem", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.JADE_GEM.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CAERULA_BLOCK.get()).define('E', ModItems.CAERULA_INGOT.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_caerula_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.CAERULA_INGOT.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ENERGETIC_BLOCK.get()).define('E', ModItems.ENERGETIC_INGOT.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_energetic_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ENERGETIC_INGOT.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.TIN_BLOCK.get()).define('E', ModItems.TIN_INGOT.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(finishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ENDER_BLOCK.get()).define('E', ModItems.ENDER_INGOT.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_another_ender_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ENDER_INGOT.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.SAPPHIRE_GEM.get(), 9).requires(ModBlocks.SAPPHIRE_BLOCK.get(), 1).unlockedBy("has_another_sapphire_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SAPPHIRE_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RUBY_GEM.get(), 9).requires(ModBlocks.RUBY_BLOCK.get(), 1).unlockedBy("has_another_ruby_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RUBY_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.CITRINE_GEM.get(), 9).requires(ModBlocks.CITRINE_BLOCK.get(), 1).unlockedBy("has_another_citrine_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CITRINE_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.AMETHYST_GEM.get(), 9).requires(ModBlocks.AMETHYST_BLOCK.get(), 1).unlockedBy("has_another_amethyst_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.AMETHYST_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.DIOPSIDE_GEM.get(), 9).requires(ModBlocks.DIOPSIDE_BLOCK.get(), 1).unlockedBy("has_another_diopside_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DIOPSIDE_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.JADE_GEM.get(), 9).requires(ModBlocks.JADE_BLOCK.get(), 1).unlockedBy("has_another_jade_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JADE_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.CAERULA_INGOT.get(), 9).requires(ModBlocks.CAERULA_BLOCK.get(), 1).unlockedBy("has_another_caerula_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CAERULA_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ENERGETIC_INGOT.get(), 9).requires(ModBlocks.ENERGETIC_BLOCK.get(), 1).unlockedBy("has_another_energetic_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ENERGETIC_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.TIN_INGOT.get(), 9).requires(ModBlocks.TIN_BLOCK.get(), 1).unlockedBy("has_another_tin_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_BLOCK.get()).build())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ENDER_INGOT.get(), 9).requires(ModBlocks.ENDER_BLOCK.get(), 1).unlockedBy("has_another_ender_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ENDER_BLOCK.get()).build())).save(finishedRecipeConsumer);
    }
}