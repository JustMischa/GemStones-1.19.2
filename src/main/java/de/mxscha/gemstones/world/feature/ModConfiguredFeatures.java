package de.mxscha.gemstones.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GemStones.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SAPPHIRE_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CITRINE_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AMETHYST_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_DIOPSIDE_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DIOPSIDE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_JADE_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CAERULA_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CAERULA_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ENERGETIC_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ENERGETIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ENDER_ORE = Suppliers.memoize(() -> List.of(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORE.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = CONFIGURED_FEATURES.register("sapphire_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORE.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORE.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CITRINE_ORE = CONFIGURED_FEATURES.register("citrine_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORE.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> AMETHYST_ORE = CONFIGURED_FEATURES.register("amethyst_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_AMETHYST_ORE.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DIOPSIDE_ORE = CONFIGURED_FEATURES.register("diopside_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_DIOPSIDE_ORE.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> JADE_ORE = CONFIGURED_FEATURES.register("jade_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_JADE_ORE.get(),4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CAERULA_ORE = CONFIGURED_FEATURES.register("caerula_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CAERULA_ORE.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENERGETIC_ORE = CONFIGURED_FEATURES.register("energetic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ENERGETIC_ORE.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDER_ORE = CONFIGURED_FEATURES.register("end_ender_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ENDER_ORE.get(), 5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JADE_GEODE = CONFIGURED_FEATURES.register("jade_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.OIL_INFUSED_STONE.get()),
                    BlockStateProvider.simple(ModBlocks.OIL_INFUSED_STONE.get()),
                    BlockStateProvider.simple(Blocks.CALCITE),
                    BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(ModBlocks.JADE_ORE.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6),
                    UniformInt.of(1, 2), -18, 18, 0.075D, 1)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}