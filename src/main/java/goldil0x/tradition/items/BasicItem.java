package goldil0x.tradition.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import goldil0x.tradition.main;

public class BasicItem extends Item {

    protected String name;

    public BasicItem(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public BasicItem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}