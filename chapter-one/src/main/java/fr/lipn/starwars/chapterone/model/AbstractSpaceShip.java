package fr.lipn.starwars.chapterone.model;

import fr.lipn.starwars.chapterone.model.motion.MotionStrategy;

/**
 * Basis implementation of spaceships.
 * Make use of {@link MotionStrategy} for dealing with position and ship motion.
 */
public abstract class AbstractSpaceShip implements SpaceShip {
	
	/** The name. */
	private final String name;
	
	/** The faction. */
	private final Faction faction;
	
	/** The motion. */
	private MotionStrategy motion;
	
	/** The pilot. */
	private Pilot pilot;
	
	/**
	 * Instantiates a new abstract space ship.
	 *
	 * @param name the name
	 * @param faction the faction
	 * @param motion the motion
	 */
	AbstractSpaceShip(String name, Faction faction, MotionStrategy motion) {
		this.name = name;
		this.faction = faction;
		this.motion = motion;
	}
	
	@Override
	public Faction getFaction() {
		return faction;
	}
	
	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.SpaceShip#enter(fr.lipn.starwars.chapterone.model.Pilot)
	 */
	@Override
	public void enter(Pilot p) {
		if(pilot == null) {
			this.pilot = p;
			return;
		}
		if(pilot.equals(p)) {
			throw new IllegalArgumentException("Are you crazy. You are already aboard");
		}
		if(this.pilot != null) {
			throw new IllegalStateException("I have already a pilot");
		}
	}
	
	@Override
	public Position getPosition() {
		return motion.getPosition();
	}
	
	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.SpaceShip#move()
	 */
	@Override
	public Position move() {
		return motion.move(this);
	}
	

	/* (non-Javadoc)
	 * @see fr.lipn.starwars.chapterone.model.SpaceShip#exit()
	 */
	@Override
	public void exit() {
		this.pilot = null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "I am " + name + ". I belong to " + faction.getName() + " faction. " + (pilot != null? pilot.toString() : "No pilot. " + motion.getPosition());
	}
}
