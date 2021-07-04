package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class SpongeShovel extends ItemSpade {
 public SpongeShovel(ToolMaterial material){
  super(material);
  setRegistryName("sponge_shovel");
  setTranslationKey("sponge_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}