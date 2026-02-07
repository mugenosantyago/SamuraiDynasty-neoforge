#!/bin/bash
# Script to fix spawn egg transparency
# Converts white backgrounds to transparent

echo "=== Spawn Egg Transparency Fix ==="
echo "This script converts white backgrounds in spawn egg textures to transparent"
echo ""

# Check if ImageMagick is installed
if ! command -v convert &> /dev/null; then
    echo "ERROR: ImageMagick is not installed!"
    echo "Please install it with: brew install imagemagick"
    echo ""
    echo "Or manually edit the spawn eggs in an image editor (like Photoshop/GIMP):"
    echo "1. Open each *spawn_egg.png file"
    echo "2. Add an alpha channel (Layer > Transparency > Add Alpha Channel in GIMP)"
    echo "3. Use magic wand/color select to select white background"
    echo "4. Delete the white background"
    echo "5. Save as PNG"
    exit 1
fi

# Convert all spawn eggs
cd "$(dirname "$0")/src/main/resources/assets/samurai_dynasty/textures/item"

for egg in *spawn_egg.png; do
    echo "Converting $egg..."
    # Convert white (and near-white) pixels to transparent
    convert "$egg" -fuzz 10% -transparent white "${egg}.tmp" && mv "${egg}.tmp" "$egg"
done

echo ""
echo "✅ Done! All spawn eggs now have transparent backgrounds"
echo "The white backgrounds have been converted to transparency"
