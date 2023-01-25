package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Purpur_armor_boots extends ItemArmor {
    public Purpur_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:purpur_armor_boots");
        setTextureName("slit:armor/purpur_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
