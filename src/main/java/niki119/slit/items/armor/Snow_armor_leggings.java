package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Snow_armor_leggings extends ItemArmor {
    public Snow_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:snow_armor_leggings");
        setTextureName("slit:armor/snow_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
