package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class DioritePickaxe extends ItemPickaxe {
 public DioritePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("diorite_pickaxe");
  setTranslationKey("diorite_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}