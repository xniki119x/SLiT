package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Lapis_armor_helmet extends ItemArmor {
    public Lapis_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:lapis_armor_helmet");
        setTextureName("slit:armor/lapis_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
