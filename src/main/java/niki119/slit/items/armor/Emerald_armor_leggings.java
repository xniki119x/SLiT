package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Emerald_armor_leggings extends ItemArmor {
    public Emerald_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:emerald_armor_leggings");
        setTextureName("slit:armor/emerald_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
