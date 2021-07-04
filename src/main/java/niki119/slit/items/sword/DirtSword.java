package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class DirtSword extends ItemSword {
 public DirtSword(ToolMaterial material){
  super(material);
  setRegistryName("dirt_sword");
  setTranslationKey("dirt_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}