package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hardenedclay_armor_boots extends ItemArmor {
    public Hardenedclay_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:hardenedclay_armor_boots");
        setTextureName("slit:armor/hardenedclay_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
