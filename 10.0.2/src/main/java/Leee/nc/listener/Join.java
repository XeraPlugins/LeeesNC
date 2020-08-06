package leee.nc.listener;

import leee.nc.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (Main.getPlugin(Main.class).getConfig().getString(e.getPlayer().getName()) != null) {
            player.setDisplayName(Main.getPlugin(Main.class).getConfig().getString(player.getName()));
        }

    }
}
