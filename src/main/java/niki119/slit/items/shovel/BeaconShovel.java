package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class BeaconShovel extends ItemSpade {
 public BeaconShovel(ToolMaterial material){
  super(material);
  setRegistryName("beacon_shovel");
  setTranslationKey("beacon_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}