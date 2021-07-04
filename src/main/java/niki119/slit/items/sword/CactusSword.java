package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class CactusSword extends ItemSword {
 public CactusSword(ToolMaterial material){
  super(material);
  setRegistryName("cactus_sword");
  setTranslationKey("cactus_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}