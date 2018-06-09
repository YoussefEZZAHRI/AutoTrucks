package com.automotiva.utils;

public enum Fuel {

	GASOLINE("ESSENCE"),
	DIESEL("DIESEL");
	
	private String shortName;
	private Fuel(String fuel){
		shortName = fuel;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public static Fuel fromShortName(String shortname) {
		switch (shortname) {
		case "G":
			return Fuel.GASOLINE;
		case "D":
			return Fuel.DIESEL;
		default:
			throw new IllegalArgumentException("ShortName [" + shortname
                    + "] not supported.");
		}
	}
	
}
