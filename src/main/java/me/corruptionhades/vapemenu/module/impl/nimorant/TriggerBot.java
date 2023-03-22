package me.corruptionhades.vapemenu.module.impl.nimorant;

import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.EventUpdate;
import me.corruptionhades.vapemenu.event.impl.PacketSendEvent;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;

public class TriggerBot extends Module {
    public TriggerBot() {
        super("ValoTriggerBot", "Right-clicks whenever you hover over a player.", Category.NIMORANT);
    }

    @EventTarget
    public void onUpdate(EventUpdate e){
        try {
            if(mc.interactionManager==null) return;
            if(mc.crosshairTarget==null) return;
            Entity target = ((EntityHitResult)mc.crosshairTarget).getEntity();
            if(target!=null) mc.interactionManager.interactEntity(mc.player, target, Hand.MAIN_HAND);
        } catch(Exception exc){
            sendMsg("&d[&cERR&d]&f An error occurred. ("+exc.getMessage()+")");
        }
    }

}
