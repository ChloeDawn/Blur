package com.tterrag.blur.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;

@Mixin(GameRenderer.class)
public interface MixinGameRenderer {

    @Invoker
    void invokeLoadShader(Identifier loc);

}
