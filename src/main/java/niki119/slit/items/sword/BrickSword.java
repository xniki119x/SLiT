package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class BrickSword extends ItemSword {
 public BrickSword(ToolMaterial material){
  super(material);
  setRegistryName("brick_sword");
  setTranslationKey("brick_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}