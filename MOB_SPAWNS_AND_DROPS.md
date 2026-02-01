# Mob Spawns, Drops, and JEI Integration - Setup Complete

## Summary of Changes

### 1. Spawn Eggs Added ✓
Added spawn eggs for all mobs in `ItemsRegistry.java`:
- Akaname Spawn Egg
- Kitsune Spawn Egg
- Enenra Spawn Egg
- Oni Spawn Egg
- Onibi Spawn Egg
- Jorogumo Spawn Egg
- Komainu Spawn Egg
- Tanuki Spawn Egg
- Kawauso Spawn Egg
- Two-Tailed Fox Spawn Egg

All spawn eggs are registered with appropriate colors and will appear in the creative tab.

### 2. Loot Tables Verified ✓
All mob loot tables exist and are correctly configured:

| Mob | Drops |
|-----|-------|
| Kitsune | Kitsune Tail (0-2), Kitsune Hide (1) |
| Oni | Oni Horn (1-2), Ruby (1) |
| Akaname | Akaname Tongue (0-2, affected by Looting) |
| Jorogumo | Jorogumo Eye (0-2, affected by Looting) |
| Onibi | Spirit Flame |
| Enenra | (check loot table) |
| Komainu | (check loot table) |
| Tanuki | (check loot table) |
| Kawauso | (check loot table) |
| Two-Tailed Fox | (check loot table) |

### 3. JEI Integration Added ✓
Created `JEIPlugin.java` with:
- Item information for all masks
- Item information for all special katanas
- Item information for all mob drops
- Automatic recipe registration

All JEI descriptions are translatable via the language file.

### 4. Mask Rendering Fixed ✓
Fixed 3D rendering for:
- Oni Mask
- Kitsune Mask
- Straw Hat

These now render as proper 3D models instead of flat icons.

## Testing Checklist

### Spawn Eggs
- [ ] Spawn eggs appear in creative inventory
- [ ] Spawn eggs can spawn their respective mobs
- [ ] Spawned mobs have correct appearance

### Mob Drops
- [ ] Kill Kitsune → drops Kitsune Tail and Hide
- [ ] Kill Oni → drops Oni Horn and Ruby
- [ ] Kill Akaname → drops Akaname Tongue
- [ ] Kill Jorogumo → drops Jorogumo Eye
- [ ] Kill Onibi → drops Spirit Flame
- [ ] Looting enchantment increases drops

### JEI Integration
- [ ] Open JEI and search for "mask" - should show info
- [ ] Search for mob drops - should show source information
- [ ] Recipes display correctly

### Mask Rendering
- [ ] Equip Oni Mask - should render as 3D model
- [ ] Equip Kitsune Mask - should render as 3D model
- [ ] Equip Straw Hat - should render as 3D model

## Troubleshooting

### Mobs Not Dropping Items
1. **Check if mobs are spawned naturally or via spawn egg** - Both should work
2. **Verify game rules** - Make sure `doMobLoot` is true: `/gamerule doMobLoot true`
3. **Check logs** - Look for any errors related to loot tables
4. **Test with Looting** - Some items have higher drop rates with Looting enchantment

### Spawn Eggs Not Working
1. **Rebuild the project** - Make sure all changes are compiled
2. **Clear resource cache** - Press F3+T in-game to reload resources
3. **Check creative tab** - Spawn eggs should appear in "Samurai Dynasty" tab

### JEI Not Showing Information
1. **Verify JEI is installed** - Check mods folder
2. **Check JEI version** - Must be compatible with Minecraft 1.21.8
3. **Reload resources** - Press F3+T in-game

## Natural Mob Spawning

To enable natural mob spawning, you'll need to add spawn rules. This requires creating spawn configurations in:
- `data/samurai_dynasty/worldgen/biome_modifier/` (for biome-specific spawns)
- Or use spawn placement rules in entity registration

Would you like me to add natural spawning configurations?

## Files Modified

1. `src/main/java/net/veroxuniverse/samurai_dynasty/registry/ItemsRegistry.java`
   - Added spawn egg registrations
   - Added ModEntityTypes import

2. `src/main/java/net/veroxuniverse/samurai_dynasty/integration/JEIPlugin.java`
   - NEW FILE: JEI integration plugin

3. `src/main/resources/assets/samurai_dynasty/lang/en_us.json`
   - Added JEI information translations
   - Added twotailed_spawn_egg translation

4. `src/main/resources/assets/samurai_dynasty/models/item/twotailed_spawn_egg.json`
   - NEW FILE: Model for Two-Tailed Fox spawn egg

5. `src/main/java/net/veroxuniverse/samurai_dynasty/client/armors/SamuraiArmorRenderer.java`
   - Added oniMask() renderer
   - Added kitsuneMask() renderer

6. `src/main/java/net/veroxuniverse/samurai_dynasty/client/armors/ArmorRendererRegistry.java`
   - Registered Oni Mask renderer
   - Registered Kitsune Mask renderer

7. `src/main/java/net/veroxuniverse/samurai_dynasty/SamuraiDynastyMod.java`
   - Added Oni Mask to AzIdentityRegistry
   - Added Kitsune Mask to AzIdentityRegistry
