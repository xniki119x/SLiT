package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Soulsand_armor_boots extends ItemArmor {
    public Soulsand_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:soulsand_armor_boots");
        setTextureName("slit:armor/soulsand_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
