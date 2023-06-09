package me.corruptionhades.vapemenu.module.impl.nimorant;

import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.PacketReceivedEvent;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.LookAtS2CPacket;

public class NoRecoil extends Module {
    public NoRecoil() {
        super("NoRecoil", "Disables recoil", Category.NIMORANT);
    }

    @EventTarget
    public void onPacketReceived(PacketReceivedEvent event){
        Packet<?> packet = event.getPacket();
        if(packet instanceof LookAtS2CPacket){
            sendMsg("LookAt packet received! ----------------------------");
        }
    }
}
