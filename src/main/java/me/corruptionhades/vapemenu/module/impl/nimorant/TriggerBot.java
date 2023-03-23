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

import java.awt.*;
import java.awt.event.MouseEvent;

public class TriggerBot extends Module {
    Robot robot;
    public TriggerBot() {
        super("ValoTriggerBot", "Auto-shoots", Category.NIMORANT);
        try {
            robot = new Robot();
        } catch (Exception err){
            err.printStackTrace();
            robot = null;
        }
    }

    @EventTarget
    public void onUpdate(EventUpdate e){
        try {
            if(mc.interactionManager==null) return;
            if(mc.crosshairTarget==null) return;
            Entity target = ((EntityHitResult)mc.crosshairTarget).getEntity();
            try {
                robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
                robot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
            } catch (Exception ignored) {}
        } catch(Exception ignore){}
    }

}
