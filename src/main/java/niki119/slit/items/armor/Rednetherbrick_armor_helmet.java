package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Rednetherbrick_armor_helmet extends ItemArmor {
    public Rednetherbrick_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:rednetherbrick_armor_helmet");
        setTextureName("slit:armor/rednetherbrick_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}