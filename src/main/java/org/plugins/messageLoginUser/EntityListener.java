package org.plugins.messageLoginUser;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class EntityListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onUserLoginServer(PlayerLoginEvent event){
        event.getPlayer().sendMessage("Bem-vindo ao servidor");
    }
}
