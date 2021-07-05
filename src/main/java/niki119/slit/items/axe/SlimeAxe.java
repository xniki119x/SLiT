package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class SlimeAxe extends ItemAxe {
 public SlimeAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("slime_axe");
  setTranslationKey("slime_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}