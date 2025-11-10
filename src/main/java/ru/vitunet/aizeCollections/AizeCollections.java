package ru.vitunet.aizeCollections;

import org.bukkit.plugin.java.JavaPlugin;
import ru.vitunet.aizeCollections.commands.collections;
import ru.vitunet.aizeCollections.listener.PlayerListener;

public final class AizeCollections extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Aize collections] Plugin enabled");

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        getCommand("collections").setExecutor(new collections());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Aize collections] Plugin disabled");
    }


}
