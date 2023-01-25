package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Brick_armor_boots extends ItemArmor {
    public Brick_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:brick_armor_boots");
        setTextureName("slit:armor/brick_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
