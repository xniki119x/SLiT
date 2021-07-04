package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class PumpkinHoe extends ItemHoe {
 public PumpkinHoe(ToolMaterial material){
  super(material);
  setRegistryName("pumpkin_hoe");
  setTranslationKey("pumpkin_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}