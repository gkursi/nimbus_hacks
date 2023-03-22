package me.corruptionhades.vapemenu.module.impl.nimorant;

import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.PacketReceivedEvent;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.*;

public class NoStartBorder extends Module {
    public NoStartBorder() {
        super("NoStartBorder", "Removes the game start border in Nimorant", Category.NIMORANT);
    }

    @EventTarget
    public void onPacketReceived(PacketReceivedEvent event){
        Packet<?> packet = event.getPacket();
        if ((packet instanceof WorldBorderCenterChangedS2CPacket || packet instanceof WorldBorderSizeChangedS2CPacket
                || packet instanceof WorldBorderInitializeS2CPacket
                || packet instanceof WorldBorderInterpolateSizeS2CPacket
                || packet instanceof WorldBorderWarningBlocksChangedS2CPacket)) {
            event.setCancelled(true);
        }
    }
}
