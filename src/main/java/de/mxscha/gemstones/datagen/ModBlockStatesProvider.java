package de.mxscha.gemstones.datagen;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GemStones.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.SAPPHIRE_ORE.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.CITRINE_ORE.get());
        simpleBlock(ModBlocks.AMETHYST_ORE.get());
        simpleBlock(ModBlocks.DIOPSIDE_ORE.get());
        simpleBlock(ModBlocks.JADE_ORE.get());
        simpleBlock(ModBlocks.CAERULA_ORE.get());
        simpleBlock(ModBlocks.ENERGETIC_ORE.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        simpleBlock(ModBlocks.ENDER_ORE.get());
        simpleBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.CITRINE_BLOCK.get());
        simpleBlock(ModBlocks.AMETHYST_BLOCK.get());
        simpleBlock(ModBlocks.DIOPSIDE_BLOCK.get());
        simpleBlock(ModBlocks.JADE_BLOCK.get());
        simpleBlock(ModBlocks.CAERULA_BLOCK.get());
        simpleBlock(ModBlocks.ENERGETIC_BLOCK.get());
        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.ENDER_BLOCK.get());
        simpleBlock(ModBlocks.OIL_INFUSED_STONE.get());
        simpleBlock(ModBlocks.OIL_GENERATOR.get());
    }
}
