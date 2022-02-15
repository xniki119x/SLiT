package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class ClayAxe extends ItemAxe {
 public ClayAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("clay_axe");
  setTranslationKey("clay_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}