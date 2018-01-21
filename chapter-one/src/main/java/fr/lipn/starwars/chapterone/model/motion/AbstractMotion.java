package fr.lipn.starwars.chapterone.model.motion;

import fr.lipn.starwars.chapterone.model.Position;
import fr.lipn.starwars.chapterone.model.SpaceShip;

/**
 * The Class AbstractMotion.
 */
public abstract class AbstractMotion implements MotionStrategy {
	
	/** The current position. */
	private Position currentPosition;
	
	/**
	 * Instantiates a new abstract motion.
	 *
	 * @param currentPosition the current position
	 */
	public AbstractMotion(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.motion.MotionStrategy#getPosition()
	 */
	@Override
	public Position getPosition() {
		return currentPosition;
	}

	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.motion.MotionStrategy#move(fr.lipn.starwars.chapterone.model.SpaceShip)
	 * Update current position field with the newly computed position.
	 */
	@Override
	public Position move(SpaceShip s) {
		Position newPos = innerMove(s);
		currentPosition = newPos;
		return newPos;
	}
	
	/**
	 * Classes extending AbstractMotion should implement this method instead of method move.
	 * @param s the spaceship
	 * @return the newly computer position
	 */
	protected abstract Position innerMove(SpaceShip s);

}
