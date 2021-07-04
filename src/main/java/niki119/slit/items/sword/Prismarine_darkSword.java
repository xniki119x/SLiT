package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Prismarine_darkSword extends ItemSword {
 public Prismarine_darkSword(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_dark_sword");
  setTranslationKey("prismarine_dark_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}