package net.namozdizex.namozcatia.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

@Environment(EnvType.CLIENT)
public class GlowingNamoZLayer extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>>
{

    public GlowingNamoZLayer(RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> renderLayerParent) {
        super(renderLayerParent);
    }

    public static float makeFade(float alpha) {
        return Math.min(0.7F, (Mth.sin(alpha / 24) + 1F) / 2F + 0.15F);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, AbstractClientPlayer entity, float f, float g, float h, float j, float k, float l) {
        float time = Minecraft.getInstance().getDeltaFrameTime() + entity.tickCount;
        if (entity.getName().getString().equals("NamoZDizeX")) {
            VertexConsumer inveterate = multiBufferSource.getBuffer(RenderType.eyes(new ResourceLocation("namozutils", "textures/entity/special-skin/herrscher_of_the_summer.png")));
            this.getParentModel().renderToBuffer(poseStack, inveterate, i, OverlayTexture.NO_OVERLAY, makeFade(time), makeFade(time), makeFade(time), 1.0F);
        }
    }
}
