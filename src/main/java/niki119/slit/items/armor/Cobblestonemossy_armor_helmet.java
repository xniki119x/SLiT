package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cobblestonemossy_armor_helmet extends ItemArmor {
    public Cobblestonemossy_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:cobblestonemossy_armor_helmet");
        setTextureName("slit:armor/cobblestonemossy_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}