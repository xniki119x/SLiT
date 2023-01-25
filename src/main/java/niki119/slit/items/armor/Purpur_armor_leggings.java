package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Purpur_armor_leggings extends ItemArmor {
    public Purpur_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:purpur_armor_leggings");
        setTextureName("slit:armor/purpur_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
