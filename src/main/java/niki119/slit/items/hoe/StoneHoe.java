package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class StoneHoe extends ItemHoe {
 public StoneHoe(ToolMaterial material){
  super(material);
  setRegistryName("stone_hoe");
  setTranslationKey("stone_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}