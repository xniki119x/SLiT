package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Wool_armor_boots extends ItemArmor {
    public Wool_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:wool_armor_boots");
        setTextureName("slit:armor/wool_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
