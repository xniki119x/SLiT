package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroomred_armor_chestplate extends ItemArmor {
    public Mushroomred_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:mushroomred_armor_chestplate");
        setTextureName("slit:armor/mushroomred_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
