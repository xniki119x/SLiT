package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Nether_brickAxe extends ItemAxe {
 public Nether_brickAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("nether_brick_axe");
  setTranslationKey("nether_brick_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}