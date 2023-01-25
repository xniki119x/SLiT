package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Andesite_armor_helmet extends ItemArmor {
    public Andesite_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:andesite_armor_helmet");
        setTextureName("slit:armor/andesite_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
