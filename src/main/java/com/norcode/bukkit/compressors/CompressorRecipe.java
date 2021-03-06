package com.norcode.bukkit.compressors; 
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;


public class CompressorRecipe {
    
    private ItemStack result;
    private List<ItemStack> steps;
    
    public CompressorRecipe(ItemStack result, ItemStack ... steps) {
        this.result = result;
        this.steps = Arrays.asList(steps);
    }

    public String toString() {
        String out = "";
        for (ItemStack s: steps) {
            out += s.toString() + " => ";
        }
        out += getResult().toString();
        return out;
    }

    public ItemStack getResult() {
        return result;
    }
    public List<ItemStack> getSteps() {
        return steps;
    }
    public void setResult(ItemStack result) {
        this.result = result;
    }
    public void setSteps(List<ItemStack> steps) {
        this.steps = steps;
    }
    public boolean isSourceMaterial(ItemStack stack) {
        for (ItemStack s: steps) {
            if (stack.isSimilar(s)) {
                return true;
            } else {
            }
        }
        return false;
    }
}
