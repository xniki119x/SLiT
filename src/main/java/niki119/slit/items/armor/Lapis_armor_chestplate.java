package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Lapis_armor_chestplate extends ItemArmor {
    public Lapis_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:lapis_armor_chestplate");
        setTextureName("slit:armor/lapis_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
