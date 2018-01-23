package fr.lipn.starwars.chapterone.model.motion;

import fr.lipn.starwars.chapterone.model.Position;
import fr.lipn.starwars.chapterone.model.SpaceShip;

/**
 * The Interface MotionStrategy. Implement one of this to make any {@link SpaceShip} moves
 * the way you want. (could be like jagger ... or not)
 */
public interface MotionStrategy {
	
	/**
	 * Gets the position used to initialize the motion algorithm.
	 * Calls to move will update this position
	 *
	 * @return the position which will be used next time move will be call
	 */
	Position getPosition();
	
	/**
	 * Compute a new position for the given ship. Create the motion algorithm of your dream here.
	 * Spaceship is passed if ever you would want to implements spaceship type dependent strategy
	 *
	 * @param s the spaceship to move
	 * @param animationSpeed the animation speed
	 * @return the new spaceship position
	 */
	Position move(SpaceShip s, double animationSpeed);

}
