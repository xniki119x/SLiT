package niki119.slit.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import niki119.slit.items.ModItems;

public class TabSLiT extends CreativeTabs {
    public TabSLiT(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        switch(getTabLabel()){
            case "creative_tab_pickaxe":{return ModItems.DIRTPICKAXE;}
            case "creative_tab_axe":{return ModItems.COAL_BLOCKAXE;}
            case "creative_tab_sword":{return ModItems.BEDROCKSWORD;}
            case "creative_tab_shovel":{return ModItems.TNT_BOTTOMSHOVEL;}
            case "creative_tab_hoe":{return ModItems.MELON_SIDEHOE;}
            default:{return ModItems.DIRTPICKAXE;}}
    }
}