package com.elikill58.totalban.connector.spigot;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.elikill58.totalban.TotalBan;

public class TotalBanSpigot extends JavaPlugin {

	@Override
	public void onEnable() {
		Plugin plugin = getServer().getPluginManager().getPlugin("Negativity");
		if(plugin == null)
			getLogger().severe("WTF bro ??? Don't remove depends.");
		else {
			if(plugin.getDescription().getVersion().startsWith("1.")) {
				Logger log = getLogger();
				log.severe("-----------------------");
				log.severe("");
				log.severe("This plugin require Negativity PREMIUM (v2). It costs 8€.");
				log.severe("Buy/Download it here: https://www.spigotmc.org/resources/86874/");
				log.severe("");
				log.severe("Why ?");
				log.severe("Negativity v2 use a complete new behavior. A common part, not dependending to the software is available.");
				log.severe("This plugin use this common part.");
				log.severe("");
				log.severe("-----------------------");
				setEnabled(false);
				return;
			}
		}
		TotalBan.start();
	}
}
