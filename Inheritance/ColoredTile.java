//  Program file: ColoredTile
//
//  Class description: ColoredTile is an abstract class that has one unimplemented method. It implements Pattern.

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class ColoredTile implements Pattern {

	
	/** Global variables */
	
	// Finalized variables initialized in constructors that decide the GUI
	protected final int tileSize;
	protected final int numberOfColumns;
	protected final int numberOfRows;
	protected final int margin;
	
	// GUI components
	protected DrawingBoard board;
	protected Graphics2D canvas;
	
	// Color / color components to display
	protected Color color;
	
	// Only used if the pattern is gradient
	protected boolean gradient;
	protected int gradientStyle;
	
	
	// Constructor method
	// Initialized tileSize, numberOfColumns, numberOfRows, margin
	// This determines how the dimensions of the DrawingBoard
	// Creates a DrawingBoard object of specified dimensions and frame name "name"
	// Gets canvas that allows the user to draw
	public ColoredTile(int _tileSize, int _numberOfColumns, int _numberOfRows, int _margin, String name){
		
		tileSize = _tileSize;
		numberOfColumns = _numberOfColumns;
		numberOfRows = _numberOfRows;
		margin = _margin;
		
		board = new DrawingBoard(tileSize*numberOfColumns + 2*margin, tileSize*numberOfRows + 2*margin, name);
		canvas = board.getCanvas();
		
	}
	
	
	// Constructor method
	// Initialized tileSize, numberOfColumns, numberOfRows, margin
	// Sets the color of this pattern to "_color"
	// This determines how the dimensions of the DrawingBoard
	// Creates a DrawingBoard object of specified dimensions and frame name "name"
	// Gets canvas that allows the user to draw
	public ColoredTile(int _tileSize, int _numberOfColumns, int _numberOfRows, int _margin, Color _color, String name){
		
		tileSize = _tileSize;
		numberOfColumns = _numberOfColumns;
		numberOfRows = _numberOfRows;
		margin = _margin;
		
		color = _color;
		setColor(_color);
		
		board = new DrawingBoard(tileSize*numberOfColumns + 2*margin, tileSize*numberOfRows + 2*margin, name);
		canvas = board.getCanvas();
		
	}
	
	
	// Increases RGB values to lighten the color
	public void lighten(int increment) {
		
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		
		if((red + increment) > 255) red = 255;
		else red += increment;
		
		if((green + increment) > 255) green = 255;
		else green += increment;
		
		if((blue + increment) > 255) blue = 255;
		else blue += increment;
		
		color = new Color(red, green, blue);
		
	}
	
	
	// Decreases RGB values to darken the color
	public void darken(int decrement) {
		
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		
		if((red - decrement) < 0) red = 0;
		else red -= decrement;
		
		if((green - decrement) < 0) green = 0;
		else green -= decrement;
		
		if((blue - decrement) < 0) blue = 0;
		else blue -= decrement;
		
		color = new Color(red, green, blue);
		
	}
	
	
	// Given a specified color, sets "red", "green" and "blue" to the specified color
	// This allows lighten() and darken() to be used efficiently
	public void setColor(Color _color) {
		
		if(_color == null){
			color = null;
			return;
		}
		
		int red = _color.getRed();
		int green = _color.getGreen();
		int blue = _color.getBlue();
		color = new Color(red, green, blue);
		
	}

	
	// Image will draw in one of three gradient hues
	// _gradientStyle determines the hue
	   // 1 - pink/orange -> yellow
	   // 2 - blue -> purple -> pink
	   // 0 - green -> yellow
	public void setGradient(boolean _gradient, int _gradientStyle){
		gradient = _gradient;
		gradientStyle = _gradientStyle;
	}
	
	
	// Acts as a timer and stops thread for "milliseconds"
	public void setTimer(int milliseconds){
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException localInterruptedException) {}
	}
	
	
	// From the interface Pattern, abstract method that will be implemented by concrete classes
	// Dictates the drawing behavior of the ColoredTile object
	public abstract void createPattern();
	

}