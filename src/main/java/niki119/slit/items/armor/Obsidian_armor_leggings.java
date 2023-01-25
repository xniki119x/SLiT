package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Obsidian_armor_leggings extends ItemArmor {
    public Obsidian_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:obsidian_armor_leggings");
        setTextureName("slit:armor/obsidian_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
