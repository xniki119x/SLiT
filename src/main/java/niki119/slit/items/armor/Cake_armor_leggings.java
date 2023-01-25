package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cake_armor_leggings extends ItemArmor {
    public Cake_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:cake_armor_leggings");
        setTextureName("slit:armor/cake_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
