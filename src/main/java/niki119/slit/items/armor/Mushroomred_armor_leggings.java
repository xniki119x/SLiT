package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroomred_armor_leggings extends ItemArmor {
    public Mushroomred_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:mushroomred_armor_leggings");
        setTextureName("slit:armor/mushroomred_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
