package leee.nc;

import leee.nc.command.NCCommand;
import leee.nc.listener.Join;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public void onEnable() {
        String prefix = ChatColor.AQUA + "[LeeesNC] " + ChatColor.WHITE;

        getServer().getConsoleSender().sendMessage(prefix + "Registering events");
        Bukkit.getServer().getPluginManager().registerEvents(new Join(), this);

        getServer().getConsoleSender().sendMessage(prefix + "Registering command");
        Bukkit.getServer().getPluginCommand("nc").setExecutor(new NCCommand());
        Bukkit.getServer().getPluginCommand("nc").setTabCompleter(new NCCommand());

        getServer().getConsoleSender().sendMessage(prefix + "Finished loading! :)");
    }
}
