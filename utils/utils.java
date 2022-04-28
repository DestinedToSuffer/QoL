package co.vangar.qol.utils;

import org.bukkit.*;
import org.bukkit.entity.Player;

public class utils {

    public static String chat(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }
    public static String prefix(){
        return ChatColor.DARK_PURPLE + "[QoL] " + ChatColor.LIGHT_PURPLE;
    }
    public static String error(String errorMsg){
        return ChatColor.DARK_RED + "[QoL] " + errorMsg;
    }

    public static void changeMode(Player p, GameMode gm){
        String gamemode = gm.name().toLowerCase();
        if(p.hasPermission(gamemode + ".use")){
            p.setGameMode(gm);
            p.sendMessage(prefix() + "You are in " + gamemode + " mode!");
        } else error("You do not have permission for this command!");
    }

    public static void changeOthersMode(Player p, String player, GameMode gm){
        String gamemode = gm.name().toLowerCase();
        if(p.hasPermission(gamemode + ".give")){
            if(Bukkit.getPlayer(player) != null){
                Player p2 = Bukkit.getPlayer(player);
                p2.setGameMode(gm);
                p2.sendMessage(prefix() + "Your gamemode has been change to " + gamemode);
                p.sendMessage(prefix() + "You have changed " + p2.getName() + "'s gamemode to " + gamemode);
            } else error("Cannot find this player");
        } else error("You do not have permission for this command!");
    }

    public static void difficulty(Player p, Difficulty diff){
        p.getWorld().setDifficulty(diff);
        p.sendMessage(prefix() + "You have successfully set the difficulty to " + diff.name().toLowerCase());
    }
}
