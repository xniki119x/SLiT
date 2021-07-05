package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class MagmaAxe extends ItemAxe {
 public MagmaAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("magma_axe");
  setTranslationKey("magma_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}