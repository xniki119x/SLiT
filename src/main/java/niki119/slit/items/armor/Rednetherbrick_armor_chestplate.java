package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Rednetherbrick_armor_chestplate extends ItemArmor {
    public Rednetherbrick_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:rednetherbrick_armor_chestplate");
        setTextureName("slit:armor/rednetherbrick_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
