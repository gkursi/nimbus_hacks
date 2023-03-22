package me.corruptionhades.vapemenu.module.impl.misc;

import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.PacketReceivedEvent;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import net.minecraft.network.packet.s2c.play.ResourcePackSendS2CPacket;

public class TexturePack extends Module {
    public TexturePack() {
        super("GetTexturePack", "Allows you to get the server texture pack! (Requires re-joining)", Category.MISC);
    }

    @EventTarget
    public void onPacketReceived(PacketReceivedEvent e){
        if(e.getPacket() instanceof ResourcePackSendS2CPacket p){
            sendMsg("Resource pack received! {\"url\": \""+p.getURL()+"\", \"prompt\": \""+p.getPrompt()+"\", \"isRequired\": \""+p.isRequired()+"\"}");
        }
    }
}
