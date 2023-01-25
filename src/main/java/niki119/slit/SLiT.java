package niki119.slit;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;
import niki119.slit.creativetab.TabSLiT;
import niki119.slit.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SLiT.MODID)

public class SLiT {
    public static final String MODID = "slit";
    public static final String NAME = "SLiT";
    public static final String VERSION = "0.1.6-BETA";
    public static final ItemGroup creativeTabPickaxe = new TabSLiT("creative_tab_pickaxe");
    public static final ItemGroup creativeTabAxe = new TabSLiT("creative_tab_axe");
    public static final ItemGroup creativeTabSword = new TabSLiT("creative_tab_sword");
    public static final ItemGroup creativeTabHoe = new TabSLiT("creative_tab_hoe");
    public static final ItemGroup creativeTabShovel = new TabSLiT("creative_tab_shovel");
    public static SLiT INSTANCE;
    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public SLiT(){
        INSTANCE = this;
    }
}
