package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Note_armor_boots extends ItemArmor {
    public Note_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:note_armor_boots");
        setTextureName("slit:armor/note_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
