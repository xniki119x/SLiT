package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Hardened_clayAxe extends ItemAxe {
 public Hardened_clayAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("hardened_clay_axe");
  setTranslationKey("hardened_clay_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}