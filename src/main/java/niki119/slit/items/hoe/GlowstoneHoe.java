package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class GlowstoneHoe extends ItemHoe {
 public GlowstoneHoe(ToolMaterial material){
  super(material);
  setRegistryName("glowstone_hoe");
  setTranslationKey("glowstone_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}