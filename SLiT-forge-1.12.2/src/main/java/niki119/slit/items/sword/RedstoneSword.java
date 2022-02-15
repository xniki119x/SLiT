package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class RedstoneSword extends ItemSword {
 public RedstoneSword(ToolMaterial material){
  super(material);
  setRegistryName("redstone_sword");
  setTranslationKey("redstone_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}