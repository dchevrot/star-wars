package fr.lipn.starwars.chapterone.model;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.graphism.resources.SpriteLoader;
import fr.lipn.starwars.chapterone.model.motion.DefaultBomberMotion;
import fr.lipn.starwars.chapterone.model.motion.DefaultFighterMotion;
import fr.lipn.starwars.chapterone.model.motion.PlayerMotion;

public class SpaceShipFactory {
	
	private final SpriteLoader spriteLoader = new SpriteLoader();
	
	public SpaceShip createPlayer(GameContainer gameContainer, Position position) throws SlickException {
		return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadPlayerSpaceShip(), new PlayerMotion(gameContainer, position));
	};
	
	public SpaceShip createXWing(Position position) throws SlickException {
		return new Fighter("X-Wing", Faction.REBEL, spriteLoader.loadXWingAnimation(), new DefaultFighterMotion(position));
	};
	
	public SpaceShip createYWing(Position position) throws SlickException {
		return new Bomber("Y-Wing", Faction.REBEL, spriteLoader.loadYWingAnimation(), new DefaultBomberMotion(position));
	};
	
	public SpaceShip createTIEFighter(Position position) throws SlickException {
		return new Fighter("TIE-Fighter", Faction.EMPIRE, spriteLoader.loadDefaultAnimation(), new DefaultFighterMotion(position));
	};
	
	public SpaceShip createTIEBomber(Position position) throws SlickException {
		return new Bomber("TIE-BOMBER", Faction.EMPIRE, spriteLoader.loadTIEBomberAnimation(), new DefaultBomberMotion(position));
	};
	
	public SpaceShip createBorvo(Position position) throws SlickException {
		return new Bomber("Borvo", Faction.HUTT, spriteLoader.loadBorvoAnimation(), new DefaultBomberMotion(position));
	};

}
