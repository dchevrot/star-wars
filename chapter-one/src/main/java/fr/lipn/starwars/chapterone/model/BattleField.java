package fr.lipn.starwars.chapterone.model;

public class BattleField {
	
	private final SpaceShip[] spaceShips = createSpaceShips();
	
	private static SpaceShip[] createSpaceShips() {
		return new SpaceShip[] {
			new Bomber("Y-WING", Faction.REBEL),
			new Fighter("X-WING", Faction.REBEL),
			new Bomber("TIE BOMBER", Faction.EMPIRE),
			new Fighter("BORVO", Faction.HUTT)
		};
	}

	public void totalWar() {
		for(SpaceShip s : spaceShips) {
			System.out.println(s);
		}
	}
}
