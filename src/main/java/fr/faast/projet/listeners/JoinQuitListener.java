package fr.faast.projet.listeners;

import fr.faast.projet.utils.NMSUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Location location = new Location(Bukkit.getWorld("world"), 57.5, 33, 359.5, 32, 360);
        player.teleport(location);

        player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, Integer.MAX_VALUE, 0, false, false));
        player.sendMessage("§d Salut mon reuf bisous de  _Faast et Veko et pense à");
        player.sendMessage("§d te follow à mon twitch: https://www.twitch.tv/faast_twitch");
        NMSUtils.sendTabTitle(player, "§b faastdev", "§b discord.gg/faast");
    }

}
