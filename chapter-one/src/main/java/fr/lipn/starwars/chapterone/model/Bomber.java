package fr.lipn.starwars.chapterone.model;

/**
 * Heavy armed spaceship. I am slow but I do a lot of damage.
 */
public class Bomber extends AbstractSpaceShip {

	/**
	 * Instantiates a new bomber.
	 *
	 * @param name the name
	 * @param faction the faction
	 */
	public Bomber(String name, Faction faction) {
		super(name, faction);
	}

	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.AbstractSpaceShip#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Hey I am a Bomber.";
	}

}
