package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class BedrockSword extends ItemSword {
 public BedrockSword(ToolMaterial material){
  super(material);
  setRegistryName("bedrock_sword");
  setTranslationKey("bedrock_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}