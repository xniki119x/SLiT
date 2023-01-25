package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cake_armor_helmet extends ItemArmor {
    public Cake_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:cake_armor_helmet");
        setTextureName("slit:armor/cake_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
