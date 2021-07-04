package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Bone_blockHoe extends ItemHoe {
 public Bone_blockHoe(ToolMaterial material){
  super(material);
  setRegistryName("bone_block_hoe");
  setTranslationKey("bone_block_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}