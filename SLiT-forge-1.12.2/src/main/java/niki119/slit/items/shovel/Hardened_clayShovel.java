package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Hardened_clayShovel extends ItemSpade {
 public Hardened_clayShovel(ToolMaterial material){
  super(material);
  setRegistryName("hardened_clay_shovel");
  setTranslationKey("hardened_clay_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}