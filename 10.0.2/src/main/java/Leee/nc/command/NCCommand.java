package leee.nc.command;

import leee.nc.Main;
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
                    if (args[0].equals("red")) {
                        player.setDisplayName(ChatColor.RED + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.RED + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.RED + "Your name is now red");
                        return true;
                    } else if (args[0].equals("dark-red")) {
                        player.setDisplayName(ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_RED + "Your name is now dark red");
                        return true;
                    } else if (args[0].equals("green")) {
                        player.setDisplayName(ChatColor.GREEN + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.GREEN + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.GREEN + "Your name is now green");
                        return true;
                    } else if (args[0].equals("dark-green")) {
                        player.setDisplayName(ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_GREEN + "Your name is now dark green");
                        return true;
                    } else if (args[0].equals("blue")) {
                        player.setDisplayName(ChatColor.BLUE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.BLUE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.BLUE + "Your name is now blue");
                        return true;
                    } else if (args[0].equals("dark-blue")) {
                        player.setDisplayName(ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_BLUE + "Your name is now dark blue");
                        return true;
                    } else if (args[0].equals("pink")) {
                        player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your name is now pink");
                        return true;
                    } else if (args[0].equals("white")) {
                        player.setDisplayName(ChatColor.WHITE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.WHITE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.WHITE + "Your name is now white");
                        return true;
                    } else if (args[0].equals("gray")) {
                        player.setDisplayName(ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_GRAY + "Your name is now gray");
                        return true;
                    } else if (args[0].equals("gold")) {
                        player.setDisplayName(ChatColor.GOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.GOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.GOLD + "Your name is now gold");
                        return true;
                    } else if (args[0].equals("purple")) {
                        player.setDisplayName(ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_PURPLE + "Your name is now purple");
                        return true;
                    } else if (args[0].equals("aqua")) {
                        player.setDisplayName(ChatColor.AQUA + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.AQUA + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.AQUA + "Your name is now aqua");
                        return true;
                    } else if (args[0].equals("yellow")) {
                        player.setDisplayName(ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.YELLOW + "Your name is now yellow");
                        return true;
                    } else if (args[0].equals("bold-white")) {
                        player.setDisplayName(ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.BOLD + "Your name is now bold white");
                        return true;
                    } else if (args[0].equals("dark-aqua")) {
                        player.setDisplayName(ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.DARK_AQUA + "Your name is now dark aqua");
                        return true;
                    } else if (args[0].equals("black")) {
                        player.setDisplayName(ChatColor.BLACK + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), ChatColor.BLACK + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage(ChatColor.BLACK + "Your name is now black");
                        return true;
                    } else if (args[0].equals("bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "Your name is now bold red");
                        return true;
                    } else if (args[0].equals("bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.BOLD + "Your name is now bold dark red");
                        return true;
                    } else if (args[0].equals("bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.BOLD + "Your name is now bold green");
                        return true;
                    } else if (args[0].equals("bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "Your name is now bold dark green");
                        return true;
                    } else if (args[0].equals("bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.BOLD + "Your name is now bold blue");
                        return true;
                    } else if (args[0].equals("bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.BOLD + "Your name is now  bold dark blue");
                        return true;
                    } else if (args[0].equals("bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Your name is now bold pink");
                        return true;
                    } else if (args[0].equals("bold-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.BOLD + "Your name is now bold gray");
                        return true;
                    } else if (args[0].equals("bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "Your name is now bold gold");
                        return true;
                    } else if (args[0].equals("bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Your name is now bold purple");
                        return true;
                    } else if (args[0].equals("bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.BOLD + "Your name is now bold aqua");
                        return true;
                    } else if (args[0].equals("bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "Your name is now bold yellow");
                        return true;
                    } else if (args[0].equals("bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Your name is now bold dark aqua");
                        return true;
                    } else if (args[0].equals("bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.BOLD + "Your name is now bold black");
                        return true;
                    } else if (args[0].equals("italic-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic black");
                        return true;
                    } else if (args[0].equals("italic-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + "Your name is now italic red");
                        return true;
                    } else if (args[0].equals("italic-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic dark red");
                        return true;
                    } else if (args[0].equals("italic-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + "Your name is now italic aqua");
                        return true;
                    } else if (args[0].equals("italic-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Your name is now italic dark aqua");
                        return true;
                    } else if (args[0].equals("italic-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + "Your name is now italic blue");
                        return true;
                    } else if (args[0].equals("italic-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + "Your name is now italic dark blue");
                        return true;
                    } else if (args[0].equals("italic-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + "Your name is now italic green");
                        return true;
                    } else if (args[0].equals("italic-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + "Your name is now italic dark green");
                        return true;
                    } else if (args[0].equals("italic-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + "Your name is now italic pink");
                        return true;
                    } else if (args[0].equals("italic-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + "Your name is now italic purple");
                        return true;
                    } else if (args[0].equals("italic-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + "Your name is now italic gray");
                        return true;
                    } else if (args[0].equals("italic-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + "Your name is now italic gold");
                        return true;
                    } else if (args[0].equals("italic-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + "Your name is now italic yellow");
                        return true;
                    } else if (args[0].equals("italic-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + "Your name is now italic white");
                        return true;
                    } else if (args[0].equals("italic-bold-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold white");
                        return true;
                    } else if (args[0].equals("italic-bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold blue");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark blue");
                        return true;
                    } else if (args[0].equals("italic-bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold green");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark green");
                        return true;
                    } else if (args[0].equals("italic-bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold aqua");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark aqua");
                        return true;
                    } else if (args[0].equals("italic-bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold pink");
                        return true;
                    } else if (args[0].equals("italic-bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold purple");
                        return true;
                    } else if (args[0].equals("italic-bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold black");
                        return true;
                    } else if (args[0].equals("italic-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gold");
                        return true;
                    } else if (args[0].equals("italic-bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold yellow");
                        return true;
                    } else if (args[0].equals("italic-bold-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gray");
                        return true;
                    } else if (args[0].equals("italic-bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold red");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark red");
                        return true;
                    } else if (args[0].equals("underline-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + "Your name is now underline dark red");
                        return true;
                    } else if (args[0].equals("underline-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + "Your name is now underline red");
                        return true;
                    } else if (args[0].equals("underline-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + "Your name is now underline dark blue");
                        return true;
                    } else if (args[0].equals("underline-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + "Your name is now underline blue");
                        return true;
                    } else if (args[0].equals("underline-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + "Your name is now underline dark aqua");
                        return true;
                    } else if (args[0].equals("underline-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Your name is now underline aqua");
                        return true;
                    } else if (args[0].equals("underline-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + "Your name is now underline yellow");
                        return true;
                    } else if (args[0].equals("underline-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + "Your name is now underline gold");
                        return true;
                    } else if (args[0].equals("underline-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "Your name is now underline pink");
                        return true;
                    } else if (args[0].equals("underline-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + "Your name is now underline purple");
                        return true;
                    } else if (args[0].equals("underline-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + "Your name is now underline black");
                        return true;
                    } else if (args[0].equals("underline-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + "Your name is now underline light gray");
                        return true;
                    } else if (args[0].equals("underline-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + "Your name is now underline dark gray");
                        return true;
                    } else if (args[0].equals("underline-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + "Your name is now underline dark green");
                        return true;
                    } else if (args[0].equals("underline-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "Your name is now underline green");
                        return true;
                    } else if (args[0].equals("underline-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + "Your name is now underline white");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark red");
                        return true;
                    } else if (args[0].equals("underline-bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold red");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark blue");
                        return true;
                    } else if (args[0].equals("underline-bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold blue");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark aqua");
                        return true;
                    } else if (args[0].equals("underline-bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold aqua");
                        return true;
                    } else if (args[0].equals("underline-bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold yellow");
                        return true;
                    } else if (args[0].equals("underline-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold gold");
                        return true;
                    } else if (args[0].equals("underline-bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold pink");
                        return true;
                    } else if (args[0].equals("underline-bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold purple");
                        return true;
                    } else if (args[0].equals("underline-bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold black");
                        return true;
                    } else if (args[0].equals("underline-bold-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold light gray");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark gray");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark green");
                        return true;
                    } else if (args[0].equals("underline-bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold green");
                        return true;
                    } else if (args[0].equals("underline-bold-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold white");
                        return true;
                    } else if (args[0].equals("underline-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + "Your name is now underline dark red");
                        return true;
                    } else if (args[0].equals("underline-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + "Your name is now underline red");
                        return true;
                    } else if (args[0].equals("underline-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + "Your name is now underline dark blue");
                        return true;
                    } else if (args[0].equals("underline-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + "Your name is now underline blue");
                        return true;
                    } else if (args[0].equals("underline-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + "Your name is now underline dark aqua");
                        return true;
                    } else if (args[0].equals("underline-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Your name is now underline aqua");
                        return true;
                    } else if (args[0].equals("underline-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + "Your name is now underline yellow");
                        return true;
                    } else if (args[0].equals("underline-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + "Your name is now underline gold");
                        return true;
                    } else if (args[0].equals("underline-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "Your name is now underline pink");
                        return true;
                    } else if (args[0].equals("underline-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + "Your name is now underline purple");
                        return true;
                    } else if (args[0].equals("underline-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + "Your name is now underline black");
                        return true;
                    } else if (args[0].equals("underline-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + "Your name is now underline light gray");
                        return true;
                    } else if (args[0].equals("underline-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + "Your name is now underline dark gray");
                        return true;
                    } else if (args[0].equals("underline-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + "Your name is now underline dark green");
                        return true;
                    } else if (args[0].equals("underline-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "Your name is now underline green");
                        return true;
                    } else if (args[0].equals("underline-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + "Your name is now underline white");
                        return true;
                    } else if (args[0].equals("strike-bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark red");
                        return true;
                    } else if (args[0].equals("strike-bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold red");
                        return true;
                    } else if (args[0].equals("strike-bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark blue");
                        return true;
                    } else if (args[0].equals("strike-bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold blue");
                        return true;
                    } else if (args[0].equals("strike-bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark aqua");
                        return true;
                    } else if (args[0].equals("strike-bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold aqua");
                        return true;
                    } else if (args[0].equals("strike-bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold yellow");
                        return true;
                    } else if (args[0].equals("strike-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold gold");
                        return true;
                    } else if (args[0].equals("strike-bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold pink");
                        return true;
                    } else if (args[0].equals("strike-bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold purple");
                        return true;
                    } else if (args[0].equals("strike-bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold black");
                        return true;
                    } else if (args[0].equals("strike-bold-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike light gray");
                        return true;
                    } else if (args[0].equals("strike-bold-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark gray");
                        return true;
                    } else if (args[0].equals("strike-bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold dark green");
                        return true;
                    } else if (args[0].equals("strike-bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold green");
                        return true;
                    } else if (args[0].equals("strike-bold-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "Your name is now strike bold white");
                        return true;
                    } else if (args[0].equals("strike-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark red");
                        return true;
                    } else if (args[0].equals("strike-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.STRIKETHROUGH + "Your name is now strike bold red");
                        return true;
                    } else if (args[0].equals("strike-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark blue");
                        return true;
                    } else if (args[0].equals("strike-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.STRIKETHROUGH + "Your name is now strike bold blue");
                        return true;
                    } else if (args[0].equals("strike-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark aqua");
                        return true;
                    } else if (args[0].equals("strike-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.STRIKETHROUGH + "Your name is now strike bold aqua");
                        return true;
                    } else if (args[0].equals("strike-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "Your name is now strike bold yellow");
                        return true;
                    } else if (args[0].equals("strike-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.STRIKETHROUGH + "Your name is now strike bold gold");
                        return true;
                    } else if (args[0].equals("strike-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.STRIKETHROUGH + "Your name is now strike bold pink");
                        return true;
                    } else if (args[0].equals("strike-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.STRIKETHROUGH + "Your name is now strike bold purple");
                        return true;
                    } else if (args[0].equals("strike-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.STRIKETHROUGH + "Your name is now strike bold black");
                        return true;
                    } else if (args[0].equals("strike-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.STRIKETHROUGH + "Your name is now strike light gray");
                        return true;
                    } else if (args[0].equals("strike-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark gray");
                        return true;
                    } else if (args[0].equals("strike-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.STRIKETHROUGH + "Your name is now strike bold dark green");
                        return true;
                    } else if (args[0].equals("strike-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + "Your name is now strike bold green");
                        return true;
                    } else if (args[0].equals("strike-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.STRIKETHROUGH + "Your name is now strike bold white");
                        return true;
                    } else if (args[0].equals("reset")) {
                        player.setDisplayName("" + ChatColor.RESET+ player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).getConfig().set(player.getName(), "" + ChatColor.RESET + player.getName() + ChatColor.RESET);
                        Main.getPlugin(Main.class).saveConfig();
                        player.sendMessage("" + ChatColor.RESET + "Your name has been reset");
                        return true;
                    } else {
                        player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "Incorrect colour specification Type '/nc' for help");
                        return true;
                    }
                } else {
                    player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must donate to the server to use this command. Type /donate to donate.");
                    return true;
                }
            } else {
                player.spigot().sendMessage(new TextComponent(ChatColor.BLUE + "--------------------------------------------"));
                player.spigot().sendMessage(new TextComponent(ChatColor.AQUA + "(( LeeesNC ))"));
                player.spigot().sendMessage(new TextComponent(ChatColor.YELLOW + "(( /nc <colour> <type-colour> ))"));
                player.spigot().sendMessage(new TextComponent(ChatColor.YELLOW + "(( /nc reset to reset your name ))"));
                player.spigot().sendMessage(new TextComponent(ChatColor.AQUA + "(( Types ))"));
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("underline").color(ChatColor.RESET).underlined(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc underline-")).append("   ").color(ChatColor.RESET).underlined(false).append("underline-bold").underlined(true).bold(true).color(ChatColor.BOLD).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc underline-bold-")).append(" ))").underlined(false).bold(false).color(ChatColor.RESET).color(ChatColor.YELLOW).create());
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("strike").color(ChatColor.RESET).strikethrough(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc strike-")).append("   ").strikethrough(false).color(ChatColor.RESET).append("strike-bold").strikethrough(true).bold(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc strike-bold-")).append(" ))").strikethrough(false).bold(false).color(ChatColor.RESET).color(ChatColor.YELLOW).create());
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("bold").color(ChatColor.RESET).bold(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc bold-")).append("   ").bold(false).color(ChatColor.RESET).append("italic").italic(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc italic-")).append("   ").italic(false).color(ChatColor.RESET).append("italic-bold").italic(true).bold(true).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc italic-bold-")).append(" ))").italic(false).bold(false).color(ChatColor.RESET).color(ChatColor.YELLOW).create());
                player.spigot().sendMessage(new TextComponent(ChatColor.AQUA+ "(( Colours ))"));
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("red ").color(ChatColor.RED).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc red")).append("dark-red ").color(ChatColor.DARK_RED).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-red")).append("green ").color(ChatColor.GREEN).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc green")).append("dark-green").color(ChatColor.DARK_GREEN).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-green")).append(" ))").color(ChatColor.YELLOW ).create());
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("blue ").color(ChatColor.BLUE).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc blue")).append("dark-blue ").color(ChatColor.DARK_BLUE).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-blue")).append("gold ").color(ChatColor.GOLD).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc gold")).append("yellow ").color(ChatColor.YELLOW).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc yellow")).append("black").color(ChatColor.BLACK).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc black")).append(" ))").color(ChatColor.YELLOW).create());
                player.spigot().sendMessage(new ComponentBuilder("(( ").color(ChatColor.YELLOW).append("purple ").color(ChatColor.DARK_PURPLE).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc purple")).append("pink ").color(ChatColor.LIGHT_PURPLE).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc pink")).append("gray ").color(ChatColor.GRAY).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc gray")).append("aqua ").color(ChatColor.AQUA).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc aqua")).append("dark-aqua ").color(ChatColor.DARK_AQUA).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc dark-aqua")).append("white").color(ChatColor.WHITE).event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/nc white")).append(" ))").color(ChatColor.YELLOW).create());
                player.spigot().sendMessage(new TextComponent(ChatColor.BLUE + "--------------------------------------------"));
                return true;
            }
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        final List<String> completions = new ArrayList<>();
        final List<String> colors = new ArrayList<>(Arrays.asList(
        "red", "dark-red", "green", "dark-green", "blue", "dark-blue", "pink", "white", "gray", "gold", "purple", "aqua", "yellow", "bold-white", "dark-aqua", "black", "bold-red", "bold-dark-red", "bold-green", "bold-dark-green",
        "bold-blue", "bold-dark-blue", "bold-pink", "bold-gray", "bold-gold", "bold-purple", "bold-aqua", "bold-yellow", "bold-dark-aqua", "bold-black", "italic-black", "italic-red", "italic-dark-red",
        "italic-aqua", "italic-dark-aqua", "italic-blue", "italic-dark-blue", "italic-green", "italic-dark-green", "italic-pink", "italic-purple", "italic-gray", "italic-gold", "italic-yellow", "italic-white",
        "italic-bold-white", "italic-bold-blue", "italic-bold-dark-blue", "italic-bold-green", "italic-bold-dark-green", "italic-bold-aqua", "italic-bold-dark-aqua", "italic-bold-pink", "italic-bold-purple",
        "italic-bold-black", "italic-bold-gold", "italic-bold-yellow", "italic-bold-gray", "italic-bold-red", "italic-bold-dark-red", "underline-dark-red", "underline-red", "underline-dark-blue", "underline-blue",
        "underline-dark-aqua", "underline-aqua", "underline-yellow", "underline-gold", "underline-pink", "underline-purple", "underline-black", "underline-light-gray", "underline-dark-gray", "underline-dark-green",
        "underline-green", "underline-white", "underline-bold-dark-red", "underline-bold-red", "underline-bold-dark-blue", "underline-bold-blue", "underline-bold-dark-aqua", "underline-bold-aqua", "underline-bold-yellow",
        "underline-bold-gold", "underline-bold-pink", "underline-bold-purple", "underline-bold-black", "underline-bold-light-gray", "underline-bold-dark-gray", "underline-bold-dark-green", "underline-bold-green",
        "underline-bold-white", "underline-dark-red", "underline-red", "underline-dark-blue", "underline-blue", "underline-dark-aqua", "underline-aqua", "underline-yellow", "underline-gold", "underline-pink",
        "underline-purple", "underline-black", "underline-light-gray", "underline-dark-gray", "underline-dark-green", "underline-green", "underline-white", "strike-bold-dark-red", "strike-bold-red",
        "strike-bold-dark-blue", "strike-bold-blue", "strike-bold-dark-aqua", "strike-bold-aqua", "strike-bold-yellow", "strike-bold-gold", "strike-bold-pink", "strike-bold-purple", "strike-bold-black",
        "strike-bold-light-gray", "strike-bold-dark-gray", "strike-bold-dark-green", "strike-bold-green", "strike-bold-white", "strike-dark-red", "strike-red", "strike-dark-blue", "strike-blue", "strike-dark-aqua",
        "strike-aqua", "strike-yellow", "strike-bold-gold", "strike-pink", "strike-purple", "strike-black", "strike-light-gray", "strike-dark-gray", "strike-dark-green", "strike-green", "strike-white", "reset"));

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
}
