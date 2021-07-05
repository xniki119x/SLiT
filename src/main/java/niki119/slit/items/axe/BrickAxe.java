package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class BrickAxe extends ItemAxe {
 public BrickAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("brick_axe");
  setTranslationKey("brick_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}