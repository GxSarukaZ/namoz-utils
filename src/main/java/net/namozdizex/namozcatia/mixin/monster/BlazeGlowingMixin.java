package net.namozdizex.namozcatia.mixin.monster;

import net.minecraft.client.model.BlazeModel;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.world.entity.monster.Blaze;
import net.namozdizex.namozcatia.renderer.entity.GlowingBlaze;
import net.namozdizex.namozcatia.renderer.entity.GlowingDrowned;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlazeRenderer.class)
public abstract class BlazeGlowingMixin extends MobRenderer<Blaze, BlazeModel<Blaze>> {
    public BlazeGlowingMixin(EntityRendererProvider.Context context, BlazeModel<Blaze> entityModel, float f) {
        super(context, entityModel, f);
    }
    @Inject(method = "<init>", at = @At("TAIL"))
    public void init(EntityRendererProvider.Context context, CallbackInfo ci) {
        this.addLayer(new GlowingBlaze<>(this, context.getEntityRenderDispatcher()));
    }
}
