package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Wool_armor_chestplate extends ItemArmor {
    public Wool_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:wool_armor_chestplate");
        setTextureName("slit:armor/wool_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
