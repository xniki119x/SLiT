package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class DioriteHoe extends ItemHoe {
 public DioriteHoe(ToolMaterial material){
  super(material);
  setRegistryName("diorite_hoe");
  setTranslationKey("diorite_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}