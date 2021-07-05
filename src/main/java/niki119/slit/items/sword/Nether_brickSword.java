package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Nether_brickSword extends ItemSword {
 public Nether_brickSword(ToolMaterial material){
  super(material);
  setRegistryName("nether_brick_sword");
  setTranslationKey("nether_brick_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}