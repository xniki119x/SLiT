package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Coal_armor_helmet extends ItemArmor {
    public Coal_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:coal_armor_helmet");
        setTextureName("slit:armor/coal_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
