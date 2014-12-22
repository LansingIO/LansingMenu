package io.lansing.core.plugin;

import io.lansing.core.LansingPlugin;
import io.lansing.core.command.CommandExecutedEvent;
import io.lansing.core.event.LansingListener;
import io.lansing.core.menu.Menu;
import io.lansing.core.menu.MenuOption;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;

public class CommandManager extends LansingListener {
	
	public LansingPlugin pl;
	public CommandManager(LansingPlugin pl) {
		this.pl = pl; 
	}
	
	@EventHandler
	public void onCommandExecuted(CommandExecutedEvent e) {
		if (e.getCommand().equalsIgnoreCase("menu")) {
			Menu menu = pl.MENU.createMenu("hi", 9);
			MenuOption opt = new MenuOption(Material.ANVIL);
			opt.setTitle("Some Title!");
			opt.addSubtext("Subtext1");
			opt.addSubtext("Subtext2");
			opt.setAmount(3);
			menu.setOption(0, opt.toItemStack());
			menu.open(e.getPlayer());
			e.handle();
		}
	}
	
}
