package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroomred_armor_helmet extends ItemArmor {
    public Mushroomred_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:mushroomred_armor_helmet");
        setTextureName("slit:armor/mushroomred_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
