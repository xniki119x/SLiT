package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class DioriteSword extends ItemSword {
 public DioriteSword(ToolMaterial material){
  super(material);
  setRegistryName("diorite_sword");
  setTranslationKey("diorite_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}