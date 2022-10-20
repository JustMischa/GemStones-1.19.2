package de.mxscha.gemstones.world.feature;

import de.mxscha.gemstones.GemStones;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GemStones.MOD_ID);

    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED = PLACED_FEATURES.register("tin_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("sapphire_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> CITRINE_ORE_PLACED = PLACED_FEATURES.register("citrine_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.CITRINE_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> AMETHYST_ORE_PLACED = PLACED_FEATURES.register("amethyst_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.AMETHYST_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> DIOPSIDE_ORE_PLACED = PLACED_FEATURES.register("diopside_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.DIOPSIDE_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> JADE_ORE_PLACED = PLACED_FEATURES.register("jade_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.JADE_ORE.getHolder().get(), rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> CAERULA_ORE_PLACED = PLACED_FEATURES.register("caerula_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.CAERULA_ORE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> ENERGETIC_ORE_PLACED = PLACED_FEATURES.register("energetic_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.ENERGETIC_ORE.getHolder().get(), commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ENDER_ORE_PLACED = PLACED_FEATURES.register("ender_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.ENDER_ORE.getHolder().get(), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> JADE_GEODE_PLACED = PLACED_FEATURES.register("jade_geode_placed", () -> new PlacedFeature(ModConfiguredFeatures.JADE_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(90), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome())));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

