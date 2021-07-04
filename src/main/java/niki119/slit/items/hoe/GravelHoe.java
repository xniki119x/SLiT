package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class GravelHoe extends ItemHoe {
 public GravelHoe(ToolMaterial material){
  super(material);
  setRegistryName("gravel_hoe");
  setTranslationKey("gravel_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}