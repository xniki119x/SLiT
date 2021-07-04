package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Mushroom_block_redPickaxe extends ItemPickaxe {
 public Mushroom_block_redPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_red_pickaxe");
  setTranslationKey("mushroom_block_red_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}