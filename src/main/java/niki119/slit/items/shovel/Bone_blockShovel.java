package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Bone_blockShovel extends ItemSpade {
 public Bone_blockShovel(ToolMaterial material){
  super(material);
  setRegistryName("bone_block_shovel");
  setTranslationKey("bone_block_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}