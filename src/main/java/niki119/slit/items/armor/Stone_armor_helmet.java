package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Stone_armor_helmet extends ItemArmor {
    public Stone_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:stone_armor_helmet");
        setTextureName("slit:armor/stone_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
