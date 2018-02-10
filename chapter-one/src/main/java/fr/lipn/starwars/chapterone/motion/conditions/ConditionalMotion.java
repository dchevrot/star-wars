package fr.lipn.starwars.chapterone.motion.conditions;

import java.util.Collection;

import fr.lipn.starwars.chapterone.motion.AbstractMotion;
import fr.lipn.starwars.chapterone.motion.Position;
import fr.lipn.starwars.chapterone.spaceships.SpaceShip;

/**
 * The Class ConditionnalMotion allows to introduce {@link Condition}s to the motion.
 * Do not update current position if the given {@link Condition}s are not met.
 */
public abstract class ConditionalMotion extends AbstractMotion {
	
	private final Collection<Condition> conditions;

	public ConditionalMotion(Position currentPosition, Collection<Condition> conditions) {
		super(currentPosition);
		this.conditions = conditions;
	}

	@Override
	// apply conditions before moving
	protected Position updatePosition(SpaceShip s, Position move, double animationSpeed) {
		Position newPosition = super.updatePosition(s, move, animationSpeed);
		int newX = newPosition.getX(), newY = newPosition.getY();
		for(Condition c : conditions) {
			if(! c.canMoveX(s, getPosition(), newPosition)) {
				newX = getPosition().getX();
			}
			if(! c.canMoveY(s, getPosition(), newPosition)) {
				newY = getPosition().getY();
			}
		}
		return new Position(newX, newY);
	}
	
}
