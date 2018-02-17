package fr.lipn.starwars.chapterone.exception;


/**
 * The Class StarWarsException is the basis exception for all exceptions thrown by the game star wars.
 * 
 */
public class StarWarsException extends RuntimeException {

	private static final long serialVersionUID = -3529423900295793664L;
	
    public StarWarsException(String message) {
        super(message);
    }
    
    public StarWarsException(String message, Throwable cause) {
        super(message, cause);
    }

}
