package de.mxscha.gemstones.block.custom.entity;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>>BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GemStones.MOD_ID);

    public static final RegistryObject<BlockEntityType<OilGeneratorBlockEntity>> OIL_GENERATOR = BLOCK_ENTITIES.register("oil_generator", () -> BlockEntityType.Builder.of(OilGeneratorBlockEntity::new, ModBlocks.OIL_GENERATOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
