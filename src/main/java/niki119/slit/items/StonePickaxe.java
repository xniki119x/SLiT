package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;
import niki119.slit.materials.Materials;

public class StonePickaxe extends ItemPickaxe {
    public StonePickaxe(){
        super(Materials.STONE);
        this.setRegistryName("stone_pickaxe");
        this.setTranslationKey("stone_pickaxe");
        this.setCreativeTab(SLiT.creativeTab);
    }
}
