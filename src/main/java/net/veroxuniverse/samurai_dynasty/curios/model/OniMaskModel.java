package net.veroxuniverse.samurai_dynasty.curios.model;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.samurai_dynasty.SamuraiDynastyMod;

// TODO: Re-implement for NeoForge 1.21.4 render state system
// HumanoidModel now requires HumanoidRenderState instead of LivingEntity
public class OniMaskModel {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(SamuraiDynastyMod.MOD_ID, "oni_mask"), "main");

    public final ModelPart bipedArmorHead;

    public OniMaskModel(ModelPart root) {
        this.bipedArmorHead = root.getChild("armorHead");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create()
                .texOffs(25, 17).mirror().addBox(3.5F, -3.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.5F, -12.0F, 0.75F, -0.3054F, -0.2443F, -0.2443F));

        PartDefinition cube_r2 = armorHead.addOrReplaceChild("cube_r2", CubeListBuilder.create()
                .texOffs(25, 17).addBox(-4.5F, -3.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -12.0F, 0.75F, -0.3054F, 0.2443F, 0.2443F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
