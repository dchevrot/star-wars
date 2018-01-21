package fr.lipn.starwars.chapterone.model;

import fr.lipn.starwars.chapterone.model.motion.MotionStrategy;

/**
 * Fighter class. ideal for fast attacks.
 */
public class Fighter extends AbstractSpaceShip {
	
	Fighter(String name, Faction faction, MotionStrategy motion) {
		super(name, faction, motion);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Hey I am a Fighter.";
	}

}
