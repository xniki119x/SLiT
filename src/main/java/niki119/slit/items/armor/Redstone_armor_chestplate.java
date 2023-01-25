package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redstone_armor_chestplate extends ItemArmor {
    public Redstone_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:redstone_armor_chestplate");
        setTextureName("slit:armor/redstone_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
