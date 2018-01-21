package fr.lipn.starwars.chapterone.model.motion;

import fr.lipn.starwars.chapterone.model.Position;
import fr.lipn.starwars.chapterone.model.SpaceShip;

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
		Position initialPos = getPosition();
		return new Position(initialPos.getX(), initialPos.getY() + 1);
	}

}
