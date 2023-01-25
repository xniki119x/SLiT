package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Beacon_armor_boots extends ItemArmor {
    public Beacon_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:beacon_armor_boots");
        setTextureName("slit:armor/beacon_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
