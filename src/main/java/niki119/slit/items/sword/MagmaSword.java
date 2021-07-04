package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class MagmaSword extends ItemSword {
 public MagmaSword(ToolMaterial material){
  super(material);
  setRegistryName("magma_sword");
  setTranslationKey("magma_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}