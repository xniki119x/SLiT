package niki119.slit;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import niki119.slit.creativetab.TabSLiT;
import niki119.slit.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = SLiT.MODID, name = SLiT.NAME, version = SLiT.VERSION)

public class SLiT {
    public static final String MODID = "slit";
    public static final String NAME = "SLiT";
    public static final String VERSION = "0.1.5-BETA";
    public static final CreativeTabs creativeTabPickaxe = new TabSLiT("creative_tab_pickaxe");
    public static final CreativeTabs creativeTabAxe = new TabSLiT("creative_tab_axe");
    public static final CreativeTabs creativeTabSword = new TabSLiT("creative_tab_sword");
    public static final CreativeTabs creativeTabHoe = new TabSLiT("creative_tab_hoe");
    public static final CreativeTabs creativeTabShovel = new TabSLiT("creative_tab_shovel");
    public static final String CLIENT_PROXY = "niki119.slit.proxy.ClientProxy";
    public static final String COMMON_PROXY = "niki119.slit.proxy.CommonProxy";
    @Mod.Instance(MODID)
    public static SLiT INSTANCE;

    @SidedProxy(clientSide = "niki119.slit.proxy.ClientProxy", serverSide = "niki119.slit.proxy.CommonProxy")
    public static CommonProxy PROXY;


    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("[Starting "+NAME+" PRE-INITIALIZATION]");
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("[Starting "+NAME+" INITIALIZATION]");
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("[Starting "+NAME+" POST-INITIALIZATION]");
        PROXY.postInit(event);
    }
}
