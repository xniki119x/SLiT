package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class MelonPickaxe extends ItemPickaxe {
 public MelonPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("melon_pickaxe");
  setTranslationKey("melon_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}