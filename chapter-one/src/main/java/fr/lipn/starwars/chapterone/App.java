package fr.lipn.starwars.chapterone;

import fr.lipn.starwars.chapterone.exception.StarWarsException;
import fr.lipn.starwars.chapterone.game.GameLogic;

/**
 * Star-Wars entry point. This is the class from which our app will be launch.
 *
 */
public class App 
{
	public static void main( String[] args ) {
		// create a game and launch it
		GameLogic game = new GameLogic();

		try {
			game.start();
		}
		catch(StarWarsException e) {
			System.out.println("Something wrong happened : " + e);
		}
	}
}
