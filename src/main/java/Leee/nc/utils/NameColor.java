package Leee.nc.utils;

import Leee.nc.LeeesNC;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class NameColor {
    public static void changePlayerNameColor(Player player, String color, List<String> formatters) {

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

    public static void changePlayerNameColor(Player player, String modifiers, boolean notify) {

        LeeesNC.getPlugin(LeeesNC.class).getLogger().info("Changing name of Player " + player.getName() + " to: " + modifiers + player.getName() + ChatColor.RESET);

        player.setDisplayName(modifiers + player.getName() + ChatColor.RESET);

        LeeesNC.getPlugin(LeeesNC.class).getConfig().set(String.valueOf(player.getUniqueId()), modifiers);
        LeeesNC.getPlugin(LeeesNC.class).saveConfig();

        if (notify) {
            player.sendMessage(ChatColor.YELLOW + "[LeeesNC] " + ChatColor.DARK_AQUA + "Your name is now: " + modifiers + player.getName());
        }

    }
}
