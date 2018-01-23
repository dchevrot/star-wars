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
	 * @param currentPosition
	 *            the current position
	 */
	public AbstractMotion(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lipn.starwars.chapterone.model.motion.MotionStrategy#getPosition()
	 */
	@Override
	public Position getPosition() {
		return currentPosition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lipn.starwars.chapterone.model.motion.MotionStrategy#move(fr.lipn.starwars
	 * .chapterone.model.SpaceShip) Update current position field with the newly
	 * computed position.
	 */
	@Override
	public Position move(SpaceShip s, double animationSpeed) {
		Position move = innerMove(s);
		
		//deal with animation refresh rate
		currentPosition = new Position((int) (currentPosition.getX() + move.getX() * animationSpeed),
				(int) (currentPosition.getY() + move.getY() * animationSpeed));
		return currentPosition;
	}

	/**
	 * Classes extending AbstractMotion should implement this method instead of
	 * method move.
	 * 
	 * @param s the spaceship
	 * @return the position representing the delta between initialPosition and the
	 *         new position
	 */
	protected abstract Position innerMove(SpaceShip s);

}
