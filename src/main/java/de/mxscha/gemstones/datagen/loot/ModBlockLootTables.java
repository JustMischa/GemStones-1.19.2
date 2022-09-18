package de.mxscha.gemstones.datagen.loot;

import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {

    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

    @Override
    protected void addTables() {
        //
        this.add(ModBlocks.SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_GEM.get()));
        this.add(ModBlocks.RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY_GEM.get()));
        this.add(ModBlocks.CITRINE_ORE.get(), (block) -> createOreDrop(ModBlocks.CITRINE_ORE.get(), ModItems.CITRINE_GEM.get()));
        this.add(ModBlocks.AMETHYST_ORE.get(), (block) -> createOreDrop(ModBlocks.AMETHYST_ORE.get(), ModItems.AMETHYST_GEM.get()));
        this.add(ModBlocks.DIOPSIDE_ORE.get(), (block) -> createOreDrop(ModBlocks.DIOPSIDE_ORE.get(), ModItems.DIOPSIDE_GEM.get()));
        this.add(ModBlocks.JADE_ORE.get(), (block) -> createOreDrop(ModBlocks.JADE_ORE.get(), ModItems.JADE_GEM.get()));
        this.add(ModBlocks.CAERULA_ORE.get(), (block) -> createOreDrop(ModBlocks.CAERULA_ORE.get(), ModItems.CAERULA_INGOT.get()));
        this.add(ModBlocks.ENERGETIC_ORE.get(), (block) -> createOreDrop(ModBlocks.ENERGETIC_ORE.get(), ModItems.ENERGETIC_INGOT.get()));
        this.add(ModBlocks.TIN_ORE.get(), (block) -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.TIN_INGOT.get()));
        this.add(ModBlocks.ENDER_ORE.get(), (block) -> createOreDrop(ModBlocks.ENDER_ORE.get(), ModItems.ENDER_INGOT.get()));
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK.get());
        this.dropSelf(ModBlocks.DIOPSIDE_BLOCK.get());
        this.dropSelf(ModBlocks.JADE_BLOCK.get());
        this.dropSelf(ModBlocks.CAERULA_BLOCK.get());
        this.dropSelf(ModBlocks.ENERGETIC_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.ENDER_BLOCK.get());
        // for leaves
        // this.add(ModBlocks.EXAMPLE_BLOCK.get(), (block) -> createLeavesDrops(block, ModBlocks.EXAMPLE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
