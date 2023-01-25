package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Emerald_armor_chestplate extends ItemArmor {
    public Emerald_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:emerald_armor_chestplate");
        setTextureName("slit:armor/emerald_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
