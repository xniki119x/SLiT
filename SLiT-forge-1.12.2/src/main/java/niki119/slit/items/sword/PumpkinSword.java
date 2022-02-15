package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class PumpkinSword extends ItemSword {
 public PumpkinSword(ToolMaterial material){
  super(material);
  setRegistryName("pumpkin_sword");
  setTranslationKey("pumpkin_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}