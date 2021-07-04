package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class GraniteAxe extends ItemAxe {
 public GraniteAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("granite_axe");
  setTranslationKey("granite_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}