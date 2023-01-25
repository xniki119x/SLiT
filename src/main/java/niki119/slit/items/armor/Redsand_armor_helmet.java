package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redsand_armor_helmet extends ItemArmor {
    public Redsand_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:redsand_armor_helmet");
        setTextureName("slit:armor/redsand_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
