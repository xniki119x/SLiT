package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class GravelSword extends ItemSword {
 public GravelSword(ToolMaterial material){
  super(material);
  setRegistryName("gravel_sword");
  setTranslationKey("gravel_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}