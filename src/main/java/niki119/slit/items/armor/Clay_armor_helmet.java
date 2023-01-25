package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Clay_armor_helmet extends ItemArmor {
    public Clay_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:clay_armor_helmet");
        setTextureName("slit:armor/clay_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
