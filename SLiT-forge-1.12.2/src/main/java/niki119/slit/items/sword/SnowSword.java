package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class SnowSword extends ItemSword {
 public SnowSword(ToolMaterial material){
  super(material);
  setRegistryName("snow_sword");
  setTranslationKey("snow_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}