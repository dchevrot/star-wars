package fr.lipn.starwars.chapterone.motion.conditions;

import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

/**
 * Implement a motion condition. 
 * @see {@link ConditionalMotion}
 */
public interface Condition {
	
	/**
	 * motion condition on x axis.
	 *
	 * @param s the spaceship
	 * @param initialPosition the initial position
	 * @param newPosition the new position
	 * @return true, if move can be applied on x axis
	 */
	boolean canMoveX(SpaceShip s, Position initialPosition, Position newPosition);
	
	/**
	 * motion condition on x axis.
	 *
	 * @param s the spaceship
	 * @param initialPosition the initial position
	 * @param newPosition the new position
	 * @return true, if move can be applied on x axis
	 */
	boolean canMoveY(SpaceShip s, Position initialPosition, Position newPosition);

}
