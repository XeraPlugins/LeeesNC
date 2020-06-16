package Leee.nc.command;

import Leee.nc.LeeesNC;
import Leee.nc.utils.Help;
import Leee.nc.utils.NameColor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NCCommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {

        if (!command.getName().equalsIgnoreCase("nc")) {
            return false;
        }

        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;

        if (LeeesNC.getPlugin(LeeesNC.class).needPermission && !player.hasPermission("Leee.nc")) {
            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "You do not have permission to perform this command!");
            return false;
        }

        if (args.length == 0) {
            Help.helpMessage(player);
            return false;
        }

        String userInput = String.join(" ", args).toUpperCase();
        userInput = userInput.replaceAll("LIGHT-", "LIGHT_").replaceAll("DARK-", "DARK_");

        String usedColorModifier = null;

        for (String color : LeeesNC.getPlugin(LeeesNC.class).validColorModifiers) {
            if (userInput.contains(color)) {
                usedColorModifier = color;
                break;
            }
        }

        if (usedColorModifier == null || usedColorModifier.isEmpty()) {
            Help.helpMessage(player);
            return false;
        }

        List<String> usedFormatModifiers = new ArrayList<>();

        for (String mod : LeeesNC.getPlugin(LeeesNC.class).allowedFormatModifiers) {
            if (userInput.contains(mod)) {
                usedFormatModifiers.add(mod);
            }
        }

        NameColor.changePlayerNameColor(player, usedColorModifier, usedFormatModifiers);

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            final List<String> completions = new ArrayList<>();

            if (LeeesNC.getPlugin(LeeesNC.class).needPermission) {
                if (!player.hasPermission("Leee.nc")) {
                    return null;
                }
            }

            // First argument
            if (args.length == 1) {
                StringUtil.copyPartialMatches(args[0], Arrays.asList(LeeesNC.getPlugin(LeeesNC.class).validColorModifiers), completions);
                Collections.sort(completions);
                return completions;
            }

            // All other arguments
            if (args.length > 1) {
                StringUtil.copyPartialMatches(args[args.length - 1], LeeesNC.getPlugin(LeeesNC.class).allowedFormatModifiers, completions);
                Collections.sort(completions);
                return completions;
            }
        }

        return null;
    }
}
