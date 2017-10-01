package goldil0x.tradition.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    /**ITEMS LIST**/
    public static BasicItem itemRock;

    public static void init() {
        /**ITEM INIT HERE**/
        itemRock = register(new BasicItem("itemRock").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof BasicItem) {
            ((BasicItem)item).registerItemModel();
        }

        return item;
    }

}