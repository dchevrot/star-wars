package fr.lipn.starwars.chapterone.model;

public class Pilot {
	
	private final String name;
	private final Faction faction;
	
	public Pilot(String name, Faction faction) {
		if(name == null || faction == null) {
			throw new IllegalArgumentException("Please !! I really need to be someone");
		}
		this.name = name;
		this.faction = faction;
	}
	
	public String getName() {
		return name;
	}
	
	public Faction getFaction() {
		return faction;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pilot)) {
			return false;
		}
		Pilot other = (Pilot) obj;
		return name.equals(other.name) && faction == other.faction;
	}

	@Override
	public String toString() {
		return "Pilot [name=" + name + ", faction=" + faction + "]";
	}
	

}
