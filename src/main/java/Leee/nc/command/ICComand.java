package Leee.nc.command;

import Leee.nc.LeeesNC;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ICComand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must join the server to use this command");
            return false;
        } else {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("ic") && args.length != 0) {
                if (player.hasPermission("Leee.ic")) {
                    ItemStack item = player.getInventory().getItemInMainHand();
                    
                    ItemMeta itemMeta = item.getItemMeta();
                    
                    if (itemMeta != null) {
                        String name = "";

                        if (itemMeta.hasDisplayName()) {
                            name = ChatColor.stripColor(itemMeta.getDisplayName());
                        } else {
                            name = ChatColor.stripColor(item.getType().name().replaceAll("_", " ").toLowerCase());
                        }

                        switch (args[0]) {
                            case "red":
                                itemMeta.setDisplayName(ChatColor.RED + name);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.RED + "Your item is now red");
                                return true;
                            case "dark-red":
                                itemMeta.setDisplayName(ChatColor.DARK_RED + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_RED + "Your item is now dark red");
                                return true;
                            case "green":
                                itemMeta.setDisplayName(ChatColor.GREEN + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.GREEN + "Your item is now green");
                                return true;
                            case "dark-green":
                                itemMeta.setDisplayName(ChatColor.DARK_GREEN + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_GREEN + "Your item is now dark green");
                                return true;
                            case "blue":
                                itemMeta.setDisplayName(ChatColor.BLUE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.BLUE + "Your item is now blue");
                                return true;
                            case "dark-blue":
                                itemMeta.setDisplayName(ChatColor.DARK_BLUE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_BLUE + "Your item is now dark blue");
                                return true;
                            case "pink":
                                itemMeta.setDisplayName(ChatColor.LIGHT_PURPLE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.LIGHT_PURPLE + "Your item is now pink");
                                return true;
                            case "white":
                                itemMeta.setDisplayName(ChatColor.WHITE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.WHITE + "Your item is now white");
                                return true;
                            case "gray":
                                itemMeta.setDisplayName(ChatColor.DARK_GRAY + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_GRAY + "Your item is now gray");
                                return true;
                            case "gold":
                                itemMeta.setDisplayName(ChatColor.GOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.GOLD + "Your item is now gold");
                                return true;
                            case "purple":
                                itemMeta.setDisplayName(ChatColor.DARK_PURPLE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_PURPLE + "Your item is now purple");
                                return true;
                            case "aqua":
                                itemMeta.setDisplayName(ChatColor.AQUA + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.AQUA + "Your item is now aqua");
                                return true;
                            case "yellow":
                                itemMeta.setDisplayName(ChatColor.YELLOW + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.YELLOW + "Your item is now yellow");
                                return true;
                            case "bold-white":
                                itemMeta.setDisplayName(ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.BOLD + "Your item is now bold white");
                                return true;
                            case "dark-aqua":
                                itemMeta.setDisplayName(ChatColor.DARK_AQUA + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.DARK_AQUA + "Your item is now dark aqua");
                                return true;
                            case "black":
                                itemMeta.setDisplayName(ChatColor.BLACK + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage(ChatColor.BLACK + "Your item is now black");
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

                                for (int i = 0; i < name.length(); i++) {
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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now rainbow", ""));
                                return true;
                            }
                            case "bold-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "Your item is now bold red");
                                return true;
                            case "bold-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.BOLD + "Your item is now bold dark red");
                                return true;
                            case "bold-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.BOLD + "Your item is now bold green");
                                return true;
                            case "bold-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "Your item is now bold dark green");
                                return true;
                            case "bold-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.BOLD + "Your item is now bold blue");
                                return true;
                            case "bold-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.BOLD + "Your item is now  bold dark blue");
                                return true;
                            case "bold-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Your item is now bold pink");
                                return true;
                            case "bold-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.BOLD + "Your item is now bold gray");
                                return true;
                            case "bold-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "Your item is now bold gold");
                                return true;
                            case "bold-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Your item is now bold purple");
                                return true;
                            case "bold-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.BOLD + "Your item is now bold aqua");
                                return true;
                            case "bold-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "Your item is now bold yellow");
                                return true;
                            case "bold-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Your item is now bold dark aqua");
                                return true;
                            case "bold-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.BOLD + "Your item is now bold black");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);
                                Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(name, newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now bold-rainbow", "" + ChatColor.BOLD));
                                return true;
                            }
                            case "italic-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your item is now italic black");
                                return true;
                            case "italic-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + "Your item is now italic red");
                                return true;
                            case "italic-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your item is now italic dark red");
                                return true;
                            case "italic-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + "Your item is now italic aqua");
                                return true;
                            case "italic-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Your item is now italic dark aqua");
                                return true;
                            case "italic-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + "Your item is now italic blue");
                                return true;
                            case "italic-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + "Your item is now italic dark blue");
                                return true;
                            case "italic-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + "Your item is now italic green");
                                return true;
                            case "italic-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + "Your item is now italic dark green");
                                return true;
                            case "italic-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + "Your item is now italic pink");
                                return true;
                            case "italic-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + "Your item is now italic purple");
                                return true;
                            case "italic-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + "Your item is now italic gray");
                                return true;
                            case "italic-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + "Your item is now italic gold");
                                return true;
                            case "italic-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + "Your item is now italic yellow");
                                return true;
                            case "italic-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + "Your item is now italic white");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now italic-rainbow", "" + ChatColor.ITALIC));
                                return true;
                            }
                            case "italic-bold-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold white");
                                return true;
                            case "italic-bold-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold blue");
                                return true;
                            case "italic-bold-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold dark blue");
                                return true;
                            case "italic-bold-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold green");
                                return true;
                            case "italic-bold-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold dark green");
                                return true;
                            case "italic-bold-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold aqua");
                                return true;
                            case "italic-bold-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold dark aqua");
                                return true;
                            case "italic-bold-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold pink");
                                return true;
                            case "italic-bold-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold purple");
                                return true;
                            case "italic-bold-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold black");
                                return true;
                            case "italic-bold-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold gold");
                                return true;
                            case "italic-bold-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold yellow");
                                return true;
                            case "italic-bold-gray":
                                itemMeta.setDisplayName("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold gray");
                                return true;
                            case "italic-bold-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold red");
                                return true;
                            case "italic-bold-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + "Your item is now italic bold dark red");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now italic-bold-rainbow", "" + ChatColor.ITALIC + ChatColor.BOLD));
                                return true;
                            }
                            case "underline-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + "Your item is now underline dark red");
                                return true;
                            case "underline-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + "Your item is now underline red");
                                return true;
                            case "underline-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + "Your item is now underline dark blue");
                                return true;
                            case "underline-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + "Your item is now underline blue");
                                return true;
                            case "underline-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + "Your item is now underline dark aqua");
                                return true;
                            case "underline-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Your item is now underline aqua");
                                return true;
                            case "underline-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + "Your item is now underline yellow");
                                return true;
                            case "underline-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + "Your item is now underline gold");
                                return true;
                            case "underline-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "Your item is now underline pink");
                                return true;
                            case "underline-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + "Your item is now underline purple");
                                return true;
                            case "underline-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + "Your item is now underline black");
                                return true;
                            case "underline-light-gray":
                                itemMeta.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + "Your item is now underline light gray");
                                return true;
                            case "underline-dark-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + "Your item is now underline dark gray");
                                return true;
                            case "underline-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + "Your item is now underline dark green");
                                return true;
                            case "underline-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "Your item is now underline green");
                                return true;
                            case "underline-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + "Your item is now underline white");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now underline-rainbow", "" + ChatColor.UNDERLINE));
                                return true;
                            }
                            case "underline-bold-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold dark red");
                                return true;
                            case "underline-bold-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold red");
                                return true;
                            case "underline-bold-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold dark blue");
                                return true;
                            case "underline-bold-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold blue");
                                return true;
                            case "underline-bold-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold dark aqua");
                                return true;
                            case "underline-bold-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold aqua");
                                return true;
                            case "underline-bold-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold yellow");
                                return true;
                            case "underline-bold-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold gold");
                                return true;
                            case "underline-bold-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold pink");
                                return true;
                            case "underline-bold-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold purple");
                                return true;
                            case "underline-bold-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold black");
                                return true;
                            case "underline-bold-light-gray":
                                itemMeta.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold light gray");
                                return true;
                            case "underline-bold-dark-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold dark gray");
                                return true;
                            case "underline-bold-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold dark green");
                                return true;
                            case "underline-bold-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold green");
                                return true;
                            case "underline-bold-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your item is now underline bold white");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);
                                Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(name, newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now underline-bold-rainbow", "" + ChatColor.UNDERLINE + ChatColor.BOLD));
                                return true;
                            }
                            case "strike-bold-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold dark red");
                                return true;
                            case "strike-bold-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold red");
                                return true;
                            case "strike-bold-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold dark blue");
                                return true;
                            case "strike-bold-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold blue");
                                return true;
                            case "strike-bold-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold dark aqua");
                                return true;
                            case "strike-bold-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold aqua");
                                return true;
                            case "strike-bold-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold yellow");
                                return true;
                            case "strike-bold-gold":
                                itemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold gold");
                                return true;
                            case "strike-bold-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold pink");
                                return true;
                            case "strike-bold-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold purple");
                                return true;
                            case "strike-bold-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold black");
                                return true;
                            case "strike-bold-light-gray":
                                itemMeta.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike light gray");
                                return true;
                            case "strike-bold-dark-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold dark gray");
                                return true;
                            case "strike-bold-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold dark green");
                                return true;
                            case "strike-bold-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold green");
                                return true;
                            case "strike-bold-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your item is now strike bold white");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);
                                Leee.nc.LeeesNC.getPlugin(LeeesNC.class).getConfig().set(name, newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now strike-bold-rainbow", "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD));
                                return true;
                            }
                            case "strike-dark-red":
                                itemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + "Your item is now strike bold dark red");
                                return true;
                            case "strike-red":
                                itemMeta.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + "Your item is now strike bold red");
                                return true;
                            case "strike-dark-blue":
                                itemMeta.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + "Your item is now strike bold dark blue");
                                return true;
                            case "strike-blue":
                                itemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + "Your item is now strike bold blue");
                                return true;
                            case "strike-dark-aqua":
                                itemMeta.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + "Your item is now strike bold dark aqua");
                                return true;
                            case "strike-aqua":
                                itemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + "Your item is now strike bold aqua");
                                return true;
                            case "strike-yellow":
                                itemMeta.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "Your item is now strike bold yellow");
                                return true;
                            case "strike-pink":
                                itemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + "Your item is now strike bold pink");
                                return true;
                            case "strike-purple":
                                itemMeta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + "Your item is now strike bold purple");
                                return true;
                            case "strike-black":
                                itemMeta.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + "Your item is now strike bold black");
                                return true;
                            case "strike-light-gray":
                                itemMeta.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + "Your item is now strike light gray");
                                return true;
                            case "strike-dark-gray":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "Your item is now strike bold dark gray");
                                return true;
                            case "strike-dark-green":
                                itemMeta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + "Your item is now strike bold dark green");
                                return true;
                            case "strike-green":
                                itemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + "Your item is now strike bold green");
                                return true;
                            case "strike-white":
                                itemMeta.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + name + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + "Your item is now strike bold white");
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

                                for (int i = 0; i < name.length(); i++) {
                                    char c = name.charAt(i);

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

                                String newitem = builder.toString();

                                itemMeta.setDisplayName(newitem + ChatColor.RESET);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + makeRainbow("Your item is now strike-rainbow", "" + ChatColor.STRIKETHROUGH));
                                return true;
                            }
                            case "reset":
                                itemMeta.setDisplayName(null);
                                item.setItemMeta(itemMeta);

                                player.sendMessage("" + ChatColor.RESET + "Your item has been reset");
                                return true;
                            default:
                                player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "Incorrect colour specification Type '/ic' for help");
                                return true;


                        }
                } else {
                        player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must hold a item to do that!");
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

                for (int i = 0; i < name.length(); i++) {
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

                String rainbow = builder.toString();

                player.spigot().sendMessage(new TextComponent(c("&9--------------------------------------------")));
                player.spigot().sendMessage(new TextComponent(c("&b(( LeeesNC ))")));
                player.spigot().sendMessage(new TextComponent(c("&e(( /ic <colour> <type-colour> ))")));
                player.spigot().sendMessage(new TextComponent(c("&e(( /ic reset to reset your name ))")));
                player.spigot().sendMessage(new TextComponent(c("&b(( Types ))")));
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&nunderline&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic underline-")).append(c("&n&lunderline-bold&r")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic underline-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&mstrike&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic strike-")).append(c("&m&lstrike-bold&r")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic strike-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &r&lbold&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic bold-")).append(c("&oitalic&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic italic-")).append(c("&n&litalic-bold")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic italic-bold-")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new TextComponent(c("&b(( Colours ))")));
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &cred&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic red")).append(c("&4dark-red ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic dark-red")).append(c("&agreen ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic green")).append(c("&2dark-green ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic dark-green")).append(rainbow).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic rainbow")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &9blue&r ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic blue")).append(c("&1dark-blue ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic dark-blue")).append(c("&6gold ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic gold")).append(c("&eyellow ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic yellow")).append(c("&0black")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic black")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new ComponentBuilder(c("&e(( &5purple&r " )).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic purple")).append(c("&dpink ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic pink")).append(c("&7gray ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic gray")).append(c("&baqua ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic aqua")).append(c("&3dark-aqua ")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic dark-aqua")).append(c("&fwhite")).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/ic white")).append(c("&r &e))")).create());
                player.spigot().sendMessage(new TextComponent(c("&9--------------------------------------------")));
                return true;
            }
        }

        return false;
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
