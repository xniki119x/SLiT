package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Pumpkin_armor_chestplate extends ItemArmor {
    public Pumpkin_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:pumpkin_armor_chestplate");
        setTextureName("slit:armor/pumpkin_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
