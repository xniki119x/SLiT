package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Soulsand_armor_chestplate extends ItemArmor {
    public Soulsand_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:soulsand_armor_chestplate");
        setTextureName("slit:armor/soulsand_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
