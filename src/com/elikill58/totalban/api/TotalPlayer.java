package com.elikill58.totalban.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TotalPlayer {

	private final UUID uuid;
	private List<TotalSanction> sanctions = new ArrayList<>();
	
	public TotalPlayer(UUID uuid) {
		this.uuid = uuid;
	}
	
	public UUID getUuid() {
		return uuid;
	}
	
	public List<TotalSanction> getSanctions() {
		return sanctions;
	}
}
