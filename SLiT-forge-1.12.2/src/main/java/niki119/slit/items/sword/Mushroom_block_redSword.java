package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Mushroom_block_redSword extends ItemSword {
 public Mushroom_block_redSword(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_red_sword");
  setTranslationKey("mushroom_block_red_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}