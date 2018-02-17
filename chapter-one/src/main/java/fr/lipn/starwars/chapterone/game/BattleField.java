package fr.lipn.starwars.chapterone.game;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.newdawn.slick.GameContainer;

import fr.lipn.starwars.chapterone.game.motion.PlayerMotion;
import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;
import fr.lipn.starwars.chapterone.spaceships.SpaceShipFactory;

/**
 * The Class BattleField implements a game scenario. It creates spaceships at different positions in the screen
 */
public class BattleField implements Iterable<SpaceShip> {

	/** The Constant spaceShipFactory. */
	private static final SpaceShipFactory spaceShipFactory = new SpaceShipFactory();
	
	/** The container. */
	private final GameContainer container;

	/** The space ships. */
	private List<SpaceShip> spaceShips;

	/** The player. */
	private SpaceShip player;
	
	/**
	 * Instantiates a new battle field.
	 *
	 * @param container the container
	 */
	public BattleField(GameContainer container) {
		this.container = container;
	}

	/**
	 * Creates the space ships.
	 *
	 * @return the list
	 */
	private static List<SpaceShip> createSpaceShips() {
		try {
			return Arrays.asList(
					spaceShipFactory.createYWing(new Position(1,1)),
					spaceShipFactory.createXWing(new Position(100,10)),
					spaceShipFactory.createTIEBomber(new Position(200,20)),
					spaceShipFactory.createBorvo(new Position(300,20))
					);
		} catch (GraphicEngineException e) {
			throw new AssertionError("Impossible to create spaceships", e);
		}
	}

	/**
	 * Inits the battleground.
	 */
	public void init() {
		spaceShips = createSpaceShips();
		player = spaceShipFactory.createPlayer(new PlayerMotion(container, new Position(400,400)));
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<SpaceShip> iterator() {
		return spaceShips.iterator();
	}

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public SpaceShip getPlayer() {
		return player;
	}

}

