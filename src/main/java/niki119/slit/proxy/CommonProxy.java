package niki119.slit.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
