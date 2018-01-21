package fr.lipn.starwars.chapterone.model;

/**
 * The Interface SpaceShip.
 */
public interface SpaceShip extends HasFaction {
	

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
