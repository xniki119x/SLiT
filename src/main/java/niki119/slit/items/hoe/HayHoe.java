package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class HayHoe extends ItemHoe {
 public HayHoe(ToolMaterial material){
  super(material);
  setRegistryName("hay_hoe");
  setTranslationKey("hay_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}