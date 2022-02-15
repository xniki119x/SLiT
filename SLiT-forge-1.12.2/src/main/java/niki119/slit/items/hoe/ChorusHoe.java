package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class ChorusHoe extends ItemHoe {
 public ChorusHoe(ToolMaterial material){
  super(material);
  setRegistryName("chorus_hoe");
  setTranslationKey("chorus_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}