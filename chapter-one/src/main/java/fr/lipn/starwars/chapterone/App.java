package fr.lipn.starwars.chapterone;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import fr.lipn.starwars.chapterone.graphism.SlickStarWarsEngine;
import fr.lipn.starwars.chapterone.model.BattleField;

/**
 * Star-Wars entry point. This is the class from which our app will be launch.
 *
 */
public class App 
{
    public static void main( String[] args ) throws SlickException
    {
//       BattleField field = new BattleField();
//       field.totalWar();
    	AppGameContainer c = new AppGameContainer(new SlickStarWarsEngine(new BattleField()));
    	c.start();
    }
}
