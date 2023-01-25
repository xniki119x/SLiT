package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Granite_armor_helmet extends ItemArmor {
    public Granite_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:granite_armor_helmet");
        setTextureName("slit:armor/granite_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
