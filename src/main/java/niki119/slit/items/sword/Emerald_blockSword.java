package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Emerald_blockSword extends ItemSword {
 public Emerald_blockSword(ToolMaterial material){
  super(material);
  setRegistryName("emerald_block_sword");
  setTranslationKey("emerald_block_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}