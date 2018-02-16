package fr.lipn.starwars.chapterone.motion;

import java.util.Collections;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import fr.lipn.starwars.chapterone.motion.conditions.ConditionalMotion;
import fr.lipn.starwars.chapterone.motion.conditions.OutOfBattleField;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class PlayerMotion extends ConditionalMotion {

	private final GameContainer gameContainer;
	private int moveX, moveY;

	public PlayerMotion(GameContainer container, Position currentPosition) {
		super(currentPosition, Collections.singletonList(new OutOfBattleField(container)));
		this.gameContainer = container;
	}

	@Override
	protected Position innerMove(SpaceShip s) {
		moveX = 0;
		moveY = 0;
		// check the controls, left/right adjust the rotation of the tank, up/down 
		// move backwards and forwards
		if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
			move(-2, 0);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
			move(2, 0);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
			move(0, -2);
		}
		if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
			move(0, 2);
		}
		return new Position(moveX, moveY);
	}

	private void move(int moveX, int moveY) {
		this.moveX += moveX;
		this.moveY += moveY;
	}

}
