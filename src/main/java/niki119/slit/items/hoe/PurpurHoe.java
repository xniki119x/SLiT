package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class PurpurHoe extends ItemHoe {
 public PurpurHoe(ToolMaterial material){
  super(material);
  setRegistryName("purpur_hoe");
  setTranslationKey("purpur_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}