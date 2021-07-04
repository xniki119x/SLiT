package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class StoneSword extends ItemSword {
 public StoneSword(ToolMaterial material){
  super(material);
  setRegistryName("stone_sword");
  setTranslationKey("stone_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}