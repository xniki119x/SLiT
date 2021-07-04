package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Red_sandHoe extends ItemHoe {
 public Red_sandHoe(ToolMaterial material){
  super(material);
  setRegistryName("red_sand_hoe");
  setTranslationKey("red_sand_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}