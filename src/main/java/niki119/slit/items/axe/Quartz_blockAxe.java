package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Quartz_blockAxe extends ItemAxe {
 public Quartz_blockAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("quartz_block_axe");
  setTranslationKey("quartz_block_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}