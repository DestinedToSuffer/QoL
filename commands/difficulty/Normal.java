package co.vangar.qol.commands.difficulty;

import co.vangar.qol.QoL;
import co.vangar.qol.utils.utils;
import org.bukkit.Difficulty;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Normal implements CommandExecutor {

    private QoL plugin;

    public Normal(QoL plugin){
        this.plugin = plugin;
        plugin.getCommand("normal").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(utils.error("A player must send this message!"));
        } else {
            Player p = (Player) sender;
            if(p.hasPermission("normal.use")){
                utils.difficulty(p, Difficulty.NORMAL);
            } else utils.error("You do not have permission for this command!");
        } return false;
    }
}
