package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class GlassSword extends ItemSword {
 public GlassSword(ToolMaterial material){
  super(material);
  setRegistryName("glass_sword");
  setTranslationKey("glass_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}