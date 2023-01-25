package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hardenedclay_armor_chestplate extends ItemArmor {
    public Hardenedclay_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:hardenedclay_armor_chestplate");
        setTextureName("slit:armor/hardenedclay_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}