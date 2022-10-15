package de.mxscha.gemstones.item.custom.tiers;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.ModItems;
import de.mxscha.gemstones.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier TIN;
    public static Tier SAPPHIRE;
    public static Tier RUBY;
    public static Tier CITRINE;
    public static Tier AMETHYST;
    public static Tier DIOPSIDE;
    public static Tier JADE;
    public static Tier CAERULA;
    public static Tier ENDER;
    public static Tier FUSION;
    public static Tier FUSION_NETHERITE;

    static {
        TIN = TierSortingRegistry.registerTier(new ForgeTier(2, 280, 6.5f, 2.2f, 24, ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())), new ResourceLocation(GemStones.MOD_ID, "tin"), List.of(Tiers.STONE), List.of(Tiers.IRON));
        SAPPHIRE = TierSortingRegistry.registerTier(new ForgeTier(3, 1561, 8f, 3f, 24, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "sapphire"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        RUBY = TierSortingRegistry.registerTier(new ForgeTier(3, 1561, 8f, 3f, 24, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.RUBY_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "ruby"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        CITRINE = TierSortingRegistry.registerTier(new ForgeTier(5, 1973, 8.6F, 3.5F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.CITRINE_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "citrine"), List.of(Tiers.NETHERITE), List.of());
        AMETHYST = TierSortingRegistry.registerTier(new ForgeTier(5, 1983, 8.8F, 4F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.AMETHYST_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "amethyst"), List.of(Tiers.NETHERITE), List.of());
        DIOPSIDE = TierSortingRegistry.registerTier(new ForgeTier(5, 1983, 9.0F, 4.3F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.DIOPSIDE_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "diopside"), List.of(Tiers.NETHERITE), List.of());
        JADE = TierSortingRegistry.registerTier(new ForgeTier(5, 1983, 9.0F, 4.5F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.JADE_GEM.get())), new ResourceLocation(GemStones.MOD_ID, "jade"), List.of(Tiers.NETHERITE), List.of());
        CAERULA = TierSortingRegistry.registerTier(new ForgeTier(5, 1983, 9.0F, 4.8F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.CAERULA_INGOT.get())), new ResourceLocation(GemStones.MOD_ID, "caerula"), List.of(Tiers.NETHERITE), List.of());
        ENDER = TierSortingRegistry.registerTier(new ForgeTier(5, 1983, 9.2F, 5F, 14, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.ENDER_INGOT.get())), new ResourceLocation(GemStones.MOD_ID, "ender"), List.of(Tiers.NETHERITE), List.of());
        FUSION = TierSortingRegistry.registerTier(new ForgeTier(5, 2031, 9.5F, 5.5F, 15, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.FUSION_INGOT.get())), new ResourceLocation(GemStones.MOD_ID, "fusion"), List.of(Tiers.NETHERITE), List.of());
        FUSION_NETHERITE = TierSortingRegistry.registerTier(new ForgeTier(5, 2231, 9.9F, 6F, 15, ModTags.Blocks.NEEDS_AT_LEAST_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.FUSION_NETHERITE_INGOT.get())), new ResourceLocation(GemStones.MOD_ID, "fusion_netherite"), List.of(Tiers.NETHERITE), List.of());
    }
}