package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class SandSword extends ItemSword {
 public SandSword(ToolMaterial material){
  super(material);
  setRegistryName("sand_sword");
  setTranslationKey("sand_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}