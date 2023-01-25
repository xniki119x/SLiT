package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Emerald_armor_boots extends ItemArmor {
    public Emerald_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:emerald_armor_boots");
        setTextureName("slit:armor/emerald_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
