package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class BedrockPickaxe extends ItemPickaxe {
 public BedrockPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("bedrock_pickaxe");
  setTranslationKey("bedrock_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}