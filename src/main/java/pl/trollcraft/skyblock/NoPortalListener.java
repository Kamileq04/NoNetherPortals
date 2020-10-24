package pl.trollcraft.skyblock;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class NoPortalListener implements Listener {

    public static NoPortal plugin;

    public NoPortalListener(NoPortal plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerPortal(PlayerPortalEvent event)
    {
        Player player = event.getPlayer();

        if (!player.hasPermission("NoPortal.use"));
        {
            event.setCancelled(true);
            player.sendMessage(Help.color("&cNie mozesz tworzyc portali!"));
        }
    }
}

