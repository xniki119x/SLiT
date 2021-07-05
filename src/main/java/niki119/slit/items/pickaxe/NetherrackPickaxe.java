package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class NetherrackPickaxe extends ItemPickaxe {
 public NetherrackPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("netherrack_pickaxe");
  setTranslationKey("netherrack_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}