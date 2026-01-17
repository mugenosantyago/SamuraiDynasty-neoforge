# AzureLib Integration Checklist for 1.21.8

When AzureLib is ported to 1.21.8, follow these steps:

## 1. Enable AzureLib Dependency
**File:** `build.gradle`
```gradle
dependencies {
    // Uncomment this line:
    implementation "mod.azure.azurelib:azurelib-neo-${minecraft_version}:${azurelib_version}"
```

**File:** `gradle.properties`
```properties
# Update azurelib_version to the 1.21.8 version number
azurelib_version=X.X.X  # Replace with actual version
```

## 2. Re-enable Entity Renderers
**File:** `src/main/java/net/veroxuniverse/samurai_dynasty/client/SamuraiDynastyClientMod.java`

In `registerRenderers()` method, uncomment:
- AkanameRenderer
- EnenraRenderer
- OniRenderer
- OnibiRenderer
- KitsuneRenderer
- JorogumoRenderer
- KomainuRenderer
- TanukiRenderer
- KawausoRenderer
- TwoTailedRenderer
- ThrownShurikenRenderer
- KitsuneProjectileRenderer

## 3. Register 3D Armor Renderers
**File:** `src/main/java/net/veroxuniverse/samurai_dynasty/client/SamuraiDynastyClientMod.java`

Add new method for armor layer rendering (currently commented as TODO)

## 4. Update Armor Models
**File:** `src/main/java/net/veroxuniverse/samurai_dynasty/item/armor/lib/SamuraiArmorItem.java`

The armor uses `Equippable` component but needs AzureLib's model system for 3D rendering.
Current setup works functionally (defense, equipping) but renders as 2D icon.

## 5. Files Using AzureLib
These files import/use AzureLib and are ready to work once dependency is added:

**Client Renderers:**
- `src/main/java/net/veroxuniverse/samurai_dynasty/client/entities/*.java` (10 entity renderers)
- `src/main/java/net/veroxuniverse/samurai_dynasty/client/armors/*.java` (46 armor renderers)
- `src/main/java/net/veroxuniverse/samurai_dynasty/client/weapons/*.java` (8 weapon renderers)
- `src/main/java/net/veroxuniverse/samurai_dynasty/client/ArmorAnimator.java`

**Curios Models:**
- `src/main/java/net/veroxuniverse/samurai_dynasty/curios/model/OniMaskModel.java`
- `src/main/java/net/veroxuniverse/samurai_dynasty/curios/model/KitsuneMaskModel.java`
- `src/main/java/net/veroxuniverse/samurai_dynasty/curios/layers/*.java` (4 files)

**JSON Models:**
- `src/main/resources/assets/samurai_dynasty/geo/*.json` (35 model files)
- `src/main/resources/assets/samurai_dynasty/animations/*.json` (14 animation files)
- `src/main/resources/assets/samurai_dynasty/animmodels/armor/*.json` (104 armor model files)

## 6. Current Status (Without AzureLib)

**✅ Working:**
- Armor equippable & provides defense
- Weapons have damage/speed
- Masks equippable
- All items craftable
- Entities spawn (no models)
- JEI integration

**❌ Missing (Needs AzureLib):**
- 3D animated armor models
- 3D entity models (mobs invisible/basic)
- Animated weapon models
- Curios mask rendering

## 7. Quick Test After Enabling
1. Build mod: `./gradlew clean build`
2. Check for import errors in renderer classes
3. Test armor rendering in-game
4. Verify entity models render
5. Check mask models work

## Notes
- All renderer classes already exist and are written
- Just need AzureLib dependency + uncomment registrations
- Armor base system (SamuraiArmorItem) already supports both vanilla and AzureLib rendering
