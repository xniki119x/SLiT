package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Red_nether_brickAxe extends ItemAxe {
 public Red_nether_brickAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("red_nether_brick_axe");
  setTranslationKey("red_nether_brick_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}