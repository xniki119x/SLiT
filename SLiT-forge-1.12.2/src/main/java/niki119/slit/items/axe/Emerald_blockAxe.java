package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Emerald_blockAxe extends ItemAxe {
 public Emerald_blockAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("emerald_block_axe");
  setTranslationKey("emerald_block_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}