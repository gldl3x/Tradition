package goldil0x.tradition.init;

import goldil0x.tradition.items.*;
import goldil0x.tradition.reference;
import goldil0x.tradition.util.utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.registerItem;

public class ModItems {
    /**#---    <Items>     ---#**/
        /**beginning items**/
    public static Item rockSmall;
    public static Item rockLarge;
    public static Item handAxe;
        /**early items**/
    public static Item leatherWrap;
    public static Item leatherString;
    public static Item haft;
    public static Item splitHaft;
    public static Item corchorusSeeds;
        /**later items**/
    public static Item buckle;
    public static Item leatherSatchel;
    /**</Items**/
    public static void init(){
        /**#---     <Items Init>    ---#**/
        rockSmall = new item_rockSmall("rock_small","rock_small");
        rockLarge = new item_rockLarge("rock_large","rock_large");
        handAxe = new item_handAxe("hand_axe","hand_axe");
        leatherWrap = new item_leatherWrap("leather_wrap","leather_wrap");
        leatherString = new item_leatherString("leather_string","leather_string");
        haft = new item_haft("haft","haft");
        splitHaft = new item_splitHaft("split_haft","split_haft");
        corchorusSeeds = new item_corchorusSeeds("corchorus_seeds","corchorus_seeds");
        buckle = new item_buckle("buckle","buckle");
        leatherSatchel = new item_leatherSatchel("leather_satchel","leather_satchel");
        /**</Items Init>**/
    }
    public static void register(){
        /**#---    <Items Registry>    ---#**/
        registerItem(rockSmall);
        registerItem(rockLarge);
        registerItem(handAxe);
        registerItem(leatherWrap);
        registerItem(leatherString);
        registerItem(haft);
        registerItem(splitHaft);
        registerItem(corchorusSeeds);
        registerItem(buckle);
        registerItem(leatherSatchel);
        /**</Items Registry>**/
    }
    public static void registerRenders(){
        /**#---    <Items Register Renders>    ---#**/
        registerRender(rockSmall);
        registerRender(rockLarge);
        registerRender(handAxe);
        registerRender(leatherWrap);
        registerRender(leatherString);
        registerRender(haft);
        registerRender(splitHaft);
        registerRender(corchorusSeeds);
        registerRender(buckle);
        registerRender(leatherSatchel);
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
