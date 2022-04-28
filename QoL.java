package co.vangar.qol;

import co.vangar.qol.commands.difficulty.Easy;
import co.vangar.qol.commands.difficulty.Hard;
import co.vangar.qol.commands.difficulty.Normal;
import co.vangar.qol.commands.difficulty.Peaceful;
import co.vangar.qol.commands.gamemodes.Adventure;
import co.vangar.qol.commands.gamemodes.Creative;
import co.vangar.qol.commands.gamemodes.Spectator;
import co.vangar.qol.commands.gamemodes.Survival;
import org.bukkit.plugin.java.JavaPlugin;

public final class QoL extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new Survival(this);
        new Adventure(this);
        new Spectator(this);
        new Creative(this);

        new Peaceful(this);
        new Easy(this);
        new Normal(this);
        new Hard(this);
    }
}
