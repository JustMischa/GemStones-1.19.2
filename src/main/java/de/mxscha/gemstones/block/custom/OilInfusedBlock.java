package de.mxscha.gemstones.block.custom;

import de.mxscha.gemstones.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

import java.util.Random;
import java.util.function.Supplier;

public class OilInfusedBlock extends Block {

    public OilInfusedBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        int chanceOfEssence = new Random().nextInt(100);
        if (chanceOfEssence >= 80) {
            popResource(level, pos, new ItemStack(ModItems.OIL_ESSENCE.get(), 1));
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    public static void popResource(Level pLevel, BlockPos pPos, ItemStack pStack) {
        float f = EntityType.ITEM.getHeight() / 2.0F;
        double d0 = (double)((float)pPos.getX() + 0.5F) + Mth.nextDouble(pLevel.random, -0.25D, 0.25D);
        double d1 = (double)((float)pPos.getY() + 0.5F) + Mth.nextDouble(pLevel.random, -0.25D, 0.25D) - (double)f;
        double d2 = (double)((float)pPos.getZ() + 0.5F) + Mth.nextDouble(pLevel.random, -0.25D, 0.25D);
        popResource(pLevel, () -> { return new ItemEntity(pLevel, d0, d1, d2, pStack); }, pStack);
    }

    private static void popResource(Level pLevel, Supplier<ItemEntity> pItemEntitySupplier, ItemStack pStack) {
        if (!pLevel.isClientSide && !pStack.isEmpty() && pLevel.getGameRules().getBoolean(GameRules.RULE_DOBLOCKDROPS) && !pLevel.restoringBlockSnapshots) {
            ItemEntity itementity = pItemEntitySupplier.get();
            itementity.setDefaultPickUpDelay();
            pLevel.addFreshEntity(itementity);
        }
    }

}
