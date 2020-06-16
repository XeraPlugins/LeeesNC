package Leee.nc;

import Leee.nc.command.NCCommand;
import Leee.nc.event.Join;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class LeeesNC extends JavaPlugin {

    public boolean needPermission;

    public String[] validColorModifiers = new String[]{"AQUA", "BLACK", "BLUE", "DARK_AQUA", "DARK_BLUE", "DARK_GRAY", "DARK_GREEN", "DARK_PURPLE", "DARK_RED", "GOLD", "GRAY", "GREEN", "LIGHT_PURPLE", "RED", "WHITE", "YELLOW"};
    public List<String> allowedFormatModifiers = new ArrayList<>();

    public void onEnable() {

        loadConfig();

        needPermission = getConfig().getBoolean("command-needs-permission");

        if (getConfig().getBoolean("modifier-allowed-bold")) {
            allowedFormatModifiers.add("BOLD");
        }
        if (getConfig().getBoolean("modifier-allowed-italic")) {
            allowedFormatModifiers.add("ITALIC");
        }
        if (getConfig().getBoolean("modifier-allowed-magic")) {
            allowedFormatModifiers.add("MAGIC");
        }
        if (getConfig().getBoolean("modifier-allowed-strikethrough")) {
            allowedFormatModifiers.add("STRIKETHROUGH");
        }
        if (getConfig().getBoolean("modifier-allowed-underline")) {
            allowedFormatModifiers.add("UNDERLINE");
        }

        getServer().getPluginManager().registerEvents(new Join(), this);

        this.getCommand("nc").setExecutor(new NCCommand());
        this.getCommand("nc").setTabCompleter(new NCCommand());
    }

    public void loadConfig() {

        getConfig().addDefault("command-needs-permission", false);
        getConfig().addDefault("modifier-allowed-bold", true);
        getConfig().addDefault("modifier-allowed-strikethrough", false);
        getConfig().addDefault("modifier-allowed-underline", false);
        getConfig().addDefault("modifier-allowed-italic", true);
        getConfig().addDefault("modifier-allowed-magic", false);

        getConfig().options().copyDefaults(true);

        saveConfig();

    }

    public boolean isNeedPermission() {
        return needPermission;
    }

    public String[] getValidColorModifiers() {
        return validColorModifiers;
    }

    public List<String> getAllowedFormatModifiers() {
        return allowedFormatModifiers;
    }
}
