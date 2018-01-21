package fr.lipn.starwars.chapterone.model;

/**
 * The Class Pilot. I am the proud fighter of freedom or not...
 */
public class Pilot implements HasFaction {
	
	/** The name. */
	private final String name;
	
	/** The faction. */
	private final Faction faction;
	
	/**
	 * Instantiates a new pilot.
	 *
	 * @param name the name
	 * @param faction the faction
	 */
	public Pilot(String name, Faction faction) {
		if(name == null || faction == null) {
			throw new IllegalArgumentException("Please !! I really need to be someone");
		}
		this.name = name;
		this.faction = faction;
	}
	
	/**
	 * Gets the name of the pilot
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the faction.
	 *
	 * @return the faction
	 */
	@Override
	public Faction getFaction() {
		return faction;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pilot [name=" + name + ", faction=" + faction + "]";
	}
	

}
