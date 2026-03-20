package one.sweptthr.scgoldenspear;

import org.bukkit.plugin.java.JavaPlugin;

public class SCGoldenSpear extends JavaPlugin {
	@Override
	public void onEnable() {
		// [the server prints a message by default]
		
		// add event handler
		this.getServer().getPluginManager().registerEvents( new SpearPokeListener(), this );
	}

	@Override
	public void onDisable() {
		// [the server prints a message by default]
	}
}
