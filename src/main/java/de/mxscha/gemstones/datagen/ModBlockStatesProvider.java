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
        simpleBlock(ModBlocks.EXAMPLE_BLOCK.get());
        simpleBlock(ModBlocks.ANOTHER_EXAMPLE_BLOCK.get());
    }
}
