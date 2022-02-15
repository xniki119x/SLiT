package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class ChorusSword extends ItemSword {
 public ChorusSword(ToolMaterial material){
  super(material);
  setRegistryName("chorus_sword");
  setTranslationKey("chorus_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}