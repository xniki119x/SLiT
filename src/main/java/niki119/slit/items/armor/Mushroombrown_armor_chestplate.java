package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Mushroombrown_armor_chestplate extends ItemArmor {
    public Mushroombrown_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:mushroombrown_armor_chestplate");
        setTextureName("slit:armor/mushroombrown_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
