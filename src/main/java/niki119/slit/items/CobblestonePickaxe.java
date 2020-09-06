package niki119.slit.items;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;
import niki119.slit.materials.Materials;

public class CobblestonePickaxe extends ItemPickaxe {
    public CobblestonePickaxe(){
        super(Materials.COBBLESTONE);
        this.setRegistryName("cobblestone_pickaxe");
        this.setTranslationKey("cobblestone_pickaxe");
        this.setCreativeTab(SLiT.creativeTab);
    }
}
