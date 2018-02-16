package fr.lipn.starwars.chapterone.spaceships;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.graphism.resources.SpriteLoader;
import fr.lipn.starwars.chapterone.motion.DefaultBomberMotion;
import fr.lipn.starwars.chapterone.motion.DefaultFighterMotion;
import fr.lipn.starwars.chapterone.motion.PlayerMotion;
import fr.lipn.starwars.chapterone.motion.Position;

public class SpaceShipFactory {

	private final SpriteLoader spriteLoader = new SpriteLoader();

	public SpaceShip createPlayer(GameContainer gameContainer, Position position) throws GraphicEngineException {
		try {
			return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadPlayerSpaceShip(), new PlayerMotion(gameContainer, position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

	public SpaceShip createXWing(Position position) throws GraphicEngineException {
		try {
			return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadXWingAnimation(), new DefaultFighterMotion(position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

	public SpaceShip createYWing(Position position) throws GraphicEngineException {
		try {
			return new Bomber("Y-Wing", Faction.REBEL, spriteLoader.loadYWingAnimation(), new DefaultBomberMotion(position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

	public SpaceShip createTIEFighter(Position position) throws GraphicEngineException {
		try {
			return new Fighter("TIE-Fighter", Faction.EMPIRE, spriteLoader.loadDefaultAnimation(), new DefaultFighterMotion(position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

	public SpaceShip createTIEBomber(Position position) throws GraphicEngineException {
		try {
			return new Bomber("TIE-BOMBER", Faction.EMPIRE, spriteLoader.loadTIEBomberAnimation(), new DefaultBomberMotion(position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

	public SpaceShip createBorvo(Position position) throws GraphicEngineException {
		try {
			return new Bomber("Borvo", Faction.HUTT, spriteLoader.loadBorvoAnimation(), new DefaultBomberMotion(position));
		} catch (SlickException e) {
			throw new GraphicEngineException("can not load image", e);
		}
	};

}
