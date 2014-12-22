package io.lansing.core.plugin;

import io.lansing.core.LansingPlugin;
import io.lansing.core.lang.Message;

public class LansingExample extends LansingPlugin {
	
	@Override
	public void onEnable() {
		CONSOLE.logMessage(Message.PRE_ENABLE);
		UTILITY.RegisterEvent(new CommandManager(this), this);
		CONSOLE.logMessage(Message.POST_ENABLE);
	}
	
	@Override
	public void onDisable() {
		CONSOLE.logMessage(Message.PRE_DISABLE);
		CONSOLE.logMessage(Message.POST_DISABLE);
	}
	
	@Override
	public void onLoad() {
		CONSOLE.logMessage(Message.PRE_LOAD);
		CONSOLE.logMessage(Message.POST_LOAD);
	}
	
}
