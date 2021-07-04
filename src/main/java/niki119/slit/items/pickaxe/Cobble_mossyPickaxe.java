package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Cobble_mossyPickaxe extends ItemPickaxe {
 public Cobble_mossyPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("cobble_mossy_pickaxe");
  setTranslationKey("cobble_mossy_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}