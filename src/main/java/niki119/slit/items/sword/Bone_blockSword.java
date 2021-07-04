package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Bone_blockSword extends ItemSword {
 public Bone_blockSword(ToolMaterial material){
  super(material);
  setRegistryName("bone_block_sword");
  setTranslationKey("bone_block_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}