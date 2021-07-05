package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class ClaySword extends ItemSword {
 public ClaySword(ToolMaterial material){
  super(material);
  setRegistryName("clay_sword");
  setTranslationKey("clay_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}