package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class GlassHoe extends ItemHoe {
 public GlassHoe(ToolMaterial material){
  super(material);
  setRegistryName("glass_hoe");
  setTranslationKey("glass_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}