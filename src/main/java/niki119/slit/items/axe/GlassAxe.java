package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class GlassAxe extends ItemAxe {
 public GlassAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("glass_axe");
  setTranslationKey("glass_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}