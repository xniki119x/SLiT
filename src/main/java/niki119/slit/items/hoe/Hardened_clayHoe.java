package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Hardened_clayHoe extends ItemHoe {
 public Hardened_clayHoe(ToolMaterial material){
  super(material);
  setRegistryName("hardened_clay_hoe");
  setTranslationKey("hardened_clay_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}