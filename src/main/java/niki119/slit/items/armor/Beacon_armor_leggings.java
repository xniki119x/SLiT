package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Beacon_armor_leggings extends ItemArmor {
    public Beacon_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:beacon_armor_leggings");
        setTextureName("slit:armor/beacon_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
