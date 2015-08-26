package com.multi.enterprise.iamnext.types.location;

import java.util.List;

import com.multi.enterprise.iamnext.types.games.GameInfo;


public class Location {

	private String name;
	private float longitude;
	private float latitude;
	private Address address;
	private List<GameInfo> gamesInfo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the gamesInfo
	 */
	public List<GameInfo> getGamesInfo() {
		return gamesInfo;
	}

	/**
	 * @param gamesInfo the gamesInfo to set
	 */
	public void setGamesInfo(List<GameInfo> gamesInfo) {
		this.gamesInfo = gamesInfo;
	}

	
}
