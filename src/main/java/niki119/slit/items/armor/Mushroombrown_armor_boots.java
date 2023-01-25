package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroombrown_armor_boots extends ItemArmor {
    public Mushroombrown_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:mushroombrown_armor_boots");
        setTextureName("slit:armor/mushroombrown_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
