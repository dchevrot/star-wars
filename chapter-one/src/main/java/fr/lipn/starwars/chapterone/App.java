package fr.lipn.starwars.chapterone;

import fr.lipn.starwars.chapterone.model.BattleField;

/**
 * Star-Wars entry point. This is the class from which our app will be launch.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BattleField field = new BattleField();
       field.totaWar();
    }
}
