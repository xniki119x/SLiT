package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class SpongePickaxe extends ItemPickaxe {
 public SpongePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("sponge_pickaxe");
  setTranslationKey("sponge_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}