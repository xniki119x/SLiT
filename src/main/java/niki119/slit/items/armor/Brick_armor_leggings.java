package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Brick_armor_leggings extends ItemArmor {
    public Brick_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:brick_armor_leggings");
        setTextureName("slit:armor/brick_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
