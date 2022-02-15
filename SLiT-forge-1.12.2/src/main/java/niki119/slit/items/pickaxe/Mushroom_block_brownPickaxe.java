package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Mushroom_block_brownPickaxe extends ItemPickaxe {
 public Mushroom_block_brownPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_brown_pickaxe");
  setTranslationKey("mushroom_block_brown_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}