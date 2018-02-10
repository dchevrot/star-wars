package fr.lipn.starwars.chapterone.motion;

import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

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
		currentPosition = updatePosition(s, move, animationSpeed);
		return currentPosition;
	}

	/**
	 * Compute the move the given spaceship should make
	 * Classes extending AbstractMotion should implement this method instead of
	 * method move.
	 * 
	 * @param s the spaceship
	 * @return the position representing the delta between initialPosition and the
	 *         new position
	 */
	protected abstract Position innerMove(SpaceShip s);

	/**
	 * Update current position with the given move.
	 *
	 * @param s the spaceship
	 * @param move the move to apply
	 * @param animationSpeed the animation speed
	 * @return the new position
	 */
	protected Position updatePosition(SpaceShip s, Position move, double animationSpeed) {
		//deal with animation refresh rate
		return new Position((int) (currentPosition.getX() + move.getX() * animationSpeed),
				(int) (currentPosition.getY() + move.getY() * animationSpeed));
	}

}
