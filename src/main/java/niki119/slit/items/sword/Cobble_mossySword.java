package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Cobble_mossySword extends ItemSword {
 public Cobble_mossySword(ToolMaterial material){
  super(material);
  setRegistryName("cobble_mossy_sword");
  setTranslationKey("cobble_mossy_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}