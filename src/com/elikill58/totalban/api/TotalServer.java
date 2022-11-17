package com.elikill58.totalban.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TotalServer {

	protected final UUID uuid;
	protected List<String> ips = new ArrayList<>();
	protected boolean verified = false;
	
	public TotalServer(UUID uuid) {
		this.uuid = uuid;
	}
	
	public UUID getUuid() {
		return uuid;
	}
	
	public List<String> getIps() {
		return ips;
	}
	
	public boolean isVerified() {
		return verified;
	}
}
