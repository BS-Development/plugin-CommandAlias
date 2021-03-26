package dev.BSDevelopment.CommandAlias;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().info("Command Alias Enabled");
    }

    @Override
    public void onEnable() {
        getLogger().info("Command Alias Enabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("Console can not run this command");
            return true;
        }
        Player player = (Player) sender;
        if(label.equalsIgnoreCase("warpzone") || label.equalsIgnoreCase("wz")) {
                player.sendMessage("Sending you to warp");
                player.chat("/warp warp");
            return true;

        }
        else if(label.equalsIgnoreCase("fw") || label.equalsIgnoreCase("flatworld")){
            player.chat("/warp flatworld");
            return true;


        }
        else if(label.equalsIgnoreCase("crates")){
            player.chat("/warp crates");
            return true;


        }


        return false;
    }
}
