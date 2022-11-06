package net.namozdizex.namozcatia.mixin.monster;

import net.minecraft.client.model.DrownedModel;
import net.minecraft.client.renderer.entity.AbstractZombieRenderer;
import net.minecraft.client.renderer.entity.DrownedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.monster.Drowned;
import net.namozdizex.namozcatia.renderer.GlowingNamoZLayer;
import net.namozdizex.namozcatia.renderer.entity.GlowingDrowned;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrownedRenderer.class)
public class DrownedGlowingMixin extends AbstractZombieRenderer<Drowned, DrownedModel<Drowned>> {
    public DrownedGlowingMixin(EntityRendererProvider.Context context, DrownedModel<Drowned> zombieModel, DrownedModel<Drowned> zombieModel2, DrownedModel<Drowned> zombieModel3) {
        super(context, zombieModel, zombieModel2, zombieModel3);
    }
    @Inject(method = "<init>", at = @At("TAIL"))
    public void init(EntityRendererProvider.Context context, CallbackInfo ci) {
        this.addLayer(new GlowingDrowned<>(this, context.getEntityRenderDispatcher()));
    }
}
