package me.brandonzx3.mcpp.items;

import me.brandonzx3.mcpp.MCpp;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(MCpp.tab));
    }
}
