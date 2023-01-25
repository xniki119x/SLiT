package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sealantern_armor_helmet extends ItemArmor {
    public Sealantern_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:sealantern_armor_helmet");
        setTextureName("slit:armor/sealantern_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
