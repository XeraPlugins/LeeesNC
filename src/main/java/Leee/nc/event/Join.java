package Leee.nc.event;

import Leee.nc.LeeesNC;
import Leee.nc.utils.NameColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        String modifiers = LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(String.valueOf(player.getUniqueId()));

        if (modifiers != null && !modifiers.isEmpty()) {
            NameColor.changePlayerNameColor(player, modifiers, false);
        }

    }
}
