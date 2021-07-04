package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class SnowAxe extends ItemAxe {
 public SnowAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("snow_axe");
  setTranslationKey("snow_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}