package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class SnowHoe extends ItemHoe {
 public SnowHoe(ToolMaterial material){
  super(material);
  setRegistryName("snow_hoe");
  setTranslationKey("snow_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}