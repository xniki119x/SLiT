package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class GravelAxe extends ItemAxe {
 public GravelAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("gravel_axe");
  setTranslationKey("gravel_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}