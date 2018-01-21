package fr.lipn.starwars.chapterone.model;

/**
 * Fighter class. ideal for fast attacks.
 */
public class Fighter extends AbstractSpaceShip {
	
	private static final int X_DEVIATION = 2;
	private final Position initialPosition;

	public Fighter(String name, Faction faction, Position position) {
		super(name, faction, position);
		initialPosition = position;
	}
	
	/**
	 * Move from initial x position to the right, then get back to initial x position.
	 * Move forward only
	 */
	@Override
	public Position move() {
		Position initialPos = getPosition();
		int newX = initialPos.getX(), newY = initialPos.getY() + 1;
		if(initialPos.getX() <= initialPosition.getX()) {
			newX +=X_DEVIATION;
		}
		else {
			newX = initialPosition.getX();
		}
		Position newPos = new Position(newX, newY);
		setPosition(newPos);
		return newPos;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Hey I am a Fighter.";
	}

}
