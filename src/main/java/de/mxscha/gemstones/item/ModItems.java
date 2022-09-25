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
    public static final RegistryObject<Item> DIOPSIDE_SWORD = ITEMS.register("diopside_sword", () -> new SwordItem(ModToolTiers.DIOPSIDE, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_PICKAXE = ITEMS.register("diopside_pickaxe", () -> new PickaxeItem(ModToolTiers.DIOPSIDE, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_SHOVEL = ITEMS.register("diopside_shovel", () -> new ShovelItem(ModToolTiers.DIOPSIDE, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_AXE = ITEMS.register("diopside_axe",() -> new AxeItem(ModToolTiers.DIOPSIDE, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_HOE = ITEMS.register("diopside_hoe", () -> new HoeItem(ModToolTiers.DIOPSIDE, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> DIOPSIDE_PAXEL = ITEMS.register("diopside_paxel", () -> new PaxelItem(ModToolTiers.DIOPSIDE, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword", () -> new SwordItem(ModToolTiers.JADE, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe", () -> new PickaxeItem(ModToolTiers.JADE, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel", () -> new ShovelItem(ModToolTiers.JADE, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",() -> new AxeItem(ModToolTiers.JADE, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe", () -> new HoeItem(ModToolTiers.JADE, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> JADE_PAXEL = ITEMS.register("jade_paxel", () -> new PaxelItem(ModToolTiers.JADE, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_SWORD = ITEMS.register("caerula_sword", () -> new SwordItem(ModToolTiers.CAERULA, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_PICKAXE = ITEMS.register("caerula_pickaxe", () -> new PickaxeItem(ModToolTiers.CAERULA, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_SHOVEL = ITEMS.register("caerula_shovel", () -> new ShovelItem(ModToolTiers.CAERULA, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_AXE = ITEMS.register("caerula_axe",() -> new AxeItem(ModToolTiers.CAERULA, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_HOE = ITEMS.register("caerula_hoe", () -> new HoeItem(ModToolTiers.CAERULA, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> CAERULA_PAXEL = ITEMS.register("caerula_paxel", () -> new PaxelItem(ModToolTiers.CAERULA, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordItem(ModToolTiers.ENDER, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeItem(ModToolTiers.ENDER, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelItem(ModToolTiers.ENDER, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_AXE = ITEMS.register("ender_axe",() -> new AxeItem(ModToolTiers.ENDER, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeItem(ModToolTiers.ENDER, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> ENDER_PAXEL = ITEMS.register("ender_paxel", () -> new PaxelItem(ModToolTiers.ENDER, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_SWORD = ITEMS.register("fusion_sword", () -> new SwordItem(ModToolTiers.FUSION, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_PICKAXE = ITEMS.register("fusion_pickaxe", () -> new PickaxeItem(ModToolTiers.FUSION, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_SHOVEL = ITEMS.register("fusion_shovel", () -> new ShovelItem(ModToolTiers.FUSION, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_AXE = ITEMS.register("fusion_axe",() -> new AxeItem(ModToolTiers.FUSION, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_HOE = ITEMS.register("fusion_hoe", () -> new HoeItem(ModToolTiers.FUSION, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_PAXEL = ITEMS.register("fusion_paxel", () -> new PaxelItem(ModToolTiers.FUSION, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_SWORD = ITEMS.register("fusion_netherite_sword", () -> new SwordItem(ModToolTiers.FUSION_NETHERITE, 4, -2.3F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_PICKAXE = ITEMS.register("fusion_netherite_pickaxe", () -> new PickaxeItem(ModToolTiers.FUSION_NETHERITE, 1, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_SHOVEL = ITEMS.register("fusion_netherite_shovel", () -> new ShovelItem(ModToolTiers.FUSION_NETHERITE, 1.5F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_AXE = ITEMS.register("fusion_netherite_axe",() -> new AxeItem(ModToolTiers.FUSION_NETHERITE, 5.0F, -3.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_HOE = ITEMS.register("fusion_netherite_hoe", () -> new HoeItem(ModToolTiers.FUSION_NETHERITE, -3, 0.0F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));
    public static final RegistryObject<Item> FUSION_NETHERITE_PAXEL = ITEMS.register("fusion_netherite_paxel", () -> new PaxelItem(ModToolTiers.FUSION_NETHERITE, 5.0F, -2.8F, new Item.Properties().tab(ModItemCreativeTab.ARMORY_GEMSTONES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
