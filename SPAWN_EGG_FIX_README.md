# Spawn Egg Transparency Fix

## Problem
All spawn egg textures currently have **white backgrounds** instead of transparent backgrounds. This causes visual issues in-game.

## Current Status
- **Format:** RGB (no alpha channel)  
- **Should be:** RGBA (with alpha channel and transparent backgrounds)

## Affected Files (11 spawn eggs)
```
src/main/resources/assets/samurai_dynasty/textures/item/
├── akaname_spawn_egg.png
├── enenra_spawn_egg.png
├── jorogumo_spawn_egg.png
├── kawauso_spawn_egg.png
├── kitsune_small_spawn_egg.png
├── kitsune_spawn_egg.png
├── komainu_spawn_egg.png
├── oni_spawn_egg.png
├── onibi_spawn_egg.png
├── tanuki_spawn_egg.png
└── twotailed_spawn_egg.png
```

---

## Solution Options

### Option 1: Automated Fix (ImageMagick) - RECOMMENDED

1. **Install ImageMagick:**
   ```bash
   brew install imagemagick
   ```

2. **Run the fix script:**
   ```bash
   ./fix_spawn_egg_transparency.sh
   ```

This will automatically convert all white backgrounds to transparent.

---

### Option 2: Manual Fix (Image Editor)

If you prefer to manually edit the textures:

#### Using GIMP (Free):
1. Open each `*spawn_egg.png` file in GIMP
2. Go to `Layer` → `Transparency` → `Add Alpha Channel`
3. Use the `Select by Color` tool (Shift+O)
4. Click on the white background
5. Press `Delete` to remove the white background
6. Export as PNG: `File` → `Export As` → Save as PNG

#### Using Photoshop:
1. Open each `*spawn_egg.png` file
2. Double-click the background layer to convert to normal layer
3. Use `Magic Wand Tool` (W) to select white background
4. Press `Delete`
5. Save as PNG-24 with transparency

#### Using Preview (macOS):
1. Open spawn egg in Preview
2. Click the `Instant Alpha` tool (in markup toolbar)
3. Drag over white areas to select them
4. Press Delete
5. Export as PNG

---

### Option 3: Manual Command (ImageMagick)

If you have ImageMagick installed, run this for each file:

```bash
cd src/main/resources/assets/samurai_dynasty/textures/item
convert akaname_spawn_egg.png -fuzz 10% -transparent white akaname_spawn_egg.png
# Repeat for each spawn egg...
```

---

## Verification

After fixing, verify the files have transparency:

```bash
file src/main/resources/assets/samurai_dynasty/textures/item/*spawn_egg.png
```

Should show: `PNG image data, 16 x 16, 8-bit/color RGBA` ✅  
(Note the **RGBA** instead of RGB)

---

## Why This Matters

Spawn eggs in Minecraft should have transparent backgrounds so they blend properly with:
- Inventory slots
- Creative menu backgrounds
- Hotbar
- Item frames

Without transparency, you'll see white boxes around the spawn eggs in-game.
