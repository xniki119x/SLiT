package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class NetherrackAxe extends ItemAxe {
 public NetherrackAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("netherrack_axe");
  setTranslationKey("netherrack_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}