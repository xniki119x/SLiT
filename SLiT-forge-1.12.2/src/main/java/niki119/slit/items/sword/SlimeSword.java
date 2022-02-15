package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class SlimeSword extends ItemSword {
 public SlimeSword(ToolMaterial material){
  super(material);
  setRegistryName("slime_sword");
  setTranslationKey("slime_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}