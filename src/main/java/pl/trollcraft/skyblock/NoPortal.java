package pl.trollcraft.skyblock;

import org.bukkit.plugin.java.JavaPlugin;

public class NoPortal extends JavaPlugin {
    private final NoPortalListener listener = new NoPortalListener(this);
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(listener, this);
    }
}
