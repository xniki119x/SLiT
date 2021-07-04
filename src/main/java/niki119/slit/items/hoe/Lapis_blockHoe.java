package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Lapis_blockHoe extends ItemHoe {
 public Lapis_blockHoe(ToolMaterial material){
  super(material);
  setRegistryName("lapis_block_hoe");
  setTranslationKey("lapis_block_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}