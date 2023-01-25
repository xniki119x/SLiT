package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Netherbrick_armor_helmet extends ItemArmor {
    public Netherbrick_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:netherbrick_armor_helmet");
        setTextureName("slit:armor/netherbrick_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
