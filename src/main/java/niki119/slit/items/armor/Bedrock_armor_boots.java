package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bedrock_armor_boots extends ItemArmor {
    public Bedrock_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:bedrock_armor_boots");
        setTextureName("slit:armor/bedrock_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
