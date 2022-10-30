package canyonnetwork.net.canyonnetworkhub.Events;

import canyonnetwork.net.canyonnetworkhub.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    private Main main;

    public JoinEvent(Main main) {
        this.main = main;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setResourcePack("");
    }
}
