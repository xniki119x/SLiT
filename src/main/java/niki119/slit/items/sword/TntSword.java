package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class TntSword extends ItemSword {
 public TntSword(ToolMaterial material){
  super(material);
  setRegistryName("tnt_sword");
  setTranslationKey("tnt_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}