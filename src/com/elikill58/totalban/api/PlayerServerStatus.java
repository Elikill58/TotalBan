package com.elikill58.totalban.api;

public enum PlayerServerStatus {

	NEVER_LOGIN(false, false, false),
	ALREADY_LOGGED(false, false, false),
	BANNED(true, true, false),
	BANNED_IMPORT(true, true, true),
	WARNED(true, false, false),
	WARNED_IMPORT(true, false, true);
	
	private boolean sanctionned, banned, imported;
	
	private PlayerServerStatus(boolean sanctionned, boolean banned, boolean imported) {
		this.sanctionned = sanctionned;
		this.banned = banned;
		this.imported = imported;
	}
	
	public boolean isBanned() {
		return banned;
	}
	
	public boolean isImported() {
		return imported;
	}
	
	public boolean isSanctionned() {
		return sanctionned;
	}
}
