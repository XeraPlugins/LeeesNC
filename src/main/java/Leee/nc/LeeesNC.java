package Leee.nc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class LeeesNC extends JavaPlugin implements Listener {

    private boolean needPermission;

    private String[] validColorModifiers = new String[]{"AQUA", "BLACK", "BLUE", "DARK-AQUA", "DARK-BLUE", "DARK-GRAY", "DARK-GREEN", "DARK-PURPLE", "DARK-RED", "GOLD", "GRAY", "GREEN", "LIGHT-PURPLE", "RED", "WHITE", "YELLOW"};
    private List<String> allowedFormatModifiers = new ArrayList<>();

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

        getServer().getPluginManager().registerEvents(this, this);

    }

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {

        if (!command.getName().equalsIgnoreCase("nc")) {
            return false;
        }

        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;

        if (needPermission && !player.hasPermission("Leee.nc")) {
            return false;
        }

        if (args.length == 0) {
            helpMessage(player);
            return false;
        }

        String userInput = String.join(" ", args).toUpperCase();

        String usedColorModifier = null;

        for (String color : validColorModifiers) {
            if (userInput.contains(color)) {
                usedColorModifier = color;
                break;
            }
        }

        if (usedColorModifier == null || usedColorModifier.isEmpty()) {
            helpMessage(player);
            return false;
        }

        List<String> usedFormatModifiers = new ArrayList<>();

        for (String mod : allowedFormatModifiers) {
            if (userInput.contains(mod)) {
                usedFormatModifiers.add(mod);
            }
        }

        changePlayerNameColor(player, usedColorModifier, usedFormatModifiers);

        return true;

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        String modifiers = this.getConfig().getString(String.valueOf(player.getUniqueId()));

        if (modifiers != null && !modifiers.isEmpty()) {
            changePlayerNameColor(player, modifiers);
        }

    }

    private void loadConfig() {

        getConfig().addDefault("command-needs-permission", false);
        getConfig().addDefault("modifier-allowed-bold", true);
        getConfig().addDefault("modifier-allowed-strikethrough", false);
        getConfig().addDefault("modifier-allowed-underline", false);
        getConfig().addDefault("modifier-allowed-italic", true);
        getConfig().addDefault("modifier-allowed-magic", false);

        getConfig().options().copyDefaults(true);

        saveConfig();

    }

    private void changePlayerNameColor(Player player, String color, List<String> formatters) {

        ChatColor colorModifier = ChatColor.valueOf(color);
        List<ChatColor> formatModifier = new ArrayList<>();

        for (String formatter : formatters) {
            formatModifier.add(ChatColor.valueOf(formatter));
        }

        StringBuilder fullModifiers = new StringBuilder();

        fullModifiers.append(colorModifier);

        for (ChatColor formatter : formatModifier) {
            fullModifiers.append(formatter);
        }

        changePlayerNameColor(player, fullModifiers.toString());

    }

    private void changePlayerNameColor(Player player, String modifiers) {

        getLogger().info("Changing name color of Player " + player.getName() + " to " + modifiers + player.getName() + ChatColor.RESET);

        player.setDisplayName(modifiers + player.getName() + ChatColor.RESET);

        this.getConfig().set(String.valueOf(player.getUniqueId()), modifiers);
        this.saveConfig();

    }

    private void helpMessage(Player player) {

        player.sendMessage("Please specify a valid color: " + String.join(", ", validColorModifiers));

        if (allowedFormatModifiers.size() > 0) {
            player.sendMessage("You can also use Formatters: " + String.join(", ", allowedFormatModifiers));
        }

    }

}
