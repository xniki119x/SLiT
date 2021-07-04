package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class BeaconPickaxe extends ItemPickaxe {
 public BeaconPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("beacon_pickaxe");
  setTranslationKey("beacon_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}