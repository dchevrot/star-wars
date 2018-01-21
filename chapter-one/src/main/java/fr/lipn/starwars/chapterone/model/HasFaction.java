package fr.lipn.starwars.chapterone.model;

public interface HasFaction {
	
	Faction getFaction();
	
	default boolean isEvil() {
		return getFaction().isEvil();
	}
	
	default boolean isGood() {
		return getFaction().isGood();
	}

}
