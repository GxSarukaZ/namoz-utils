package net.namozdizex.namozcatia.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.BlazeModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Blaze;

@Environment(EnvType.CLIENT)
public class GlowingBlaze <T extends Blaze> extends EyesLayer<T, BlazeModel<T>> {
    public GlowingBlaze(RenderLayerParent<T, BlazeModel<T>> renderLayerParent, EntityRenderDispatcher entityRenderDispatcher) {
        super(renderLayerParent);
    }
    private static final RenderType BLAZE_GLOW_PATH = RenderType.eyes(new ResourceLocation("namozcatia:textures/entity/monster/blaze_glowing.png"));

    @Override
    public RenderType renderType() {
        return BLAZE_GLOW_PATH;
    }
}
