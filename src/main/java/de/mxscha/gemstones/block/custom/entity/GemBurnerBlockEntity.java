package de.mxscha.gemstones.block.custom.entity;

import de.mxscha.gemstones.utils.fluid.ModFluids;
import de.mxscha.gemstones.utils.networking.ModMessages;
import de.mxscha.gemstones.utils.networking.packet.FluidSyncS2CPacket;
import de.mxscha.gemstones.utils.recipes.custom.GemBurnerRecipe;
import de.mxscha.gemstones.utils.screen.GemBurnerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class GemBurnerBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 3 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent();
                default -> super.isItemValid(slot, stack);
            };
        }

        @Override
        public @NotNull ItemStack insertItem(int slot, @NotNull ItemStack stack, boolean simulate) {
            if (slot == 1) {
                if (!isItemValid(slot, stack))
                    return stack;
            }
            if (slot == 3) {
                if (!isItemValid(slot, stack)) {
                    return stack;
                }
            }
            return super.insertItem(slot, stack, simulate);
        }
    };
    private final FluidTank FLUID_TANK = new FluidTank(10000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
            if (!level.isClientSide()) {
                ModMessages.sendToClients(new FluidSyncS2CPacket(this.fluid, worldPosition));
            }
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return stack.getFluid() == ModFluids.SOURCE_OIL_WATER.get();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private LazyOptional<IFluidHandler> lazyFluidHandler = LazyOptional.empty();
    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 60;
    private static final int INPUT_SLOT = 0;
    private static final int FUEL_SLOT = 1;
    private static final int RESULT_SLOT = 2;
    private static final int OIL_SLOT = 3;

    public GemBurnerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GEM_BURNER.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> GemBurnerBlockEntity.this.progress;
                    case 1 -> GemBurnerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> GemBurnerBlockEntity.this.progress = value;
                    case 1 -> GemBurnerBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void setFluid(FluidStack stack) {
        this.FLUID_TANK.setFluid(stack);
    }

    public FluidStack getFluidStack() {
        return this.FLUID_TANK.getFluid();
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Gem Burner");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        ModMessages.sendToClients(new FluidSyncS2CPacket(this.getFluidStack(), worldPosition));
        return new GemBurnerMenu(id, inventory, this, this.data);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyFluidHandler = LazyOptional.of(() -> FLUID_TANK);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyFluidHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("gem_burner.progress", this.progress);
        nbt = FLUID_TANK.writeToNBT(nbt);
        super.saveAdditional(nbt);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        if (cap == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
            return lazyFluidHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("gem_burner.progress");
        FLUID_TANK.readFromNBT(nbt);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, GemBurnerBlockEntity pEntity) {
        if (level.isClientSide()) {
            return;
        }
        if (hasRecipe(pEntity)) {
            pEntity.progress++;
            setChanged(level, pos, state);
            if (pEntity.progress >= pEntity.maxProgress) {
                craftItem(pEntity);
            }
        } else {
            pEntity.resetProgress();
            setChanged(level, pos, state);
        }
        if (hasFluidItemInSourceSlot(pEntity))
            transferItemFluidToFluidTank(pEntity);
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void transferItemFluidToFluidTank(GemBurnerBlockEntity pEntity) {
        pEntity.itemHandler.getStackInSlot(OIL_SLOT).getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).ifPresent(handler -> {
            int drainAmount = Math.min(pEntity.FLUID_TANK.getSpace(), 1000);

            FluidStack stack = handler.drain(drainAmount, IFluidHandler.FluidAction.SIMULATE);
            if (pEntity.FLUID_TANK.isFluidValid(stack)) {
                stack = handler.drain(drainAmount, IFluidHandler.FluidAction.EXECUTE);
                fillTankWithFluid(pEntity, stack, handler.getContainer());
            }
        });
    }

    private static void fillTankWithFluid(GemBurnerBlockEntity pEntity, FluidStack stack, ItemStack container) {
        pEntity.FLUID_TANK.fill(stack, IFluidHandler.FluidAction.EXECUTE);
        pEntity.itemHandler.extractItem(OIL_SLOT, 1, false);
        pEntity.itemHandler.insertItem(OIL_SLOT, container, false);
    }

    private static boolean hasFluidItemInSourceSlot(GemBurnerBlockEntity pEntity) {
        return pEntity.itemHandler.getStackInSlot(3).getCount() > 0;
    }


    private static void craftItem(GemBurnerBlockEntity pEntity) {
        Level level = pEntity.level;
        SimpleContainer inventory = new SimpleContainer(pEntity.itemHandler.getSlots());
        for (int i = 0; i < pEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pEntity.itemHandler.getStackInSlot(i));
        }

        Optional<GemBurnerRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(GemBurnerRecipe.Type.INSTANCE, inventory, level);

        if (hasRecipe(pEntity)) {
            pEntity.FLUID_TANK.drain(recipe.get().getFluid().getAmount(), IFluidHandler.FluidAction.EXECUTE);
            pEntity.itemHandler.extractItem(INPUT_SLOT, 1, false);
            pEntity.itemHandler.getStackInSlot(FUEL_SLOT).shrink(1);
            pEntity.itemHandler.setStackInSlot(RESULT_SLOT, new ItemStack(recipe.get().getResultItem().getItem(),
                    pEntity.itemHandler.getStackInSlot(RESULT_SLOT).getCount() + 1));
            pEntity.resetProgress();
        }
    }

    private static boolean hasRecipe(GemBurnerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<GemBurnerRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(GemBurnerRecipe.Type.INSTANCE, inventory, level);


        return recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory) &&
                canInsertItemIntoOutputSlot(inventory, recipe.get().getResultItem()) && hasFuel(inventory)
                && hasCorrectFluidInTank(entity, recipe) && hasCorrectFluidAmountInTank(entity, recipe);
    }

    private static boolean hasFuel(SimpleContainer inventory) {
        return inventory.getItem(FUEL_SLOT).is(Items.COAL);
    }

    private static boolean hasCorrectFluidAmountInTank(GemBurnerBlockEntity entity, Optional<GemBurnerRecipe> recipe) {
        return entity.FLUID_TANK.getFluidAmount() >= recipe.get().getFluid().getAmount();
    }

    private static boolean hasCorrectFluidInTank(GemBurnerBlockEntity entity, Optional<GemBurnerRecipe> recipe) {
        return recipe.get().getFluid().equals(entity.FLUID_TANK.getFluid());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack stack) {
        return inventory.getItem(RESULT_SLOT).getItem() == stack.getItem() || inventory.getItem(RESULT_SLOT).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(RESULT_SLOT).getMaxStackSize() > inventory.getItem(RESULT_SLOT).getCount();
    }
}
