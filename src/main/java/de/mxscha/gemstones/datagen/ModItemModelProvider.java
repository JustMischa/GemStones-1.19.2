package de.mxscha.gemstones.datagen;


import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GemStones.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /*
        simpleItem(ModItems.SAPPHIRE_GEM.get());
        simpleItem(ModItems.RUBY_GEM.get());
        simpleItem(ModItems.CITRINE_GEM.get());
        simpleItem(ModItems.AMETHYST_GEM.get());
        simpleItem(ModItems.DIOPSIDE_GEM.get());
        simpleItem(ModItems.JADE_GEM.get());
         */
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(ModItems.ITEMS.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemStones.MOD_ID,"item/" + ModItems.ITEMS.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(ModItems.ITEMS.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(GemStones.MOD_ID,"item/" + ModItems.ITEMS.getRegistryName().getPath()));
    }
}
