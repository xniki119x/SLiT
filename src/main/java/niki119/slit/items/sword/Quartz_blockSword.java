package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Quartz_blockSword extends ItemSword {
 public Quartz_blockSword(ToolMaterial material){
  super(material);
  setRegistryName("quartz_block_sword");
  setTranslationKey("quartz_block_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}