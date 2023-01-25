package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Prismarine_roughPickaxe extends ItemPickaxe {
 public Prismarine_roughPickaxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:prismarine_rough_pickaxe");
  setTextureName("slit:prismarine_rough_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}