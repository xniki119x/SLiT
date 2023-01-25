package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sand_armor_chestplate extends ItemArmor {
    public Sand_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:sand_armor_chestplate");
        setTextureName("slit:armor/sand_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
