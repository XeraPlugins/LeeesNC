package Leee.nc.command;

import Leee.nc.LeeesNC;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NCCommand implements CommandExecutor, TabExecutor {
    public String clickme = "Click me!";

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must join the server to use this command");
            return false;
        } else {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("nc") && args.length != 0) {
                if (player.hasPermission("Leee.nc")) {
                    switch (args[0]) {
                        case "red":
                            player.setDisplayName(ChatColor.RED + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.RED + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.RED + "Your name is now red");
                            return true;
                        case "dark-red":
                            player.setDisplayName(ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_RED + "Your name is now dark red");
                            return true;
                        case "green":
                            player.setDisplayName(ChatColor.GREEN + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.GREEN + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.GREEN + "Your name is now green");
                            return true;
                        case "dark-green":
                            player.setDisplayName(ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_GREEN + "Your name is now dark green");
                            return true;
                        case "blue":
                            player.setDisplayName(ChatColor.BLUE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.BLUE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.BLUE + "Your name is now blue");
                            return true;
                        case "dark-blue":
                            player.setDisplayName(ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_BLUE + "Your name is now dark blue");
                            return true;
                        case "pink":
                            player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "Your name is now pink");
                            return true;
                        case "white":
                            player.setDisplayName(ChatColor.WHITE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.WHITE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.WHITE + "Your name is now white");
                            return true;
                        case "gray":
                            player.setDisplayName(ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_GRAY + "Your name is now gray");
                            return true;
                        case "gold":
                            player.setDisplayName(ChatColor.GOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.GOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.GOLD + "Your name is now gold");
                            return true;
                        case "purple":
                            player.setDisplayName(ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_PURPLE + "Your name is now purple");
                            return true;
                        case "aqua":
                            player.setDisplayName(ChatColor.AQUA + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.AQUA + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.AQUA + "Your name is now aqua");
                            return true;
                        case "yellow":
                            player.setDisplayName(ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.YELLOW + "Your name is now yellow");
                            return true;
                        case "bold-white":
                            player.setDisplayName(ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.BOLD + "Your name is now bold white");
                            return true;
                        case "dark-aqua":
                            player.setDisplayName(ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.DARK_AQUA + "Your name is now dark aqua");
                            return true;
                        case "black":
                            player.setDisplayName(ChatColor.BLACK + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), ChatColor.BLACK + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage(ChatColor.BLACK + "Your name is now black");
                            return true;
                        case "rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now rainbow", ""));
                            return true;
                        }
                        case "bold-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "Your name is now bold red");
                            return true;
                        case "bold-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.BOLD + "Your name is now bold dark red");
                            return true;
                        case "bold-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.BOLD + "Your name is now bold green");
                            return true;
                        case "bold-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "Your name is now bold dark green");
                            return true;
                        case "bold-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.BOLD + "Your name is now bold blue");
                            return true;
                        case "bold-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.BOLD + "Your name is now  bold dark blue");
                            return true;
                        case "bold-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Your name is now bold pink");
                            return true;
                        case "bold-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.BOLD + "Your name is now bold gray");
                            return true;
                        case "bold-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "Your name is now bold gold");
                            return true;
                        case "bold-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Your name is now bold purple");
                            return true;
                        case "bold-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.BOLD + "Your name is now bold aqua");
                            return true;
                        case "bold-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "Your name is now bold yellow");
                            return true;
                        case "bold-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Your name is now bold dark aqua");
                            return true;
                        case "bold-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.BOLD + "Your name is now bold black");
                            return true;
                        case "bold-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.BOLD).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now bold-rainbow", "" + ChatColor.BOLD));
                            return true;
                        }
                        case "italic-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic black");
                            return true;
                        case "italic-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + "Your name is now italic red");
                            return true;
                        case "italic-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic dark red");
                            return true;
                        case "italic-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + "Your name is now italic aqua");
                            return true;
                        case "italic-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Your name is now italic dark aqua");
                            return true;
                        case "italic-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + "Your name is now italic blue");
                            return true;
                        case "italic-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + "Your name is now italic dark blue");
                            return true;
                        case "italic-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + "Your name is now italic green");
                            return true;
                        case "italic-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + "Your name is now italic dark green");
                            return true;
                        case "italic-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + "Your name is now italic pink");
                            return true;
                        case "italic-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + "Your name is now italic purple");
                            return true;
                        case "italic-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + "Your name is now italic gray");
                            return true;
                        case "italic-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + "Your name is now italic gold");
                            return true;
                        case "italic-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + "Your name is now italic yellow");
                            return true;
                        case "italic-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + "Your name is now italic white");
                            return true;
                        case "italic-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.ITALIC).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now italic-rainbow", "" + ChatColor.ITALIC));
                            return true;
                        }
                        case "italic-bold-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold white");
                            return true;
                        case "italic-bold-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold blue");
                            return true;
                        case "italic-bold-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark blue");
                            return true;
                        case "italic-bold-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold green");
                            return true;
                        case "italic-bold-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark green");
                            return true;
                        case "italic-bold-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold aqua");
                            return true;
                        case "italic-bold-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark aqua");
                            return true;
                        case "italic-bold-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold pink");
                            return true;
                        case "italic-bold-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold purple");
                            return true;
                        case "italic-bold-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold black");
                            return true;
                        case "italic-bold-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gold");
                            return true;
                        case "italic-bold-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold yellow");
                            return true;
                        case "italic-bold-gray":
                            player.setDisplayName("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gray");
                            return true;
                        case "italic-bold-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold red");
                            return true;
                        case "italic-bold-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark red");
                            return true;
                        case "italic-bold-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add(ChatColor.DARK_BLUE);
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.ITALIC).append(ChatColor.BOLD).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now italic-bold-rainbow", "" + ChatColor.ITALIC + ChatColor.BOLD));
                            return true;
                        }
                        case "underline-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + "Your name is now underline dark red");
                            return true;
                        case "underline-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + "Your name is now underline red");
                            return true;
                        case "underline-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + "Your name is now underline dark blue");
                            return true;
                        case "underline-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + "Your name is now underline blue");
                            return true;
                        case "underline-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + "Your name is now underline dark aqua");
                            return true;
                        case "underline-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Your name is now underline aqua");
                            return true;
                        case "underline-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + "Your name is now underline yellow");
                            return true;
                        case "underline-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + "Your name is now underline gold");
                            return true;
                        case "underline-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "Your name is now underline pink");
                            return true;
                        case "underline-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + "Your name is now underline purple");
                            return true;
                        case "underline-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + "Your name is now underline black");
                            return true;
                        case "underline-light-gray":
                            player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + "Your name is now underline light gray");
                            return true;
                        case "underline-dark-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + "Your name is now underline dark gray");
                            return true;
                        case "underline-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + "Your name is now underline dark green");
                            return true;
                        case "underline-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "Your name is now underline green");
                            return true;
                        case "underline-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + "Your name is now underline white");
                            return true;
                        case "underline-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.UNDERLINE).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now underline-rainbow", "" + ChatColor.UNDERLINE));
                            return true;
                        }
                        case "underline-bold-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark red");
                            return true;
                        case "underline-bold-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold red");
                            return true;
                        case "underline-bold-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark blue");
                            return true;
                        case "underline-bold-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold blue");
                            return true;
                        case "underline-bold-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark aqua");
                            return true;
                        case "underline-bold-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold aqua");
                            return true;
                        case "underline-bold-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold yellow");
                            return true;
                        case "underline-bold-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold gold");
                            return true;
                        case "underline-bold-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold pink");
                            return true;
                        case "underline-bold-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold purple");
                            return true;
                        case "underline-bold-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold black");
                            return true;
                        case "underline-bold-light-gray":
                            player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold light gray");
                            return true;
                        case "underline-bold-dark-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark gray");
                            return true;
                        case "underline-bold-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark green");
                            return true;
                        case "underline-bold-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold green");
                            return true;
                        case "underline-bold-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold white");
                            return true;
                        case "underline-bold-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.UNDERLINE).append(ChatColor.BOLD).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now underline-bold-rainbow", "" + ChatColor.UNDERLINE + ChatColor.BOLD));
                            return true;
                        }
                        case "strike-bold-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark red");
                            return true;
                        case "strike-bold-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold red");
                            return true;
                        case "strike-bold-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark blue");
                            return true;
                        case "strike-bold-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold blue");
                            return true;
                        case "strike-bold-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark aqua");
                            return true;
                        case "strike-bold-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold aqua");
                            return true;
                        case "strike-bold-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold yellow");
                            return true;
                        case "strike-bold-gold":
                            player.setDisplayName("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold gold");
                            return true;
                        case "strike-bold-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold pink");
                            return true;
                        case "strike-bold-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold purple");
                            return true;
                        case "strike-bold-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold black");
                            return true;
                        case "strike-bold-light-gray":
                            player.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike light gray");
                            return true;
                        case "strike-bold-dark-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark gray");
                            return true;
                        case "strike-bold-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark green");
                            return true;
                        case "strike-bold-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold green");
                            return true;
                        case "strike-bold-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold white");
                            return true;
                        case "strike-bold-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.STRIKETHROUGH).append(ChatColor.BOLD).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now strike-bold-rainbow", "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD));
                            return true;
                        }
                        case "strike-dark-red":
                            player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark red");
                            return true;
                        case "strike-red":
                            player.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + "Your name is now strike bold red");
                            return true;
                        case "strike-dark-blue":
                            player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark blue");
                            return true;
                        case "strike-blue":
                            player.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + "Your name is now strike bold blue");
                            return true;
                        case "strike-dark-aqua":
                            player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark aqua");
                            return true;
                        case "strike-aqua":
                            player.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + "Your name is now strike bold aqua");
                            return true;
                        case "strike-yellow":
                            player.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "Your name is now strike bold yellow");
                            return true;
                        case "strike-pink":
                            player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + "Your name is now strike bold pink");
                            return true;
                        case "strike-purple":
                            player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + "Your name is now strike bold purple");
                            return true;
                        case "strike-black":
                            player.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + "Your name is now strike bold black");
                            return true;
                        case "strike-light-gray":
                            player.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + "Your name is now strike light gray");
                            return true;
                        case "strike-dark-gray":
                            player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark gray");
                            return true;
                        case "strike-dark-green":
                            player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark green");
                            return true;
                        case "strike-green":
                            player.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + "Your name is now strike bold green");
                            return true;
                        case "strike-white":
                            player.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + "Your name is now strike bold white");
                            return true;
                        case "strike-rainbow": {
                            List<ChatColor> colors = new ArrayList<>();

                            colors.add(ChatColor.DARK_RED);
                            colors.add(ChatColor.GOLD);
                            colors.add(ChatColor.YELLOW);
                            colors.add(ChatColor.DARK_GREEN);
                            colors.add(ChatColor.BLUE);
                            colors.add((ChatColor.DARK_BLUE));
                            colors.add(ChatColor.DARK_PURPLE);

                            StringBuilder builder = new StringBuilder();
                            List<Character> chars = new ArrayList<>();

                            for (int i = 0; i < player.getName().length(); i++) {
                                char c = player.getName().charAt(i);

                                chars.add(c);
                            }

                            int i = 0;

                            for (Character letter : chars) {
                                if (i == colors.size()) {
                                    i = 0;
                                }

                                builder.append(colors.get(i)).append(ChatColor.STRIKETHROUGH).append(letter);

                                i++;
                            }

                            String newname = builder.toString();

                            player.setDisplayName(newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), newname + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + makeRainbow("Your name is now strike-rainbow", "" + ChatColor.STRIKETHROUGH));
                            return true;
                        }
                        case "reset":{
                            player.setDisplayName("" + ChatColor.RESET + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(player.getName(), "" + ChatColor.RESET + player.getName() + ChatColor.RESET);
                            Leee.nc.LeeesNC.getPlugin(LeeesNC.class).saveConfig();
                            if (Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()) != null) {
                                player.setPlayerListName(LeeesNC.getPlugin(LeeesNC.class).getConfig().getString(player.getName()));
                            }
                            player.sendMessage("" + ChatColor.RESET + "Your name has been reset");
                            return true;
                        }
                        default: {
                            player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "Incorrect colour specification Type '/nc' for help");
                            return true;
                        }
                    }

                    
                } else {
                    player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must donate to the server to use this command. Type /donate to donate.");
                    return true;
                }
            } else {
                List<ChatColor> colors = new ArrayList<>();

                colors.add(ChatColor.DARK_RED);
                colors.add(ChatColor.GOLD);
                colors.add(ChatColor.YELLOW);
                colors.add(ChatColor.DARK_GREEN);
                colors.add(ChatColor.BLUE);
                colors.add(ChatColor.DARK_BLUE);
                colors.add(ChatColor.DARK_PURPLE);

                StringBuilder builder = new StringBuilder();
                List<Character> chars = new ArrayList<>();

                String name = "rainbow";

                for (int i = 0; i < name.length(); i++){
                    char c = name.charAt(i);

                    chars.add(c);
                }

                int i = 0;

                for (Character letter : chars) {
                    if (i == colors.size()) {
                        i = 0;
                    }

                    builder.append(colors.get(i)).append(letter);

                    i++;
                }

                String newname = builder.toString();

                player.spigot().sendMessage(new TextComponent(c("&9--------------------------------------------")));
                player.spigot().sendMessage(new TextComponent(c("&b(( LeeesNC ))")));
                player.spigot().sendMessage(new TextComponent(c("&e(( /nc <colour> <type-colour> ))")));
                player.spigot().sendMessage(new TextComponent(c("&e(( /nc reset to reset your name ))")));
                player.spigot().sendMessage(new TextComponent(c("&b(( Types ))")));
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&nunderline&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc underline-")).append(c("&n&lunderline-bold&r")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc underline-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&mstrike&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc strike-")).append(c("&m&lstrike-bold&r")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc strike-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&lbold&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc bold-")).append(c("&oitalic&r")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc italic-")).append(c("&n&litalic-bold")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc italic-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new TextComponent(c(c("&b(( Colours ))"))));
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &cred&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc red")).append(c("&4dark-red ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-red")).append(c("&agreen ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc green")).append(c("&2dark-green ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-green")).append(newname).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc rainbow")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &9blue&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc blue")).append(c("&1dark-blue ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-blue")).append(c("&6gold ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc gold")).append(c("&eyellow ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc yellow")).append(c("&0black")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc black")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &5purple&r " )).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc purple")).append(c("&dpink ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc pink")).append(c("&7gray ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc gray")).append(c("&baqua ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc aqua")).append(c("&3dark-aqua ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-aqua")).append(c("&fwhite")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc white")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new TextComponent(c("&9--------------------------------------------")));
                return true;
            }
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        final List<String> completions = new ArrayList<>();
        final List<String> colors = new ArrayList<>(Arrays.asList(
        "red", "dark-red", "green", "dark-green", "blue", "dark-blue", "pink", "white", "gray", "gold", "purple", "aqua", "yellow", "dark-aqua", "black", "rainbow",
        "bold-white", "bold-red", "bold-dark-red", "bold-green", "bold-dark-green", "bold-blue", "bold-dark-blue", "bold-pink", "bold-gray", "bold-gold", "bold-purple", "bold-aqua", "bold-yellow", "bold-dark-aqua", "bold-black", "bold-rainbow",
        "italic-black", "italic-red", "italic-dark-red", "italic-aqua", "italic-dark-aqua", "italic-blue", "italic-dark-blue", "italic-green", "italic-dark-green", "italic-pink", "italic-purple", "italic-gray", "italic-gold", "italic-yellow", "italic-white", "italic-rainbow",
        "italic-bold-white", "italic-bold-blue", "italic-bold-dark-blue", "italic-bold-green", "italic-bold-dark-green", "italic-bold-aqua", "italic-bold-dark-aqua", "italic-bold-pink", "italic-bold-purple", "italic-bold-black", "italic-bold-gold", "italic-bold-yellow", "italic-bold-gray", "italic-bold-red", "italic-bold-dark-red", "italic-bold-rainbow",
        "underline-dark-red", "underline-red", "underline-dark-blue", "underline-blue", "underline-dark-aqua", "underline-aqua", "underline-yellow", "underline-gold", "underline-pink", "underline-purple", "underline-black", "underline-light-gray", "underline-dark-gray", "underline-dark-green", "underline-green", "underline-white", "underline-rainbow",
        "underline-bold-dark-red", "underline-bold-red", "underline-bold-dark-blue", "underline-bold-blue", "underline-bold-dark-aqua", "underline-bold-aqua", "underline-bold-yellow", "underline-bold-gold", "underline-bold-pink", "underline-bold-purple", "underline-bold-black", "underline-bold-light-gray", "underline-bold-dark-gray", "underline-bold-dark-green", "underline-bold-green", "underline-bold-white", "underline-bold-rainbow",
        "strike-bold-dark-red", "strike-bold-red", "strike-bold-dark-blue", "strike-bold-blue", "strike-bold-dark-aqua", "strike-bold-aqua", "strike-bold-yellow", "strike-bold-gold", "strike-bold-pink", "strike-bold-purple", "strike-bold-black", "strike-bold-light-gray", "strike-bold-dark-gray", "strike-bold-dark-green", "strike-bold-green", "strike-bold-white", "strike-bold-rainbow",
        "strike-dark-red", "strike-red", "strike-dark-blue", "strike-blue", "strike-dark-aqua", "strike-aqua", "strike-yellow", "strike-pink", "strike-purple", "strike-black", "strike-light-gray", "strike-dark-gray", "strike-dark-green", "strike-green", "strike-white", "strike-rainbow",
        "reset"));

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (!player.hasPermission("Leee.nc")) {
                return completions;
            }

            // First argument
            if (args.length == 1) {
                StringUtil.copyPartialMatches(args[0], colors, completions);
                Collections.sort(completions);

                return completions;
            }

            // All other arguments
            if (args.length > 1) {
                return completions;
            }
        }

        return completions;
    }

    String makeRainbow(String text, String format) {
        List<ChatColor> colors = new ArrayList<>();

        colors.add(ChatColor.DARK_RED);
        colors.add(ChatColor.GOLD);
        colors.add(ChatColor.YELLOW);
        colors.add(ChatColor.DARK_GREEN);
        colors.add(ChatColor.BLUE);
        colors.add(ChatColor.DARK_BLUE);
        colors.add(ChatColor.DARK_PURPLE);

        StringBuilder builder = new StringBuilder();
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            chars.add(c);
        }

        int i = 0;

        for (Character letter : chars) {
            if (i == colors.size()) {
                i = 0;
            }

            builder.append(colors.get(i)).append(format).append(letter);

            i++;
        }

        return builder.toString();
    }

    private String c(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
