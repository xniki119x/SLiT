package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Pumpkin_armor_helmet extends ItemArmor {
    public Pumpkin_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:pumpkin_armor_helmet");
        setTextureName("slit:armor/pumpkin_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
