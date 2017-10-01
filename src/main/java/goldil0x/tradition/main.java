package goldil0x.tradition;

import goldil0x.tradition.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = main.MODID, version = main.VERSION, name = main.NAME)

public class main {
    public static final String MODID = "tradition.mod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tradition";

    /**Initialising**/
    @SidedProxy(clientSide="goldil0x.tradition.ClientProxy", serverSide="goldil0x.tradition.ServerProxy")
    public static CommonProxy proxy;

    @Instance
    public static main instance;

    /**Handlers**/
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("PreInit");
        /**Pre-Init**/
        ModItems.init();
        this.proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Init");
        /**Init**/
        this.proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("PostInit");
        /**Post-Init**/
        this.proxy.postInit(e);
    }
}
