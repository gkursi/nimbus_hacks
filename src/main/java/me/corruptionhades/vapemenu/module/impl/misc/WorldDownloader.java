package me.corruptionhades.vapemenu.module.impl.misc;

import me.corruptionhades.vapemenu.module.Category;
import me.corruptionhades.vapemenu.module.Module;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.World;

public class WorldDownloader extends Module {
    public WorldDownloader(String name, String description, Category category) {
        super("WorldDownloader", "Allows you to download the rendered world", Category.MISC);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        // todo: figure out how to make this
    }
}
