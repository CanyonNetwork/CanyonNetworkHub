package canyonnetwork.net.canyonnetworkhub.Events;

import canyonnetwork.net.canyonnetworkhub.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JoinEvent implements Listener {

    private Main main;

    public JoinEvent(Main main) {
        this.main = main;
    }

    // resourcePackStatus map
    Map<UUID, Boolean> resourcePackStatus = new HashMap<>();

    // Join event
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setResourcePack("");
    }
}
