package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Slime_armor_helmet extends ItemArmor {
    public Slime_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:slime_armor_helmet");
        setTextureName("slit:armor/slime_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
