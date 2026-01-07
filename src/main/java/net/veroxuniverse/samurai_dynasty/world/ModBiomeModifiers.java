package net.veroxuniverse.samurai_dynasty.world;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

/**
 * Biome modifiers for mob spawning.
 * Note: Stubbed out due to 1.21.8 API changes in SpawnerData.
 * Mob spawning should be configured via datapacks.
 */
public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> SPAWN_TANUKI = registerKey("spawn_tanuki");
    public static final ResourceKey<BiomeModifier> SPAWN_KOMAINU = registerKey("spawn_komainu");
    public static final ResourceKey<BiomeModifier> SPAWN_KAWAUSO = registerKey("spawn_kawauso");
    public static final ResourceKey<BiomeModifier> SPAWN_KITSUNE = registerKey("spawn_kitsune");
    public static final ResourceKey<BiomeModifier> SPAWN_ONI = registerKey("spawn_oni");
    public static final ResourceKey<BiomeModifier> SPAWN_ENENRA = registerKey("spawn_enenra");
    public static final ResourceKey<BiomeModifier> SPAWN_AKANAME = registerKey("spawn_akaname");
    public static final ResourceKey<BiomeModifier> SPAWN_JOROGUMO = registerKey("spawn_jorogumo");
    public static final ResourceKey<BiomeModifier> SPAWN_TWOTAILED = registerKey("spawn_twotailed");

    // Note: bootstrap method removed due to SpawnerData constructor changes in 1.21.8
    // Mob spawning should be configured via JSON datapacks instead

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, name));
    }
}
