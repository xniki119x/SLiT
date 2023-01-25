package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Tnt_armor_boots extends ItemArmor {
    public Tnt_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:tnt_armor_boots");
        setTextureName("slit:armor/tnt_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
