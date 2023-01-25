package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Clay_armor_chestplate extends ItemArmor {
    public Clay_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:clay_armor_chestplate");
        setTextureName("slit:armor/clay_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
