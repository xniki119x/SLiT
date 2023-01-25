package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Beacon_armor_chestplate extends ItemArmor {
    public Beacon_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:beacon_armor_chestplate");
        setTextureName("slit:armor/beacon_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
