package me.brandonzx3.mcpp.tab;

import me.brandonzx3.mcpp.tools.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Tab extends ItemGroup {

    public Tab() {
        super("MC++");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Registration.COPPER_INGOT.get());
    }
    
}
