package goldil0x.tradition.proxy;

import goldil0x.tradition.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        ModItems.registerRenders();
    }
}
