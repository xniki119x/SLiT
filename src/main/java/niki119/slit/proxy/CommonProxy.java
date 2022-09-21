package niki119.slit.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import niki119.slit.registry.CraftRegistry;
import niki119.slit.registry.ItemRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        ItemRegistry.register();
        //RegistryItems.register();
        //RegistryBlocks.register();
    }

    public void init(FMLInitializationEvent event)
    {
        CraftRegistry.register();
        //RegistryCrafts.register();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
