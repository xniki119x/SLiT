package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class GraniteHoe extends ItemHoe {
 public GraniteHoe(ToolMaterial material){
  super(material);
  setRegistryName("granite_hoe");
  setTranslationKey("granite_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}