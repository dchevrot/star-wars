package fr.lipn.starwars.chapterone.game.motion;

import org.newdawn.slick.GameContainer;

import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.motion.conditions.Condition;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

public class OutOfBattleFieldCondition implements Condition {
	
	private final GameContainer gameContainer;

	public OutOfBattleFieldCondition(GameContainer gameContainer) {
		this.gameContainer = gameContainer;
	}

	@Override
	public boolean canMoveX(SpaceShip s, Position initialPosition, Position newPosition) {
		return newPosition.getX() > 0;
	}
	
	@Override
	public boolean canMoveY(SpaceShip s, Position initialPosition, Position newPosition) {
		int newY = newPosition.getY();
		return (newY > 0) && (newY + s.getGraphic().getHeight() <= gameContainer.getHeight());
	}

}
