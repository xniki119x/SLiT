package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glowstone_armor_leggings extends ItemArmor {
    public Glowstone_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:glowstone_armor_leggings");
        setTextureName("slit:armor/glowstone_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
