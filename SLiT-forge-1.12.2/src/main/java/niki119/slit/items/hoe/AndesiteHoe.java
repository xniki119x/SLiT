package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class AndesiteHoe extends ItemHoe {
 public AndesiteHoe(ToolMaterial material){
  super(material);
  setRegistryName("andesite_hoe");
  setTranslationKey("andesite_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}