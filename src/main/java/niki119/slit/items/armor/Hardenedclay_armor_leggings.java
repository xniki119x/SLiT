package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hardenedclay_armor_leggings extends ItemArmor {
    public Hardenedclay_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:hardenedclay_armor_leggings");
        setTextureName("slit:armor/hardenedclay_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
