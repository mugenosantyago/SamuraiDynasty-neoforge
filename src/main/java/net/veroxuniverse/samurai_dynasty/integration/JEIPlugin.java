package net.veroxuniverse.samurai_dynasty.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;
import net.veroxuniverse.samurai_dynasty.registry.BlocksRegistry;
import net.veroxuniverse.samurai_dynasty.registry.ItemsRegistry;

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

        // New weapons (Masakari, Kabutowari, Yumi)
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.MASAKARI.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.masakari.info")
        );
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.MASAKARI_NETHERITE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.masakari_netherite.info")
        );
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KABUTOWARI.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kabutowari.info")
        );
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.KABUTOWARI_NETHERITE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kabutowari_netherite.info")
        );
        registration.addItemStackInfo(
            new ItemStack(ItemsRegistry.YUMI.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.yumi.info")
        );
        
        // Add descriptions for Spirit Stone blocks
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.SPIRIT_STONE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.spirit_stone.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.DRAGON_SPIRIT_STONE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.dragon_spirit_stone.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.POLISHED_SPIRIT_STONE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.polished_spirit_stone.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.MOSSY_SPIRIT_STONE_BRICKS.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.mossy_spirit_stone_bricks.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.CHISELED_SPIRIT_STONE_BRICKS.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.chiseled_spirit_stone_bricks.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.PATTERN_SPIRIT_STONE_BRICKS.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.pattern_spirit_stone_bricks.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.MOSAIC_SPIRIT_STONE_BRICKS.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.mosaic_spirit_stone_bricks.info")
        );
        
        // Roof blocks
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.STONE_ROOF.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.stone_roof.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.STONE_ROOF_CORNER.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.stone_roof_corner.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.STONE_ROOF_TOP.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.stone_roof_top.info")
        );
        
        // Statues
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.TANUKI_STATUE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.tanuki_statue.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.KOMAINU_STATUE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.komainu_statue.info")
        );
        
        registration.addItemStackInfo(
            new ItemStack(BlocksRegistry.KAWAUSO_STATUE.get()),
            net.minecraft.network.chat.Component.translatable("jei.samurai_dynasty.kawauso_statue.info")
        );
    }
}
