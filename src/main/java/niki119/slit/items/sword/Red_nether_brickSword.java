package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Red_nether_brickSword extends ItemSword {
 public Red_nether_brickSword(ToolMaterial material){
  super(material);
  setRegistryName("red_nether_brick_sword");
  setTranslationKey("red_nether_brick_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}