package de.mxscha.gemstones;

import com.mojang.logging.LogUtils;
import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.block.custom.entity.ModBlockEntities;
import de.mxscha.gemstones.item.ModItems;
import de.mxscha.gemstones.utils.fluid.ModFluids;
import de.mxscha.gemstones.utils.fluid.ModFluidsTypes;
import de.mxscha.gemstones.utils.networking.ModMessages;
import de.mxscha.gemstones.utils.recipes.ModRecipes;
import de.mxscha.gemstones.utils.screen.*;
import de.mxscha.gemstones.world.feature.ModConfiguredFeatures;
import de.mxscha.gemstones.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.OutOfMemoryScreen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GemStones.MOD_ID)
public class GemStones {

    public static final String MOD_ID = "gemstones";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GemStones() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
        registerGemStones(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void registerGemStones(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModRecipes.register(eventBus);
        ModFluidsTypes.register(eventBus);
        ModFluids.register(eventBus);
        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModMessages.register();
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.OIL_GENERATOR_MENU.get(), OilGeneratorScreen::new);
            MenuScreens.register(ModMenuTypes.GEM_BURNER_MENU.get(), GemBurnerScreen::new);

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_OIL_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_OIL_WATER.get(), RenderType.translucent());
        }
    }
}