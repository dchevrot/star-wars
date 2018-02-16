package fr.lipn.starwars.chapterone.graphism.exception;

import org.newdawn.slick.SlickException;

public class GraphicEngineException extends SlickException {

	private static final long serialVersionUID = 7546242727846033639L;

	public GraphicEngineException(String message) {
		super(message);
	}

	public GraphicEngineException(String message, Throwable cause) {
		super(message, cause);
	}

}
