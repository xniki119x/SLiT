package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Melon_armor_boots extends ItemArmor {
    public Melon_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:melon_armor_boots");
        setTextureName("slit:armor/melon_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
