package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Brick_armor_helmet extends ItemArmor {
    public Brick_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:brick_armor_helmet");
        setTextureName("slit:armor/brick_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
