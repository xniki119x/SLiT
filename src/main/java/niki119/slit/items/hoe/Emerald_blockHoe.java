package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Emerald_blockHoe extends ItemHoe {
 public Emerald_blockHoe(ToolMaterial material){
  super(material);
  setRegistryName("emerald_block_hoe");
  setTranslationKey("emerald_block_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}