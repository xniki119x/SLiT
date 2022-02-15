package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class GlowstoneAxe extends ItemAxe {
 public GlowstoneAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("glowstone_axe");
  setTranslationKey("glowstone_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}