package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Soulsand_armor_leggings extends ItemArmor {
    public Soulsand_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:soulsand_armor_leggings");
        setTextureName("slit:armor/soulsand_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}