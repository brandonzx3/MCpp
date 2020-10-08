package me.brandonzx3.mcpp;

import me.brandonzx3.mcpp.setup.ClientProxy;
import me.brandonzx3.mcpp.setup.IProxy;
import me.brandonzx3.mcpp.setup.ServerProxy;
import me.brandonzx3.mcpp.tab.Tab;
import me.brandonzx3.mcpp.tools.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MCpp.MOD_ID)
public class MCpp {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static final String MOD_ID = "mcpp";

    public MCpp() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }
    private void clientSetup(final FMLClientSetupEvent event) { }

    public static ItemGroup tab = new Tab();
}