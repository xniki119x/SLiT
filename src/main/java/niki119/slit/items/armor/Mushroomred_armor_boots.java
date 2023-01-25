package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroomred_armor_boots extends ItemArmor {
    public Mushroomred_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:mushroomred_armor_boots");
        setTextureName("slit:armor/mushroomred_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
