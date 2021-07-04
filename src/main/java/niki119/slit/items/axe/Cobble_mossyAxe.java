package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Cobble_mossyAxe extends ItemAxe {
 public Cobble_mossyAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("cobble_mossy_axe");
  setTranslationKey("cobble_mossy_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}