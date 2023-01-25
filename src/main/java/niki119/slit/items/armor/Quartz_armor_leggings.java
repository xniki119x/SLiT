package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Quartz_armor_leggings extends ItemArmor {
    public Quartz_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:quartz_armor_leggings");
        setTextureName("slit:armor/quartz_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
