package fr.lipn.starwars.chapterone.model;

public enum Faction {

	REBEL("Rebel", true),
	REPUBLIC("Republic", true),
	HUTT("Hutt", false),
	TRADE_FEDERATION("Trace Federation", false),
	EMPIRE("Empire", false);

	Faction(String name, boolean isGood) {
		this.name = name;
		this.isGood = isGood;
	}
	
	private final String name;
	private final boolean isGood;
	
	public String getName() {
		return name;
	}

	public boolean isGood() {
		return isGood;
	}

	public boolean isEvil() {
		return !isGood();
	}

}
