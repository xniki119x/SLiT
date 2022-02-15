package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class CakeAxe extends ItemAxe {
 public CakeAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("cake_axe");
  setTranslationKey("cake_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}