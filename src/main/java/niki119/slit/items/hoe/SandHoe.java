package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class SandHoe extends ItemHoe {
 public SandHoe(ToolMaterial material){
  super(material);
  setRegistryName("sand_hoe");
  setTranslationKey("sand_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}