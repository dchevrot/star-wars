package fr.lipn.starwars.chapterone.motion;

import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class DefaultFighterMotion extends AbstractMotion {

	private static final int X_DEVIATION = 20;
	private final Position initialPosition;
	private boolean goRight = true;

	public DefaultFighterMotion(Position initialPosition) {
		super(initialPosition);
		this.initialPosition = initialPosition;
	}



	/**
	 * Move from initial x position to the right, then get back to initial x position.
	 * Move forward only
	 */
	@Override
	public Position innerMove(SpaceShip s) {
		Position initialPos = s.getPosition();
		int newX = 0;
		if(goRight) {
			if(initialPos.getX() <= initialPosition.getX() + X_DEVIATION) {
				newX = 1;
			} 
			else {
				goRight = !goRight;
			}
		}
		else {
			if(initialPos.getX() >= initialPosition.getX() - X_DEVIATION) {
				newX = -1;
			} 
			else {
				goRight = !goRight;
			}
		}
		return new Position(newX, 1);
	}

}
