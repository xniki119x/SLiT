package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class AndesiteSword extends ItemSword {
 public AndesiteSword(ToolMaterial material){
  super(material);
  setRegistryName("andesite_sword");
  setTranslationKey("andesite_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}