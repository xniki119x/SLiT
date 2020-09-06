package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class PickaxeBase extends ItemPickaxe {
    public PickaxeBase(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(SLiT.creativeTab);
    }
}
