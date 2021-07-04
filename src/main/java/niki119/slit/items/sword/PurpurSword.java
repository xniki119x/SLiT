package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class PurpurSword extends ItemSword {
 public PurpurSword(ToolMaterial material){
  super(material);
  setRegistryName("purpur_sword");
  setTranslationKey("purpur_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}