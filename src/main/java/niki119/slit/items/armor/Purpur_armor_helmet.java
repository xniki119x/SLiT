package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Purpur_armor_helmet extends ItemArmor {
    public Purpur_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:purpur_armor_helmet");
        setTextureName("slit:armor/purpur_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
