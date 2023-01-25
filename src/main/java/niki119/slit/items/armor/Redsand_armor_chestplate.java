package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redsand_armor_chestplate extends ItemArmor {
    public Redsand_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:redsand_armor_chestplate");
        setTextureName("slit:armor/redsand_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
