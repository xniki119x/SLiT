package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class WoolSword extends ItemSword {
 public WoolSword(ToolMaterial material){
  super(material);
  setRegistryName("wool_sword");
  setTranslationKey("wool_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}