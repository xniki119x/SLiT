package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class SlimeShovel extends ItemSpade {
 public SlimeShovel(ToolMaterial material){
  super(material);
  setRegistryName("slime_shovel");
  setTranslationKey("slime_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}