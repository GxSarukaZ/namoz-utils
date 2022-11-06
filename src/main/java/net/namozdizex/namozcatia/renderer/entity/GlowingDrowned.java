package net.namozdizex.namozcatia.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.DrownedModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Drowned;

@Environment(EnvType.CLIENT)
public class GlowingDrowned <T extends Drowned> extends EyesLayer<T, DrownedModel<T>> {
    public GlowingDrowned(RenderLayerParent<T, DrownedModel<T>> renderLayerParent, EntityRenderDispatcher entityRenderDispatcher) {
        super(renderLayerParent);
    }
    private static final RenderType DROWNED_GLOW_LAYER = RenderType.eyes(new ResourceLocation("namozcatia:textures/entity/monster/zombie/drowned_glowing_layer.png"));

    @Override
    public RenderType renderType() {
        return DROWNED_GLOW_LAYER;
    }
}
