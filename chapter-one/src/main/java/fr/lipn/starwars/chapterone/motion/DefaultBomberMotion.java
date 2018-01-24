package fr.lipn.starwars.chapterone.motion;

import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class DefaultBomberMotion extends AbstractMotion {
	
	public DefaultBomberMotion(Position initialPosition) {
		super(initialPosition);
	}
	
	/**
	 * Move from initial x position to the right, then get back to initial x position.
	 * Move forward only
	 */
	@Override
	public Position innerMove(SpaceShip s) {
		return new Position(0, 1);
	}

}
