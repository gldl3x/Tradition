package goldil0x.tradition.items;

import goldil0x.tradition.reference;
import goldil0x.tradition.traditioncore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item rockLarge;
    public static Item hide;
    public static Item handAxe;
    public static Item woodChips;
    public static Item barley;
    public static Item oats;
    public static Item rice;
    public static Item rye;
    public static Item hay;
    public static Item jute;

    public static void preInit() {
        rockLarge = new Item().setUnlocalizedName("rock_large").setCreativeTab(traditioncore.tabTradition);
        hide = new Item().setUnlocalizedName("hide").setCreativeTab(traditioncore.tabTradition);
        handAxe = new Item().setUnlocalizedName("hand_axe").setCreativeTab(traditioncore.tabTradition);
        woodChips = new Item().setUnlocalizedName("wood_chips").setCreativeTab(traditioncore.tabTradition);
        barley = new Item().setUnlocalizedName("barley").setCreativeTab(traditioncore.tabTradition);
        oats = new Item().setUnlocalizedName("oats").setCreativeTab(traditioncore.tabTradition);
        rice = new Item().setUnlocalizedName("rice").setCreativeTab(traditioncore.tabTradition);
        rye = new Item().setUnlocalizedName("rye").setCreativeTab(traditioncore.tabTradition);
        hay = new Item().setUnlocalizedName("hay").setCreativeTab(traditioncore.tabTradition);
        jute = new Item().setUnlocalizedName("jute").setCreativeTab(traditioncore.tabTradition);
        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(rockLarge, new ResourceLocation(reference.MODID, "rock_large"));
        GameRegistry.register(hide, new ResourceLocation(reference.MODID, "hide"));
        GameRegistry.register(handAxe, new ResourceLocation(reference.MODID, "hand_axe"));
        GameRegistry.register(woodChips, new ResourceLocation(reference.MODID, "wood_chips"));
        GameRegistry.register(barley, new ResourceLocation(reference.MODID, "barley"));
        GameRegistry.register(oats, new ResourceLocation(reference.MODID, "oats"));
        GameRegistry.register(rice, new ResourceLocation(reference.MODID, "rice"));
        GameRegistry.register(rye, new ResourceLocation(reference.MODID, "rye"));
        GameRegistry.register(hay, new ResourceLocation(reference.MODID, "hay"));
        GameRegistry.register(jute, new ResourceLocation(reference.MODID, "jute"));
    }

    public static void registerRenders() {
        registerRender(rockLarge);
        registerRender(hide);
        registerRender(handAxe);
        registerRender(woodChips);
        registerRender(barley);
        registerRender(oats);
        registerRender(rice);
        registerRender(rye);
        registerRender(hay);
        registerRender(jute);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
