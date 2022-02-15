package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class IceShovel extends ItemSpade {
 public IceShovel(ToolMaterial material){
  super(material);
  setRegistryName("ice_shovel");
  setTranslationKey("ice_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}