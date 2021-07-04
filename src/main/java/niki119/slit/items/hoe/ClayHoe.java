package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class ClayHoe extends ItemHoe {
 public ClayHoe(ToolMaterial material){
  super(material);
  setRegistryName("clay_hoe");
  setTranslationKey("clay_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}