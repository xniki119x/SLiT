package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Sea_lanternHoe extends ItemHoe {
 public Sea_lanternHoe(ToolMaterial material){
  super(material);
  setRegistryName("sea_lantern_hoe");
  setTranslationKey("sea_lantern_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}