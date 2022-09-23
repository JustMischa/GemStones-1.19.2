package de.mxscha.gemstones.block;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.block.custom.CaerulaOreBlock;
import de.mxscha.gemstones.item.ModItems;
import de.mxscha.gemstones.item.custom.ModItemCreativeTab;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemStones.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> DIOPSIDE_ORE = registerBlock("diopside_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> CAERULA_ORE = registerBlock("caerula_ore", () -> new CaerulaOreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> ENERGETIC_ORE = registerBlock("energetic_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> ENDER_ORE = registerBlock("ender_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> DIOPSIDE_BLOCK = registerBlock("diopside_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> CAERULA_BLOCK = registerBlock("caerula_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> ENERGETIC_BLOCK = registerBlock("energetic_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);
    public static final RegistryObject<Block> ENDER_BLOCK = registerBlock("ender_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModItemCreativeTab.BLOCK_GEMSTONES);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
