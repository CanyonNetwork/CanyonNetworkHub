package canyonnetwork.net.canyonnetworkhub;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        if (instance == null) instance = this;

        this.getServer().getPluginManager().registerEvents(new canyonnetwork.net.canyonnetworkhub.Events.JoinEvent(this), this);

        getLogger().info("CanyonNetwork-Hub plugin has enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("CanyonNetwork-Hub plugin has disabled.");
    }
}
