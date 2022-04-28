package co.vangar.qol.commands.gamemodes;

import co.vangar.qol.QoL;
import co.vangar.qol.utils.utils;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Creative implements CommandExecutor {

    private QoL plugin;

    public Creative(QoL plugin){
        this.plugin = plugin;
        plugin.getCommand("creative").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(utils.error("A player must send this message!"));
        } else {
            Player p = (Player) sender;
            if(args.length == 0){
                utils.changeMode(p, GameMode.CREATIVE);
            } else if(args.length == 1) {
                utils.changeOthersMode(p, args[0], GameMode.CREATIVE);
            } else utils.error("Invalid arguments!");
        } return false;
    }
}
