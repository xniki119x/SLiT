package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Coal_armor_chestplate extends ItemArmor {
    public Coal_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:coal_armor_chestplate");
        setTextureName("slit:armor/coal_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
