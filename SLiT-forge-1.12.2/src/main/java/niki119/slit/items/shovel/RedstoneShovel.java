package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class RedstoneShovel extends ItemSpade {
 public RedstoneShovel(ToolMaterial material){
  super(material);
  setRegistryName("redstone_shovel");
  setTranslationKey("redstone_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}