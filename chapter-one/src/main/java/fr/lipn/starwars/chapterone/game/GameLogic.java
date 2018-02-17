package fr.lipn.starwars.chapterone.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.exception.StarWarsException;
import fr.lipn.starwars.chapterone.graphism.SlickStarWarsEngine;
import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class GameLogic {
	
	private AppGameContainer container;
	private BattleField battleField;
	private SlickStarWarsEngine graphicEngine;

	public BattleField getBattleField() {
		return battleField;
	}
	
	public void start() throws StarWarsException {
		try {
			graphicEngine = new SlickStarWarsEngine(this);
			container = new AppGameContainer(graphicEngine);
			this.battleField = new BattleField(container);
			container.start();
		} catch (SlickException e) {
			throw new GraphicEngineException("Error starting game", e);
		}
	}
	
	public void gameLoop(double animationSpeed) throws StarWarsException {
		assert animationSpeed <= 0 : "It is not gonna get anywhere"; 
		if(graphicEngine == null) {
			throw new IllegalStateException("Game must be started before");
		}
		for(SpaceShip s: battleField) {
			s.move(animationSpeed);
		}
		SpaceShip player = battleField.getPlayer();
		player.move(animationSpeed);
        if(player.getPosition().getX() + player.getGraphic().getWidth() >= container.getWidth()) {
        	container.setPaused(true);
        	container.setTitle("You WIN");
        	return;
        }
        for(SpaceShip s: battleField) {
            if (battleField.getPlayer().collideWith(s)) {
            	container.setPaused(true);
            	container.setTitle("You LOSE");
            	return;
            }
        }
	}

}
