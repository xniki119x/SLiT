package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Red_sandSword extends ItemSword {
 public Red_sandSword(ToolMaterial material){
  super(material);
  setRegistryName("red_sand_sword");
  setTranslationKey("red_sand_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}