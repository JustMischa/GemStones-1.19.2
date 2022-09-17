package de.mxscha.gemstones.item;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.custom.ModItemCreativeTab;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
