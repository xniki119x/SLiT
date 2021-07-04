package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Bone_blockPickaxe extends ItemPickaxe {
 public Bone_blockPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("bone_block_pickaxe");
  setTranslationKey("bone_block_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}