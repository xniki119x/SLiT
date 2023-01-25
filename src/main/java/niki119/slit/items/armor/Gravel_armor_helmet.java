package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Gravel_armor_helmet extends ItemArmor {
    public Gravel_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:gravel_armor_helmet");
        setTextureName("slit:armor/gravel_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
