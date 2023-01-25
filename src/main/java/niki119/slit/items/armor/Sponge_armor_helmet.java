package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sponge_armor_helmet extends ItemArmor {
    public Sponge_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:sponge_armor_helmet");
        setTextureName("slit:armor/sponge_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
