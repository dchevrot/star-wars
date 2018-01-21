package fr.lipn.starwars.chapterone.model.motion;

import fr.lipn.starwars.chapterone.model.Position;
import fr.lipn.starwars.chapterone.model.SpaceShip;

public class DefaultFighterMotion extends AbstractMotion {
	
	private static final int X_DEVIATION = 2;
	private final Position initialPosition;
	
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
		int newX = initialPos.getX(), newY = initialPos.getY() + 1;
		if(initialPos.getX() <= initialPosition.getX()) {
			newX +=X_DEVIATION;
		}
		else {
			newX = initialPosition.getX();
		}
		return new Position(newX, newY);
	}

}
