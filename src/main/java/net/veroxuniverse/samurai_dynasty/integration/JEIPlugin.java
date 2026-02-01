package net.veroxuniverse.samurai_dynasty.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

import java.util.List;

/**
 * JEI Plugin for Samurai Dynasty mod
 * Registers custom recipes and provides information for items
 */
@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        // Add information for special items
        addItemInformation(registration);
        
        // Register any custom recipes here if needed
        SamuraiDynastyMod.LOGGER.info("JEI Plugin registered for Samurai Dynasty");
    }

    private void addItemInformation(IRecipeRegistration registration) {
        // Add descriptions for masks
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.ONI_MASK.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.oni_mask.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KITSUNE_MASK.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kitsune_mask.info")
        );

        // Add descriptions for special katanas
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KATANA_ONI.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.katana_oni.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KATANA_KITSUNE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.katana_kitsune.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KATANA_KITSUNE_BLUE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.katana_kitsune_blue.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KATANA_AKANAME.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.katana_akaname.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KATANA_JOROGUMO.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.katana_jorogumo.info")
        );

        // Add descriptions for mob drops
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KITSUNE_HIDE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kitsune_hide.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KITSUNE_TAIL.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kitsune_tail.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.ONI_HORN.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.oni_horn.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.AKANAME_TONGUE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.akaname_tongue.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.JOROGUMO_EYE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.jorogumo_eye.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.SPIRIT_FLAME.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.spirit_flame.info")
        );
    }
}
