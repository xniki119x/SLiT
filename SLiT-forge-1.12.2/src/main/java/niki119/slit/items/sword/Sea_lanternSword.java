package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Sea_lanternSword extends ItemSword {
 public Sea_lanternSword(ToolMaterial material){
  super(material);
  setRegistryName("sea_lantern_sword");
  setTranslationKey("sea_lantern_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}