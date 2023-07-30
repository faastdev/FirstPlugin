package fr.faast.projet.scoreboard;

import io.github.thatkawaiisam.assemble.AssembleAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class ScoreboardAdapter implements AssembleAdapter {
    @Override
    public String getTitle(Player player) {
        return "§bFaast lobby";
    }

    @Override
    public List<String> getLines(Player player) {
        return Arrays.asList(
                "§b",
                "Joueurs: §c" + Bukkit.getOnlinePlayers().size(),
                "§n",
                "Dev: §b@FaastDev");
    }
}
