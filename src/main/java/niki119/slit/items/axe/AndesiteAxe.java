package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class AndesiteAxe extends ItemAxe {
 public AndesiteAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("andesite_axe");
  setTranslationKey("andesite_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}