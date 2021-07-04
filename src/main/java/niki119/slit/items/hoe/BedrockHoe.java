package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class BedrockHoe extends ItemHoe {
 public BedrockHoe(ToolMaterial material){
  super(material);
  setRegistryName("bedrock_hoe");
  setTranslationKey("bedrock_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}