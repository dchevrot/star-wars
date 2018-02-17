package fr.lipn.starwars.chapterone.spaceships;

import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.graphism.resources.SpriteLoader;
import fr.lipn.starwars.chapterone.motion.DefaultBomberMotion;
import fr.lipn.starwars.chapterone.motion.DefaultFighterMotion;
import fr.lipn.starwars.chapterone.motion.MotionStrategy;
import fr.lipn.starwars.chapterone.motion.Position;

public class SpaceShipFactory {

	private final SpriteLoader spriteLoader = new SpriteLoader();

	public SpaceShip createPlayer(MotionStrategy motion) throws GraphicEngineException {
		return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadPlayerSpaceShip(), motion);
	};

	public SpaceShip createXWing(Position position) throws GraphicEngineException {
		return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadXWingAnimation(), new DefaultFighterMotion(position));
	};

	public SpaceShip createYWing(Position position) throws GraphicEngineException {
		return new Bomber("Y-Wing", Faction.REBEL, spriteLoader.loadYWingAnimation(), new DefaultBomberMotion(position));
	};

	public SpaceShip createTIEFighter(Position position) throws GraphicEngineException {
		return new Fighter("TIE-Fighter", Faction.EMPIRE, spriteLoader.loadDefaultAnimation(), new DefaultFighterMotion(position));
	};

	public SpaceShip createTIEBomber(Position position) throws GraphicEngineException {
		return new Bomber("TIE-BOMBER", Faction.EMPIRE, spriteLoader.loadTIEBomberAnimation(), new DefaultBomberMotion(position));
	};

	public SpaceShip createBorvo(Position position) throws GraphicEngineException {
		return new Bomber("Borvo", Faction.HUTT, spriteLoader.loadBorvoAnimation(), new DefaultBomberMotion(position));
	};

}
