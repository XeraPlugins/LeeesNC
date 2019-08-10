package Leee.nc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class LeeesNC extends JavaPlugin implements Listener {

    private boolean needPermission;

    private String[] validColorModifiers = new String[]{"AQUA", "BLACK", "BLUE", "DARK_AQUA", "DARK_BLUE", "DARK_GRAY", "DARK_GREEN", "DARK_PURPLE", "DARK_RED", "GOLD", "GRAY", "GREEN", "LIGHT_PURPLE", "RED", "WHITE", "YELLOW"};
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

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, Command command, @Nonnull String commandLabel, @Nonnull String[] args) {

        if (!command.getName().equalsIgnoreCase("nc")) {
            return false;
        }

        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;

        if (needPermission && !player.hasPermission("Leee.nc")) {
            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "You do not have permission to perform this command!");
            return false;
        }

        if (args.length == 0) {
            helpMessage(player);
            return false;
        }

        String userInput = String.join(" ", args).toUpperCase();
        userInput = userInput.replaceAll("LIGHT-", "LIGHT_").replaceAll("DARK-", "DARK_");

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
            changePlayerNameColor(player, modifiers, false);
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

        changePlayerNameColor(player, fullModifiers.toString(), true);

    }

    private void changePlayerNameColor(Player player, String modifiers, boolean notify) {

        getLogger().info("Changing name of Player " + player.getName() + " to: " + modifiers + player.getName() + ChatColor.RESET);

        player.setDisplayName(modifiers + player.getName() + ChatColor.RESET);

        this.getConfig().set(String.valueOf(player.getUniqueId()), modifiers);
        this.saveConfig();

        if (notify) {
            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "Your name is now: " + modifiers + player.getName());
        }

    }

    private void helpMessage(Player player) {

        StringBuilder fancyColorModifiers = new StringBuilder();
        StringBuilder fancyFormatModifiers = new StringBuilder();

        for (String color : validColorModifiers) {
            fancyColorModifiers.append(ChatColor.valueOf(color));
            fancyColorModifiers.append(color);
            fancyColorModifiers.append(ChatColor.RESET);
            fancyColorModifiers.append(", ");
        }

        player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "Please specify a valid color: " + ChatColor.RESET + String.join(", ", fancyColorModifiers.substring(0, fancyColorModifiers.length() - 4)));

        if (allowedFormatModifiers.size() > 0) {

            for (String formatter : allowedFormatModifiers) {
                fancyFormatModifiers.append(ChatColor.valueOf(formatter));
                fancyFormatModifiers.append(formatter);
                fancyFormatModifiers.append(ChatColor.RESET);
                fancyFormatModifiers.append(", ");
            }

            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "You can also use Formatters: " + ChatColor.RESET + String.join(", ", fancyFormatModifiers.substring(0, fancyFormatModifiers.length() - 4)));

        }

    }

}
