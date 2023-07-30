package fr.faast.projet;

// Classe principale

import fr.faast.projet.commands.DiscordCommand;
import fr.faast.projet.commands.DocCommand;
import fr.faast.projet.listeners.HubListener;
import fr.faast.projet.listeners.JoinQuitListener;
import fr.faast.projet.scoreboard.ScoreboardManager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    private static Main instance;
    private ScoreboardManager scoreboardManager;

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        instance = this;
        scoreboardManager = new ScoreboardManager();

        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("doc").setExecutor(new DocCommand());

        getServer().getPluginManager().registerEvents(new JoinQuitListener(), this);
        getServer().getPluginManager().registerEvents(new HubListener(), this);
    }


    @Override
    public void onDisable() {

    }

    public static Main getInstance() {
        return instance;
    }
}
