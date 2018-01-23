package fr.lipn.starwars.chapterone.graphism;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.model.BattleField;
import fr.lipn.starwars.chapterone.model.Position;
import fr.lipn.starwars.chapterone.model.SpaceShip;

public class SlickStarWarsEngine extends BasicGame {
	
	private static final float ANIMATION_SPEED = 7f;
	
	private static final String BACKGROUND_PATH = "assets/background/space.png";
	private static final String GAME_TITLE = "Star Wars : the game";

	private final BattleField battleField;

	private int playerX = 400, playerY = 400;

	private Image background;

	public SlickStarWarsEngine(BattleField battleField) {
		super(GAME_TITLE);
		this.battleField = battleField;
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background = new Image(BACKGROUND_PATH);
		battleField.init(container);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.drawImage(background, 0, 0);
		for(SpaceShip s: battleField) {
			s.getGraphic().getImage().draw(s.getPosition().getX(), s.getPosition().getY());
		}
		
		SpaceShip player = battleField.getPlayer();
		Position playerPosition = player.getPosition();
		player.getGraphic().getImage().draw(playerPosition.getX(), playerPosition.getY());;
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
		double animationSpeed = delta / ANIMATION_SPEED;
		for(SpaceShip s: battleField) {
			s.move(animationSpeed);
		}
		battleField.getPlayer().move(animationSpeed);
		
	}
	
	

}
