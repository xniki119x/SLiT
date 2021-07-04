package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Cobble_mossyHoe extends ItemHoe {
 public Cobble_mossyHoe(ToolMaterial material){
  super(material);
  setRegistryName("cobble_mossy_hoe");
  setTranslationKey("cobble_mossy_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}