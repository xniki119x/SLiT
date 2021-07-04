package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class CoalHoe extends ItemHoe {
 public CoalHoe(ToolMaterial material){
  super(material);
  setRegistryName("coal_hoe");
  setTranslationKey("coal_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}