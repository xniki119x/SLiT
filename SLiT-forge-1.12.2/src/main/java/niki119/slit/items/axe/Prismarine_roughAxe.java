package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Prismarine_roughAxe extends ItemAxe {
 public Prismarine_roughAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("prismarine_rough_axe");
  setTranslationKey("prismarine_rough_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}