package fr.lipn.starwars.chapterone.motion;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import fr.lipn.starwars.chapterone.graphism.resources.Graphic;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class PlayerMotion extends AbstractMotion {

	private final GameContainer gameContainer;
	private int moveX, moveY;

	public PlayerMotion(GameContainer container, Position currentPosition) {
		super(currentPosition);
		this.gameContainer = container;
	}

	@Override
	protected Position innerMove(SpaceShip s) {
		moveX = 0;
		moveY = 0;
		// check the controls, left/right adjust the rotation of the tank, up/down 
		// move backwards and forwards
		if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
			tryMove(s.getGraphic(), gameContainer, -2, 0);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
			tryMove(s.getGraphic(), gameContainer, 2, 0);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
			tryMove(s.getGraphic(), gameContainer, 0, -2);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
			tryMove(s.getGraphic(), gameContainer, 0, 2);
		}
		return new Position(moveX, moveY);
	}

	private void tryMove(Graphic p, GameContainer c, int moveX, int moveY) {
		this.moveX += moveX;
		this.moveY += moveY;
	}

}
