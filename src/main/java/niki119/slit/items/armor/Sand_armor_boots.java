package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sand_armor_boots extends ItemArmor {
    public Sand_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:sand_armor_boots");
        setTextureName("slit:armor/sand_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
