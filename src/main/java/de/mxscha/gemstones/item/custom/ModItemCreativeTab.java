package de.mxscha.gemstones.item.custom;

import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemCreativeTab {

    public static final CreativeModeTab ITEM_GEMSTONES = new CreativeModeTab("item_gemstones") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JADE_GEM.get());
        }
    };

    public static final CreativeModeTab BLOCK_GEMSTONES = new CreativeModeTab("block_gemstones") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JADE_ORE.get());
        }
    };

    public static final CreativeModeTab ARMORY_GEMSTONES = new CreativeModeTab("armory_gemstones") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JADE_CHESTPLATE.get());
        }
    };
}