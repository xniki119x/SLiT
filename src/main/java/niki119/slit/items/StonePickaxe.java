package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.NikiTools;
import niki119.slit.materials.Materials;

public class StonePickaxe extends ItemPickaxe {
    public StonePickaxe(){
        super(Materials.STONE);
        this.setRegistryName("stone_pickaxe");
        this.setUnlocalizedName("stone_pickaxe");
        this.setCreativeTab(NikiTools.creativeTab);
    }
}
