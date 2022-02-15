package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class DirtHoe extends ItemHoe {
 public DirtHoe(ToolMaterial material){
  super(material);
  setRegistryName("dirt_hoe");
  setTranslationKey("dirt_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}