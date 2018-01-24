package fr.lipn.starwars.chapterone.spaceships;

import fr.lipn.starwars.chapterone.graphism.resources.Graphic;
import fr.lipn.starwars.chapterone.motion.Position;

/**
 * The Interface SpaceShip.
 */
public interface SpaceShip extends HasFaction {
	
	/**
	 * Gets the current position of the spaceship
	 *
	 * @return the position
	 */
	Position getPosition();
	
	/**
	 * Move the spaceship from its initial position to a new one.
	 *
	 * @param animationSpeed the animation speed
	 * @return the new position
	 */
	Position move(double animationSpeed);	
	
	
	/**
	 * Gets animation used by {@link StarWarsEngine} to render the spaceship.
	 *
	 * @return the graphic animation
	 */
	Graphic getGraphic();

	/**
	 * Allow a pilot to enter the spaceship.
	 * To enter a spaceship this one must be empty.
	 *
	 * @param p the pilot that wants to enter the spaceship
	 */
	void enter(Pilot p);
	
	/**
	 * Empty the spaceship of his pilot if it is occupied
	 */
	void exit();
}
