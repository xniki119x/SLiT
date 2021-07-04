package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class StoneAxe extends ItemAxe {
 public StoneAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("stone_axe");
  setTranslationKey("stone_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}