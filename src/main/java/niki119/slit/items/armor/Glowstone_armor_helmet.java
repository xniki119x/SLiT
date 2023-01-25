package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glowstone_armor_helmet extends ItemArmor {
    public Glowstone_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:glowstone_armor_helmet");
        setTextureName("slit:armor/glowstone_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
