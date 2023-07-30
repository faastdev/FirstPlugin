package fr.faast.projet.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DocCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§4Vous n'êtes pas un joueur.");
            return false;
        }

        Player player = (Player) sender;
        long length = args.length;

        if (args.length == 0) {
            player.sendMessage("§4Voici le doc du op party https://panou.gitbook.io/op-party/ bon jeu " + player.getName());
            return true;
        }
        return true;
    }
}

