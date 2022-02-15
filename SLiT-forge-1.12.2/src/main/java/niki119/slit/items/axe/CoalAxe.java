package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class CoalAxe extends ItemAxe {
 public CoalAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("coal_axe");
  setTranslationKey("coal_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}