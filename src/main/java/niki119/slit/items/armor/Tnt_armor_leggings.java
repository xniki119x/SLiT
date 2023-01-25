package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Tnt_armor_leggings extends ItemArmor {
    public Tnt_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:tnt_armor_leggings");
        setTextureName("slit:armor/tnt_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
