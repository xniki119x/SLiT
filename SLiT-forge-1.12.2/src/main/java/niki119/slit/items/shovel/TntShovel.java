package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class TntShovel extends ItemSpade {
 public TntShovel(ToolMaterial material){
  super(material);
  setRegistryName("tnt_shovel");
  setTranslationKey("tnt_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}