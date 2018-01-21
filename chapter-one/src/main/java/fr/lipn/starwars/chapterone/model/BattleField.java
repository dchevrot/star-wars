package fr.lipn.starwars.chapterone.model;

public class BattleField {

	private static final int GAME_LOOP_CYCLE_MS = 25;

	private final SpaceShip[] spaceShips = createSpaceShips();
	private final SpaceShip player = new Fighter("X-WING", Faction.REBEL, new Position(0,0));


	private static SpaceShip[] createSpaceShips() {
		return new SpaceShip[] {
				new Bomber("Y-WING", Faction.REBEL, new Position(1,1)),
				new Fighter("X-WING", Faction.REBEL, new Position(2,2)),
				new Bomber("TIE BOMBER", Faction.EMPIRE, new Position(3,3)),
				new Fighter("BORVO", Faction.HUTT, new Position(4,4))
		};
	}

	public SpaceShip getPlayer() {
		return player;
	}

	public void totalWar() {
		try {
			while(true) {
				for(SpaceShip s : spaceShips) {
					s.move();
					System.out.println(s);
				}
				Thread.sleep(GAME_LOOP_CYCLE_MS);
			} 
		}
		catch (InterruptedException e) {
			System.out.println("Game interrupted now exit game");
			System.exit(0);
		}
	}

}
