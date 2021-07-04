package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class BeaconAxe extends ItemAxe {
 public BeaconAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("beacon_axe");
  setTranslationKey("beacon_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}