package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class GlowstoneSword extends ItemSword {
 public GlowstoneSword(ToolMaterial material){
  super(material);
  setRegistryName("glowstone_sword");
  setTranslationKey("glowstone_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}