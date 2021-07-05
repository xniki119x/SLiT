package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Soul_sandAxe extends ItemAxe {
 public Soul_sandAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("soul_sand_axe");
  setTranslationKey("soul_sand_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}