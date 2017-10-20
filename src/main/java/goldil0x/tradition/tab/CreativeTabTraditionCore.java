package goldil0x.tradition.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabTraditionCore extends CreativeTabs{
    public CreativeTabTraditionCore(int index, String label) {
        super(index, label);
    }
    @Override
    public Item getTabIconItem(){
        return Items.BANNER;
    }
}
