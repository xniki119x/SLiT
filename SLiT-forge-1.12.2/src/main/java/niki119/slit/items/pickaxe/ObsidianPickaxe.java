package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class ObsidianPickaxe extends ItemPickaxe {
 public ObsidianPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("obsidian_pickaxe");
  setTranslationKey("obsidian_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}