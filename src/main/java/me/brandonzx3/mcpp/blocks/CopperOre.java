package me.brandonzx3.mcpp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperOre extends OreBlock {

    public CopperOre() {
        super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(3f, 4f)
            .sound(SoundType.STONE)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
        );
    }
}
