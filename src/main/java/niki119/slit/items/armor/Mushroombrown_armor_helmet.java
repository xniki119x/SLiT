package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroombrown_armor_helmet extends ItemArmor {
    public Mushroombrown_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:mushroombrown_armor_helmet");
        setTextureName("slit:armor/mushroombrown_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
