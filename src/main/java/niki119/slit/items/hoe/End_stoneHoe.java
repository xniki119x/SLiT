package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class End_stoneHoe extends ItemHoe {
 public End_stoneHoe(ToolMaterial material){
  super(material);
  setRegistryName("end_stone_hoe");
  setTranslationKey("end_stone_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}