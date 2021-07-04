package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class BedrockShovel extends ItemSpade {
 public BedrockShovel(ToolMaterial material){
  super(material);
  setRegistryName("bedrock_shovel");
  setTranslationKey("bedrock_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}