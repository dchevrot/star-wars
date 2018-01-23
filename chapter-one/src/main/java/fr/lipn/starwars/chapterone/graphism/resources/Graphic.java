package fr.lipn.starwars.chapterone.graphism.resources;

import org.newdawn.slick.Renderable;

public class Graphic {
	
	private final Renderable image;
	private final int width;
	private final int height;

	public Graphic(Renderable image, int width, int height) {
		this.image = image;
		this.width = width;
		this.height = height;
	}

	public Renderable getImage() {
		return image;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}
