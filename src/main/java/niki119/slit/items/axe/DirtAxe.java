package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class DirtAxe extends ItemAxe {
 public DirtAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("dirt_axe");
  setTranslationKey("dirt_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}