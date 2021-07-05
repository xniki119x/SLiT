package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class DioriteAxe extends ItemAxe {
 public DioriteAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("diorite_axe");
  setTranslationKey("diorite_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}