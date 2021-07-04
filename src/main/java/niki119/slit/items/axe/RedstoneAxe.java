package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class RedstoneAxe extends ItemAxe {
 public RedstoneAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("redstone_axe");
  setTranslationKey("redstone_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}