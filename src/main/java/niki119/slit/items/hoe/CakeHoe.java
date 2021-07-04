package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class CakeHoe extends ItemHoe {
 public CakeHoe(ToolMaterial material){
  super(material);
  setRegistryName("cake_hoe");
  setTranslationKey("cake_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}