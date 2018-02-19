package fr.lipn.starwars.chapterone.graphism;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.game.GameLogic;
import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class SlickStarWarsEngine extends BasicGame {
	
    private static final float ANIMATION_SPEED = 5f;
    private static final int MIN_REFRESH_RATE = 30;
	
	private static final String BACKGROUND_PATH = "assets/background/space.png";
	private static final String GAME_TITLE = "Star Wars : the game";

	private final GameLogic gameLogic;

	private Image background;

    private int deltaCount;

	public SlickStarWarsEngine(GameLogic gameLogic) {
		super(GAME_TITLE);
		this.gameLogic = gameLogic;
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	@Override
	public void init(GameContainer container) {
		try {
			background = new Image(BACKGROUND_PATH);
		}
		catch(SlickException e) {
			throw new GraphicEngineException("Background creation error", e);
		}
		gameLogic.getBattleField().init();
	}

	@Override
	public void render(GameContainer container, Graphics g) {
		g.drawImage(background, 0, 0);
		for(SpaceShip s: gameLogic.getBattleField()) {
			s.getGraphic().getImage().draw(s.getPosition().getX(), s.getPosition().getY());
		}
		
		SpaceShip player = gameLogic.getBattleField().getPlayer();
		Position playerPosition = player.getPosition();
		player.getGraphic().getImage().draw(playerPosition.getX(), playerPosition.getY());;
	}

	@Override
	public void update(GameContainer container, int delta) {
		deltaCount += delta;
        if (deltaCount < MIN_REFRESH_RATE) {
            // do the job later
            return;
        }
        delta = deltaCount;
        deltaCount = 0;
        
        double animationSpeed = delta / ANIMATION_SPEED;
        gameLogic.gameLoop(animationSpeed);
	}

}
