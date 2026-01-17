# AzureLib 3.2.0 Renderer Implementation Guide

Now that AzureLib is ported to 1.21.8, you need to implement the renderer classes.

## Files That Need Implementation

All files in `src/main/java/net/veroxuniverse/samurai_dynasty/client/`:

### Entity Renderers (10 files)
- `entities/AkanameRenderer.java`
- `entities/EnenraRenderer.java`
- `entities/OniRenderer.java`
- `entities/OnibiRenderer.java`
- `entities/KitsuneRenderer.java`
- `entities/JorogumoRenderer.java`
- `entities/KomainuRenderer.java`
- `entities/TanukiRenderer.java`
- `entities/KawausoRenderer.java`
- `entities/TwoTailedRenderer.java`

### Projectile Renderers (2 files)
- `projectiles/ThrownShurikenRenderer.java`
- `projectiles/KitsuneProjectileRenderer.java`

### Armor Renderers (46 files in client/armors/)
All samurai and ninja armor renderers

## Example Implementation Pattern

```java
package net.veroxuniverse.samurai_dynasty.client.entities;

import mod.azure.azurelib.common.api.client.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.veroxuniverse.samurai_dynasty.client.model.AkanameModel;
import net.veroxuniverse.samurai_dynasty.entity.custom.AkanameEntity;

public class AkanameRenderer extends GeoEntityRenderer<AkanameEntity> {
    public AkanameRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AkanameModel());
    }
}
```

## Models Already Exist
- Geo models: `assets/samurai_dynasty/geo/*.json` (35 files)
- Animations: `assets/samurai_dynasty/animations/*.json` (14 files)  
- Armor models: `assets/samurai_dynasty/animmodels/armor/*.json` (104 files)

## Steps to Implement

1. Check AzureLib 3.2.0 API documentation for GeoEntityRenderer changes
2. Update each renderer class with proper extends/constructor
3. Implement GeoModel classes for each entity/armor
4. Test entity rendering in-game
5. Uncomment registrations in `SamuraiDynastyClientMod.java`
6. Test armor 3D models

## Current Status
- ✅ AzureLib dependency added
- ✅ Model/animation JSONs exist
- ❌ Renderer classes need implementation (currently stubs)
- ❌ GeoModel classes may need updating for 1.21.8 API
