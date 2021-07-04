package niki119.slit.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import niki119.slit.items.ModItems;

public class TabSLiT extends CreativeTabs {
    public TabSLiT(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.DIRTPICKAXE);
    }
}