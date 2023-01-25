package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Ice_armor_leggings extends ItemArmor {
    public Ice_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:ice_armor_leggings");
        setTextureName("slit:armor/ice_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
