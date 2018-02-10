package fr.lipn.starwars.chapterone.motion.conditions;

import org.newdawn.slick.GameContainer;

import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class OutOfBattleField implements Condition {
	
	private final GameContainer gameContainer;

	public OutOfBattleField(GameContainer gameContainer) {
		this.gameContainer = gameContainer;
	}

	@Override
	public boolean canMoveX(SpaceShip s, Position initialPosition, Position newPosition) {
		int newX = newPosition.getX();
		return (newX > 0) && (newX + s.getGraphic().getWidth() < gameContainer.getWidth());
	}
	
	@Override
	public boolean canMoveY(SpaceShip s, Position initialPosition, Position newPosition) {
		int newY = newPosition.getY();
		return (newY > 0) && (newY + s.getGraphic().getHeight() < gameContainer.getHeight());
	}

}
