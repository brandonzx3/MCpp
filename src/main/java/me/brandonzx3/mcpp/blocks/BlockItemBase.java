package me.brandonzx3.mcpp.blocks;

import me.brandonzx3.mcpp.MCpp;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(MCpp.tab));
    }
    
}
