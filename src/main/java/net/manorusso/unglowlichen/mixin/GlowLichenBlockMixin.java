package net.manorusso.unglowlichen.mixin;

import net.minecraft.block.GlowLichenBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;


@Mixin(GlowLichenBlock.class)
public abstract class GlowLichenBlockMixin {
    @ModifyVariable(method = "getLuminanceSupplier", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private static int removeLuminance(int luminance) {
        return luminance = 0;
    }

}

