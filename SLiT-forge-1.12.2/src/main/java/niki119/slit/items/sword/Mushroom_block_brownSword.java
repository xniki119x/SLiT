package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Mushroom_block_brownSword extends ItemSword {
 public Mushroom_block_brownSword(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_brown_sword");
  setTranslationKey("mushroom_block_brown_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}