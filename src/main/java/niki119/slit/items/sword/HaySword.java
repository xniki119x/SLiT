package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class HaySword extends ItemSword {
 public HaySword(ToolMaterial material){
  super(material);
  setRegistryName("hay_sword");
  setTranslationKey("hay_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}