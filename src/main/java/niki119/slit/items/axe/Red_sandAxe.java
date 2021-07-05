package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Red_sandAxe extends ItemAxe {
 public Red_sandAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("red_sand_axe");
  setTranslationKey("red_sand_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}