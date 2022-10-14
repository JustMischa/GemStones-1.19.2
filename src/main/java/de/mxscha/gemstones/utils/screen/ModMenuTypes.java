package de.mxscha.gemstones.utils.screen;

import de.mxscha.gemstones.GemStones;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, GemStones.MOD_ID);

    public static final RegistryObject<MenuType<OilGeneratorMenu>> OIL_GENERATOR_MENU = registerMenuType(OilGeneratorMenu::new, "oil_generator_menu");
    public static final RegistryObject<MenuType<OilGeneratorMenu>> GEM_BURNER_MENU = registerMenuType(OilGeneratorMenu::new, "gem_burner_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
