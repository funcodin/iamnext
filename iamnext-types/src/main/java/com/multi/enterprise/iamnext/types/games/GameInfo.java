package com.multi.enterprise.iamnext.types.games;

import com.multi.enterprise.iamnext.types.AbstractBaseEntity;

public class GameInfo extends AbstractBaseEntity{

	private GameType gameType;
	//this could be unique name to identify game table 
	private String name;
	private int locationId;
	/**
	 * @return the gameType
	 */
	public GameType getGameType() {
		return gameType;
	}
	/**
	 * @param gameType the gameType to set
	 */
	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}
	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	
	
	
}
