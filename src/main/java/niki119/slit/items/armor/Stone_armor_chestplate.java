package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Stone_armor_chestplate extends ItemArmor {
    public Stone_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:stone_armor_chestplate");
        setTextureName("slit:armor/stone_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
