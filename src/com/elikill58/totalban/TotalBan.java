package com.elikill58.totalban;

import com.elikill58.negativity.api.events.EventManager;
import com.elikill58.totalban.listeners.ConnectionListeners;

public class TotalBan {

	public static void start() {
		EventManager.registerEvent(new ConnectionListeners());
	}
}
