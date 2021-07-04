package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class PumpkinAxe extends ItemAxe {
 public PumpkinAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("pumpkin_axe");
  setTranslationKey("pumpkin_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}