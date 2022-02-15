package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class CakeSword extends ItemSword {
 public CakeSword(ToolMaterial material){
  super(material);
  setRegistryName("cake_sword");
  setTranslationKey("cake_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}