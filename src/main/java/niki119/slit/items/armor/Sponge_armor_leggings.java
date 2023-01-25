package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sponge_armor_leggings extends ItemArmor {
    public Sponge_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:sponge_armor_leggings");
        setTextureName("slit:armor/sponge_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
