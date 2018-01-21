package fr.lipn.starwars.chapterone.model;

public abstract class AbstractSpaceShip implements SpaceShip {
	
	private final String name;
	private final Faction faction;
	private Position position;
	private Pilot pilot;
	
	public AbstractSpaceShip(String name, Faction faction, Position position) {
		this.name = name;
		this.faction = faction;
		this.position = position;
	}
	
	@Override
	public Faction getFaction() {
		return faction;
	}
	
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
	
	public Position getPosition() {
		return position;
	}
	
	protected void setPosition(Position newPos) {
		this.position = newPos;
	}

	@Override
	public void exit() {
		this.pilot = null;
	}
	
	@Override
	public String toString() {
		return "I am " + name + ". I belong to " + faction.getName() + " faction. " + (pilot != null? pilot.toString() : "No pilot. " + position);
	}
}
