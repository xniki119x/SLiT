package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Obsidian_armor_helmet extends ItemArmor {
    public Obsidian_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:obsidian_armor_helmet");
        setTextureName("slit:armor/obsidian_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
