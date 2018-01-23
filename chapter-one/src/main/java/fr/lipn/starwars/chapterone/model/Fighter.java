package fr.lipn.starwars.chapterone.model;

import fr.lipn.starwars.chapterone.graphism.resources.Graphic;
import fr.lipn.starwars.chapterone.model.motion.MotionStrategy;

/**
 * Fighter class. ideal for fast attacks.
 */
public class Fighter extends AbstractSpaceShip {
	
	Fighter(String name, Faction faction, Graphic image, MotionStrategy motion) {
		super(name, faction, image, motion);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Hey I am a Fighter.";
	}

}
