package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class HayAxe extends ItemAxe {
 public HayAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("hay_axe");
  setTranslationKey("hay_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}