package com.blakebr0.extendedcrafting.container.slot;

import com.blakebr0.cucumber.inventory.BaseItemStackHandler;
import com.blakebr0.cucumber.inventory.slot.SingleSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class CatalystSlot extends SingleSlot {
    private final BaseItemStackHandler inventory;
    private final int index;

    public CatalystSlot(BaseItemStackHandler inventory, int index, int xPosition, int yPosition) {
        super(inventory, index, xPosition, yPosition);
        this.inventory = inventory;
        this.index = index;
    }

    @Override
    public boolean canTakeStack(PlayerEntity playerIn) {
        return true;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack decrStackSize(int amount) {
        return this.inventory.extractItemSuper(this.index, amount, false);
    }
}
