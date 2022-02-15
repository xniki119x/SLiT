package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class MelonSword extends ItemSword {
 public MelonSword(ToolMaterial material){
  super(material);
  setRegistryName("melon_sword");
  setTranslationKey("melon_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}