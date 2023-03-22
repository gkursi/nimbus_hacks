package me.corruptionhades.vapemenu.mixin;

import me.corruptionhades.vapemenu.event.Event;
import me.corruptionhades.vapemenu.event.impl.PacketReceivedEvent;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.PacketListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {

    @Inject(method = "handlePacket", at = @At("HEAD"), cancellable = true)
    private static <T extends PacketListener> void handlePacket(Packet<T> packet, PacketListener listener, CallbackInfo ci) {
       Event pre = new PacketReceivedEvent(packet).call();
       if(pre.isCancelled()) ci.cancel();
    }

}
