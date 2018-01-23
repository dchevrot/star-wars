package fr.lipn.starwars.chapterone.model;

import fr.lipn.starwars.chapterone.graphism.resources.Graphic;
import fr.lipn.starwars.chapterone.model.motion.MotionStrategy;

/**
 * Heavy armed spaceship. I am slow but I do a lot of damage.
 */
public class Bomber extends AbstractSpaceShip {

	Bomber(String name, Faction faction, Graphic image, MotionStrategy motion) {
		super(name, faction, image, motion);
	}

	@Override
	public String toString() {
		return super.toString() + " Hey I am a Bomber.";
	}

}
