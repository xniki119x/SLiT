package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;
import niki119.slit.materials.Materials;


public class DirtPickaxe extends ItemPickaxe {

    public DirtPickaxe(){
        super(Materials.DIRT);
        this.setRegistryName("dirt_pickaxe");
        this.setTranslationKey("dirt_pickaxe");
        this.setCreativeTab(SLiT.creativeTab);
    }
}

