package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class MelonAxe extends ItemAxe {
 public MelonAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("melon_axe");
  setTranslationKey("melon_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}