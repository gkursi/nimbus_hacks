package me.corruptionhades.vapemenu.module.impl.misc;

import me.corruptionhades.vapemenu.VapeMenu;
import me.corruptionhades.vapemenu.event.EventTarget;
import me.corruptionhades.vapemenu.event.impl.EventUpdate;
import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;

public class ESP extends Module {
    public ESP(String name, String description, Category category) {
        super("ESP", "Shows players", Category.MISC);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @EventTarget
    public void onEventUpdate(EventUpdate event){
        if(mc.world==null||mc.player==null) return;
        if(!mc.world.isClient) return;

    }
}
