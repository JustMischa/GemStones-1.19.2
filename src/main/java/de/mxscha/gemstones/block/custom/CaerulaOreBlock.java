package de.mxscha.gemstones.block.custom;

import de.mxscha.gemstones.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

import java.util.Random;

public class CaerulaOreBlock extends ModOreBlock {

    public CaerulaOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        /*
            Mit neuen entchantment -> hörere chance auf cearula shard
         */
        int chanceOfCaerulaShard = new Random().nextInt(100);
        if (chanceOfCaerulaShard <= 15) {
            popResource(level, pos, new ItemStack(ModItems.CAERULA_SHARD.get(), 1));
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }
}
