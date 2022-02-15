package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Soul_sandSword extends ItemSword {
 public Soul_sandSword(ToolMaterial material){
  super(material);
  setRegistryName("soul_sand_sword");
  setTranslationKey("soul_sand_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}