package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Mushroom_block_brownAxe extends ItemAxe {
 public Mushroom_block_brownAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("mushroom_block_brown_axe");
  setTranslationKey("mushroom_block_brown_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}