package me.brandonzx3.mcpp.items;

import me.brandonzx3.mcpp.MCpp;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {

    public SwordBase(IItemTier tier, int damage, float speed) {
        super(tier, damage, speed, new Item.Properties().group(MCpp.tab));
    }
}
