package org.plugins.messageLoginUser;

import org.bukkit.plugin.java.JavaPlugin;

public final class MessageLoginUser extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
