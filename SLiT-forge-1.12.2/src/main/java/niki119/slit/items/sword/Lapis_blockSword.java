package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Lapis_blockSword extends ItemSword {
 public Lapis_blockSword(ToolMaterial material){
  super(material);
  setRegistryName("lapis_block_sword");
  setTranslationKey("lapis_block_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}