package goldil0x.tradition.proxy;

import goldil0x.tradition.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }
    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

}