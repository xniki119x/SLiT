package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.NikiTools;
import niki119.slit.materials.Materials;


public class DirtPickaxe extends ItemPickaxe {

    public DirtPickaxe(){
        super(Materials.DIRT);
        this.setRegistryName("dirt_pickaxe");
        this.setUnlocalizedName("dirt_pickaxe");
        this.setCreativeTab(NikiTools.creativeTab);
    }
}

