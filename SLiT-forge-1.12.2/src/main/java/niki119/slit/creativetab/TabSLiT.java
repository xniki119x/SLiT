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
        switch(getTabLabel()){
            case "creative_tab_pickaxe":{return new ItemStack(ModItems.DIRTPICKAXE);}
            case "creative_tab_axe":{return new ItemStack(ModItems.COAL_BLOCKAXE);}
            case "creative_tab_sword":{return new ItemStack(ModItems.BEDROCKSWORD);}
            case "creative_tab_shovel":{return new ItemStack(ModItems.TNT_BOTTOMSHOVEL);}
            case "creative_tab_hoe":{return new ItemStack(ModItems.MELON_SIDEHOE);}
            default:{return new ItemStack(ModItems.DIRTPICKAXE);}}
    }
}