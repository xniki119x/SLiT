package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class CoalSword extends ItemSword {
 public CoalSword(ToolMaterial material){
  super(material);
  setRegistryName("coal_sword");
  setTranslationKey("coal_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}