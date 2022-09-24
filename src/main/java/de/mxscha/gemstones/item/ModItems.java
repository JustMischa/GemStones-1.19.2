package de.mxscha.gemstones.item;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.custom.ModItemCreativeTab;
import de.mxscha.gemstones.item.custom.PaxelItem;
import de.mxscha.gemstones.item.custom.tiers.ModToolTiers;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",() -> new AxeItem(ModToolTiers.SAPPHIRE, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModToolTiers.SAPPHIRE, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> SAPPHIRE_PAXEL = ITEMS.register("sapphire_paxel", () -> new PaxelItem(ModToolTiers.SAPPHIRE, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",() -> new AxeItem(ModToolTiers.RUBY, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> RUBY_PAXEL = ITEMS.register("ruby_paxel", () -> new PaxelItem(ModToolTiers.RUBY, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword", () -> new SwordItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe", () -> new PickaxeItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe", () -> new AxeItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe", () -> new HoeItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel", () -> new ShovelItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CITRINE_PAXEL = ITEMS.register("citrine_paxel", () -> new PaxelItem(ModToolTiers.CITRINE, 2, 3f, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModToolTiers.AMETHYST, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModToolTiers.AMETHYST, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModToolTiers.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",() -> new AxeItem(ModToolTiers.AMETHYST, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModToolTiers.AMETHYST, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> AMETHYST_PAXEL = ITEMS.register("amethyst_paxel", () -> new PaxelItem(ModToolTiers.AMETHYST, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
