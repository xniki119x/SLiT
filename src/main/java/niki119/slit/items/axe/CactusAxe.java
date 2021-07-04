package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class CactusAxe extends ItemAxe {
 public CactusAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("cactus_axe");
  setTranslationKey("cactus_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}