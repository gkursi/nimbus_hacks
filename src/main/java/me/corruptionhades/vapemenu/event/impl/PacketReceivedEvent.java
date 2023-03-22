package me.corruptionhades.vapemenu.event.impl;

import me.corruptionhades.vapemenu.event.Event;
import net.minecraft.network.Packet;

public class PacketReceivedEvent extends Event {
    private final Packet<?> packet;
    public PacketReceivedEvent(Packet<?> packet){
        this.packet = packet;
    }
    public Packet<?> getPacket(){ return this.packet; }
}
