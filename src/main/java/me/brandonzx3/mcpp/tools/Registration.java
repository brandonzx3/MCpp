package me.brandonzx3.mcpp.tools;

import java.util.function.Supplier;

import me.brandonzx3.mcpp.MCpp;
import me.brandonzx3.mcpp.blocks.BlockItemBase;
import me.brandonzx3.mcpp.blocks.CopperOre;
import me.brandonzx3.mcpp.items.AxeBase;
import me.brandonzx3.mcpp.items.ItemBase;
import me.brandonzx3.mcpp.items.ItemTier;
import me.brandonzx3.mcpp.items.PickaxeBase;
import me.brandonzx3.mcpp.items.ShovelBase;
import me.brandonzx3.mcpp.items.SwordBase;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCpp.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCpp.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //items
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);

    //tools
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordBase(ItemTier.COPPER, 1, -2.4f));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeBase(ItemTier.COPPER, 0, -2.8f));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeBase(ItemTier.COPPER, 5f, -3.1f));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelBase(ItemTier.COPPER, -3, 0.5f));

    //blocks
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);

    //block items
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
}