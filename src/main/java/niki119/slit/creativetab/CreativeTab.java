package niki119.slit.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
    public CreativeTab(String label) {
        super(label);
    }
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(Items.APPLE);
    }
}