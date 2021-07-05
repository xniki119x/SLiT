package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class WoolHoe extends ItemHoe {
 public WoolHoe(ToolMaterial material){
  super(material);
  setRegistryName("wool_hoe");
  setTranslationKey("wool_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}