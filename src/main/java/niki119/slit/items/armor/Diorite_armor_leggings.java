package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Diorite_armor_leggings extends ItemArmor {
    public Diorite_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:diorite_armor_leggings");
        setTextureName("slit:armor/diorite_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
