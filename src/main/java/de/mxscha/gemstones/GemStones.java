package de.mxscha.gemstones;

import com.mojang.logging.LogUtils;
import de.mxscha.gemstones.block.ModBlocks;
import de.mxscha.gemstones.item.ModItems;
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
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}