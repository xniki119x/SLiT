package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Quartz_blockPickaxe extends ItemPickaxe {
 public Quartz_blockPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("quartz_block_pickaxe");
  setTranslationKey("quartz_block_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}