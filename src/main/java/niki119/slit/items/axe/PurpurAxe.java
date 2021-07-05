package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class PurpurAxe extends ItemAxe {
 public PurpurAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("purpur_axe");
  setTranslationKey("purpur_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}