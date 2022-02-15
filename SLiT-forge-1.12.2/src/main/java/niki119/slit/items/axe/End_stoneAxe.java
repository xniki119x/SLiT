package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class End_stoneAxe extends ItemAxe {
 public End_stoneAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("end_stone_axe");
  setTranslationKey("end_stone_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}