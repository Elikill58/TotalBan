package com.elikill58.totalban.api;

import java.util.UUID;

public class TotalSanction {

	private final int id;
	private final UUID playerUUID, serverUUID;
	private PlayerServerStatus status;
	private String reason;
	
	public TotalSanction(int id, UUID playerUUID, UUID serverUUID) {
		this.id = id;
		this.playerUUID = playerUUID;
		this.serverUUID = serverUUID;
	}
	
	public int getId() {
		return id;
	}
	
	public UUID getPlayerUUID() {
		return playerUUID;
	}
	
	public UUID getServerUUID() {
		return serverUUID;
	}
	
	public String getReason() {
		return reason;
	}
	
	public PlayerServerStatus getStatus() {
		return status;
	}
}
