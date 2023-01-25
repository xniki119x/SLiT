package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glass_armor_chestplate extends ItemArmor {
    public Glass_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:glass_armor_chestplate");
        setTextureName("slit:armor/glass_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
