package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class TntAxe extends ItemAxe {
 public TntAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("tnt_axe");
  setTranslationKey("tnt_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}