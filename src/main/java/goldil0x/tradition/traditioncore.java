package goldil0x.tradition;
import goldil0x.tradition.items.ModItems;
import goldil0x.tradition.proxy.CommonProxy;
import goldil0x.tradition.tab.CreativeTabTraditionCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = reference.MODID, name = reference.NAME, version = reference.VERSION)
public class traditioncore {

    @Mod.Instance(reference.MODID)
    public static traditioncore instance;
    public static CreativeTabTraditionCore tabTradition;

    @SidedProxy(serverSide = reference.SERVER_PROXY_CLASS, clientSide = reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.preInit();
        proxy.preInit(event);
        tabTradition = new CreativeTabTraditionCore(CreativeTabs.getNextID(), "tab_tradition");
        proxy.registerRenders();
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
