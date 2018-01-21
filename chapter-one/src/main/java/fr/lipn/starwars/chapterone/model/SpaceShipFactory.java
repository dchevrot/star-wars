package fr.lipn.starwars.chapterone.model;

import fr.lipn.starwars.chapterone.model.motion.DefaultBomberMotion;
import fr.lipn.starwars.chapterone.model.motion.DefaultFighterMotion;

public class SpaceShipFactory {
	
	public SpaceShip createXWing(Position position) {
		return new Fighter("X-Wing", Faction.REBEL, new DefaultFighterMotion(position));
	};
	
	public SpaceShip createYWing(Position position) {
		return new Bomber("Y-Wing", Faction.HUTT, new DefaultBomberMotion(position));
	};
	
	public SpaceShip createTIEFighter(Position position) {
		return new Fighter("TIE-Fighter", Faction.EMPIRE, new DefaultFighterMotion(position));
	};
	
	public SpaceShip createTIEBomber(Position position) {
		return new Bomber("TIE-BOMBER", Faction.EMPIRE, new DefaultBomberMotion(position));
	};
	
	public SpaceShip createBorvo(Position position) {
		return new Bomber("Borvo", Faction.HUTT, new DefaultBomberMotion(position));
	};

}
