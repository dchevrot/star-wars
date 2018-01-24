package fr.lipn.starwars.chapterone.spaceships;

import fr.lipn.starwars.chapterone.graphism.resources.Graphic;
import fr.lipn.starwars.chapterone.motion.MotionStrategy;
import fr.lipn.starwars.chapterone.motion.Position;

/**
 * Basis implementation of spaceships.
 * Make use of {@link MotionStrategy} for dealing with position and ship motion.
 */
public abstract class AbstractSpaceShip implements SpaceShip {
	
	
	/** The name. */
	private final String name;
	
	/** The faction. */
	private final Faction faction;
	
	private final Graphic animation;
	
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
	AbstractSpaceShip(String name, Faction faction, Graphic animation, MotionStrategy motion) {
		this.name = name;
		this.faction = faction;
		this.animation = animation;
		this.motion = motion;
	}
	
	@Override
	public Faction getFaction() {
		return faction;
	}
	
	@Override
	public Graphic getGraphic() {
		return animation;
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
	public Position move(double animationSpeed) {
		return motion.move(this, animationSpeed);
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
