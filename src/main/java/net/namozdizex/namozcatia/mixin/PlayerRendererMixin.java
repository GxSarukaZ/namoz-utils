package net.namozdizex.namozcatia.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.namozcatia.renderer.GlowingSkinLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerRenderer.class)
public abstract class PlayerRendererMixin extends LivingEntityRenderer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {
    public PlayerRendererMixin(EntityRendererProvider.Context context, PlayerModel<AbstractClientPlayer> entityModel, float f) {
        super(context, entityModel, f);
    }
    @Inject(method = "<init>", at = @At("TAIL"))
    public void init(EntityRendererProvider.Context context, boolean bl, CallbackInfo ci) {
        this.addLayer(new GlowingSkinLayer<>((PlayerRenderer) (Object) this));
    }
    @Inject(method = "renderHand", at = @At("TAIL"))
    private void renderArm(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, AbstractClientPlayer abstractClientPlayer, ModelPart modelPart, ModelPart modelPart2, CallbackInfo ci) {
        float time = (float) abstractClientPlayer.tickCount;
        if (!abstractClientPlayer.isInvisible() && abstractClientPlayer.getName().getString().equals("NamoZDizeX")) {
            modelPart.xRot = 0.0f;
            modelPart.render(poseStack, multiBufferSource.getBuffer(RenderType.eyes(new ResourceLocation("namozcatia", "textures/entity/special-skin/herrscher_of_the_summer.png"))), i, OverlayTexture.NO_OVERLAY, GlowingSkinLayer.makeFade(time), GlowingSkinLayer.makeFade(time), GlowingSkinLayer.makeFade(time), 1.0F);
            modelPart2.xRot = 0.0f;
            modelPart2.render(poseStack, multiBufferSource.getBuffer(RenderType.dragonExplosionAlpha(new ResourceLocation("namozcatia", "textures/entity/special-skin/herrscher_of_the_summer.png"))), i, OverlayTexture.NO_OVERLAY, GlowingSkinLayer.makeFade(time), GlowingSkinLayer.makeFade(time), GlowingSkinLayer.makeFade(time), 1.0F);
        }
    }
}
