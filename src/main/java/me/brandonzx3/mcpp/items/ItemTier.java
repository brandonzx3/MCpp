package me.brandonzx3.mcpp.items;

import java.util.function.Supplier;

import me.brandonzx3.mcpp.tools.Registration;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ItemTier implements IItemTier {
    
    COPPER(2, 200, 6.5f, 3.0f, 14, () -> {
        return Ingredient.fromItems(Registration.COPPER_INGOT.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float damage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ItemTier(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability, Supplier repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.damage = damage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return damage;
    }

    @Override
    public float getEfficiency() {
        // TODO Auto-generated method stub
        return efficiency;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return enchantability;
    }

    @Override
    public int getHarvestLevel() {
        // TODO Auto-generated method stub
        return harvestLevel;
    }

    @Override
    public int getMaxUses() {
        // TODO Auto-generated method stub
        return maxUses;
    }

    @Override
    public Ingredient getRepairMaterial() {
        // TODO Auto-generated method stub
        return repairMaterial.get();
    }
    
}
