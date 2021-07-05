package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Bone_blockAxe extends ItemAxe {
 public Bone_blockAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("bone_block_axe");
  setTranslationKey("bone_block_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}