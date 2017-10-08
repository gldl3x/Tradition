package goldil0x.tradition.init;

import goldil0x.tradition.items.item_rockSmall;
import goldil0x.tradition.reference;
import goldil0x.tradition.util.utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.registerItem;

public class ModItems {
    /**<Items>**/
    public static Item rockSmall;
    /**</Items**/
    public static void init(){
        /**<Items Init>**/
        rockSmall = new item_rockSmall("rock_small","rock_small");
        /**</Items Init>**/
    }
    public static void register(){
        /**<Items Registry>**/
        registerItem(rockSmall);
        /**</Items Registry>**/
    }
    public static void registerRenders(){
        /**<Items Register Renders>**/
        registerRender(rockSmall);
        /**</Items Register Renders>**/
    }
    public static void registerItem(Item item){
        GameRegistry.register(item);
        utils.getLogger().info("Registered Item " + item.getUnlocalizedName().substring(5));
    }
    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        utils.getLogger().info("Register render for" + item.getUnlocalizedName().substring(5));
    }
}
