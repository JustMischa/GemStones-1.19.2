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
    }
}
