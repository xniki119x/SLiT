package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Mushroom_block_brownHoe extends ItemHoe {
 public Mushroom_block_brownHoe(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_brown_hoe");
  setTranslationKey("mushroom_block_brown_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}