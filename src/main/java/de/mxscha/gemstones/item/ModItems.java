package de.mxscha.gemstones.item;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.custom.ModItemCreativeTab;
import de.mxscha.gemstones.item.custom.tiers.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemStones.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_GEM = ITEMS.register("citrine_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_GEM = ITEMS.register("diopside_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> JADE_GEM = ITEMS.register("jade_gem", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_SHARD = ITEMS.register("caerula_shard", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> RAW_CAERULA = ITEMS.register("raw_caerula", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> RAW_ENERGETIC = ITEMS.register("raw_energetic", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> RAW_ENDER = ITEMS.register("raw_ender", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_INGOT = ITEMS.register("caerula_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> ENERGETIC_INGOT = ITEMS.register("energetic_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_INGOT = ITEMS.register("ender_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_INGOT = ITEMS.register("fusion_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_INGOT = ITEMS.register("fusion_netherite_ingot", () -> new Item(new Item.Properties().tab(ModItemCreativeTab.ITEM_GEMSTONES)));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
