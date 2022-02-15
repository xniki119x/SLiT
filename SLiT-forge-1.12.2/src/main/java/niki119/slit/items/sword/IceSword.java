package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class IceSword extends ItemSword {
 public IceSword(ToolMaterial material){
  super(material);
  setRegistryName("ice_sword");
  setTranslationKey("ice_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}