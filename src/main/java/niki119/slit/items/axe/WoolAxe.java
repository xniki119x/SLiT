package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class WoolAxe extends ItemAxe {
 public WoolAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("wool_axe");
  setTranslationKey("wool_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}