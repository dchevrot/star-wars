package fr.lipn.starwars.chapterone.spaceships;

public interface HasFaction {
	
	Faction getFaction();
	
	default boolean isEvil() {
		return getFaction().isEvil();
	}
	
	default boolean isGood() {
		return getFaction().isGood();
	}

}
