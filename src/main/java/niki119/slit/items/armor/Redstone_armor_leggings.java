package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redstone_armor_leggings extends ItemArmor {
    public Redstone_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:redstone_armor_leggings");
        setTextureName("slit:armor/redstone_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
