package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cactus_armor_chestplate extends ItemArmor {
    public Cactus_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:cactus_armor_chestplate");
        setTextureName("slit:armor/cactus_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
