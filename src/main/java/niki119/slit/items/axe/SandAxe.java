package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class SandAxe extends ItemAxe {
 public SandAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("sand_axe");
  setTranslationKey("sand_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}