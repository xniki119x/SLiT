package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class IceAxe extends ItemAxe {
 public IceAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("ice_axe");
  setTranslationKey("ice_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}