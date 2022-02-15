package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Soul_sandHoe extends ItemHoe {
 public Soul_sandHoe(ToolMaterial material){
  super(material);
  setRegistryName("soul_sand_hoe");
  setTranslationKey("soul_sand_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}