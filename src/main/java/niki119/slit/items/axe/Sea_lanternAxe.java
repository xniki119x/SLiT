package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Sea_lanternAxe extends ItemAxe {
 public Sea_lanternAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("sea_lantern_axe");
  setTranslationKey("sea_lantern_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}