package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sponge_armor_chestplate extends ItemArmor {
    public Sponge_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:sponge_armor_chestplate");
        setTextureName("slit:armor/sponge_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
