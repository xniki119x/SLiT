package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Soulsand_armor_helmet extends ItemArmor {
    public Soulsand_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:soulsand_armor_helmet");
        setTextureName("slit:armor/soulsand_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
