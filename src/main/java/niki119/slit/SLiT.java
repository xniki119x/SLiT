package niki119.slit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import niki119.slit.creativetab.TabSLiT;
import niki119.slit.proxy.CommonProxy;

@Mod(modid = SLiT.MODID, name = SLiT.NAME, version = SLiT.VERSION)//, dependencies = "required-after:mcef@[1.0,2.0);")

public class SLiT {
    public static final String MODID = "slit";
    public static final String NAME = "SLiT";
    public static final String VERSION = "@VERSION@";
    public static final CreativeTabs creativeTab = new TabSLiT("creative_tab");
    public static final String CLIENT_PROXY = "niki119.slit.proxy.ClientProxy";
    public static final String COMMON_PROXY = "niki119.slit.proxy.CommonProxy";
    @Mod.Instance(owner = "niki119")
    public static SLiT INSTANCE;

    @SidedProxy(clientSide = "niki119.slit.proxy.ClientProxy", serverSide = "niki119.slit.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[Starting Tools Mod PRE-INITIALIZATION]");
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[Starting Tools Mod INITIALIZATION]");
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("[Starting Tools Mod POST-INITIALIZATION]");
        PROXY.postInit(event);
    }
}
