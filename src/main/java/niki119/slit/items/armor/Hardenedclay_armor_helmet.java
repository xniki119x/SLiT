package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hardenedclay_armor_helmet extends ItemArmor {
    public Hardenedclay_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:hardenedclay_armor_helmet");
        setTextureName("slit:armor/hardenedclay_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
