package ru.vitunet.aizeCollections.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class collections implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = ((Player) sender).getPlayer();
            // у игрока должен быть пермишшен
            if (!player.hasPermission("aizecollections.open")) {
                player.sendMessage(ChatColor.DARK_RED +"Недостаточно прав");
                return true;
            }


            // тут будет открытие меню коллекций


        } else { // команда только для игрока, а не консоли. Но мб потом сделать отдельную команду для консоли чтобы открывать конкретному игроку
            sender.sendMessage("[Aize Collections] Command cant be executed by console");
        }


        return true;
    }

}
