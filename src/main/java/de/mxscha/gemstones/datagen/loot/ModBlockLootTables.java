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
        this.dropSelf(ModBlocks.EXAMPLE_BLOCK.get());
        this.dropSelf(ModBlocks.ANOTHER_EXAMPLE_BLOCK.get());

        // for ores
        // this.add(ModBlocks.EXAMPLE_BLOCK.get(), (block) -> createOreDrop(ModBlocks.ANOTHER_EXAMPLE_BLOCK.get(), ModItems.EXAMPLE_ITEM.get()));

        // for leaves
        // this.add(ModBlocks.EXAMPLE_BLOCK.get(), (block) -> createLeavesDrops(block, ModBlocks.EXAMPLE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
