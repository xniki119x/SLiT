package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class PurpurShovel extends ItemSpade {
 public PurpurShovel(ToolMaterial material){
  super(material);
  setRegistryName("purpur_shovel");
  setTranslationKey("purpur_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}