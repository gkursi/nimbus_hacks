package me.corruptionhades.vapemenu.module.impl.nimnite;

import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.PacketReceivedEvent;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import me.corruptionhades.vapemenu.setting.ModeSetting;
import net.minecraft.network.Packet;

public class SmartPackets extends Module {

    ModeSetting modeSetting = new ModeSetting("Mode", "LogFileOutput", "LogFileOutput", "ChatOutput");

    public SmartPackets() {
        super("SmartPackets", "Analyse packets", Category.NIMNITE);
    }

    @EventTarget
    public void onPacketReceived(PacketReceivedEvent e){
        Packet<?> p = e.getPacket();

    }
}
