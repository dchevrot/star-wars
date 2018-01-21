package fr.lipn.starwars.chapterone.model;

/**
 * Heavy armed spaceship. I am slow but I do a lot of damage.
 */
public class Bomber extends AbstractSpaceShip {

	public Bomber(String name, Faction faction, Position position) {
		super(name, faction, position);
	}

	@Override
	public Position move() {
		Position initialPos = getPosition();
		Position newPos = new Position(initialPos.getX(), initialPos.getY() + 1);
		setPosition(newPos);
		return newPos;
	}

	@Override
	public String toString() {
		return super.toString() + " Hey I am a Bomber.";
	}




}
