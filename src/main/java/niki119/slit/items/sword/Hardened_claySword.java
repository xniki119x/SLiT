package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Hardened_claySword extends ItemSword {
 public Hardened_claySword(ToolMaterial material){
  super(material);
  setRegistryName("hardened_clay_sword");
  setTranslationKey("hardened_clay_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}