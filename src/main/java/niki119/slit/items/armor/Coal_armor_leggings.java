package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Coal_armor_leggings extends ItemArmor {
    public Coal_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:coal_armor_leggings");
        setTextureName("slit:armor/coal_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
