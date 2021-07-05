package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Prismarine_darkAxe extends ItemAxe {
 public Prismarine_darkAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("prismarine_dark_axe");
  setTranslationKey("prismarine_dark_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}