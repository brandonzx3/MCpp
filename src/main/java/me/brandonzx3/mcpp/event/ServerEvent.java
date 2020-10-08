package me.brandonzx3.mcpp.event;

import me.brandonzx3.mcpp.MCpp;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MCpp.MOD_ID, bus = Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ServerEvent {
    
}
