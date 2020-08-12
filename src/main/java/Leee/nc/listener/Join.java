package Leee.nc.listener;

import Leee.nc.LeeesNC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(e.getPlayer().getName()) != null) {
            player.setDisplayName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
        }

    }
}
