package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.NikiTools;
import niki119.slit.materials.Materials;

public class GranitePickaxe extends ItemPickaxe {
    public GranitePickaxe(){
        super(Materials.GRANITE);
        this.setRegistryName("granite_pickaxe");
        this.setUnlocalizedName("granite_pickaxe");
        this.setCreativeTab(NikiTools.creativeTab);
    }
}
