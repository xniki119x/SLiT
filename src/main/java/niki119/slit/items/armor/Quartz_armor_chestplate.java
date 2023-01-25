package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Quartz_armor_chestplate extends ItemArmor {
    public Quartz_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:quartz_armor_chestplate");
        setTextureName("slit:armor/quartz_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
