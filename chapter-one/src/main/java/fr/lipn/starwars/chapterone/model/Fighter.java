package fr.lipn.starwars.chapterone.model;

public class Fighter extends AbstractSpaceShip {

	public Fighter(String name, Faction faction) {
		super(name, faction);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Hey I am a Fighter.";
	}

}
