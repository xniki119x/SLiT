package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class GraniteSword extends ItemSword {
 public GraniteSword(ToolMaterial material){
  super(material);
  setRegistryName("granite_sword");
  setTranslationKey("granite_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}