package fr.lipn.starwars.chapterone.model;

public class Bomber extends AbstractSpaceShip {

	public Bomber(String name, Faction faction) {
		super(name, faction);
	}

	@Override
	public String toString() {
		return super.toString() + " Hey I am a Bomber.";
	}

}
