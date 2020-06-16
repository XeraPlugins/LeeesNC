package Leee.nc.utils;

import Leee.nc.LeeesNC;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Help {
    public static void helpMessage(Player player) {

        StringBuilder fancyColorModifiers = new StringBuilder();
        StringBuilder fancyFormatModifiers = new StringBuilder();

        for (String color : LeeesNC.getPlugin(LeeesNC.class).validColorModifiers) {
            fancyColorModifiers.append(ChatColor.valueOf(color));
            fancyColorModifiers.append(color);
            fancyColorModifiers.append(ChatColor.RESET);
            fancyColorModifiers.append(", ");
        }

        player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "Please specify a valid color: " + ChatColor.RESET + String.join(", ", fancyColorModifiers.substring(0, fancyColorModifiers.length() - 4)));

        if (LeeesNC.getPlugin(LeeesNC.class).allowedFormatModifiers.size() > 0) {

            for (String formatter : LeeesNC.getPlugin(LeeesNC.class).allowedFormatModifiers) {
                fancyFormatModifiers.append(ChatColor.valueOf(formatter));
                fancyFormatModifiers.append(formatter);
                fancyFormatModifiers.append(ChatColor.RESET);
                fancyFormatModifiers.append(", ");
            }

            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "You can also use Formatters: " + ChatColor.RESET + String.join(", ", fancyFormatModifiers.substring(0, fancyFormatModifiers.length() - 4)));

        }

    }
}
