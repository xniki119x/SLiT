package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class ChorusAxe extends ItemAxe {
 public ChorusAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("chorus_axe");
  setTranslationKey("chorus_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}