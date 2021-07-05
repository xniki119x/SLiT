package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class TntHoe extends ItemHoe {
 public TntHoe(ToolMaterial material){
  super(material);
  setRegistryName("tnt_hoe");
  setTranslationKey("tnt_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}