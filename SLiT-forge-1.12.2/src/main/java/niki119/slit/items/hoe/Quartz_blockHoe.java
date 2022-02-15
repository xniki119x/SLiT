package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Quartz_blockHoe extends ItemHoe {
 public Quartz_blockHoe(ToolMaterial material){
  super(material);
  setRegistryName("quartz_block_hoe");
  setTranslationKey("quartz_block_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}