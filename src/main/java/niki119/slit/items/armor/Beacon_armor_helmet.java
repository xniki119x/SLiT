package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Beacon_armor_helmet extends ItemArmor {
    public Beacon_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:beacon_armor_helmet");
        setTextureName("slit:armor/beacon_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
