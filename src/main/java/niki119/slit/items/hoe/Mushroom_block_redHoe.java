package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Mushroom_block_redHoe extends ItemHoe {
 public Mushroom_block_redHoe(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_red_hoe");
  setTranslationKey("mushroom_block_red_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}