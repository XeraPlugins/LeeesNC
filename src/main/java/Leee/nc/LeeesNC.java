package Leee.nc;

import Leee.nc.command.ICComand;
import Leee.nc.command.NCCommand;
import Leee.nc.listener.Join;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class LeeesNC extends JavaPlugin implements Listener {
    public void onEnable() {
        String prefix = ChatColor.AQUA + "[LeeesNC] " + ChatColor.WHITE;

        getServer().getConsoleSender().sendMessage(prefix + "Registering events");
        Bukkit.getServer().getPluginManager().registerEvents(new Join(), this);

        getServer().getConsoleSender().sendMessage(prefix + "Registering command");
        Bukkit.getServer().getPluginCommand("nc").setExecutor(new NCCommand());
        Bukkit.getServer().getPluginCommand("nc").setTabCompleter(new NCCommand());

        Bukkit.getServer().getPluginCommand("ic").setExecutor(new ICComand());
        Bukkit.getServer().getPluginCommand("ic").setTabCompleter(new ICComand());

        getServer().getConsoleSender().sendMessage(prefix + "Finished loading! :)");
    }
}
