//  Program file: Pattern
//
//  Class description: Pattern is the interface implemented in abstract class ColoredTile and contains five distinct methods.

import java.awt.Color;

public interface Pattern {

	public void lighten(int increment); // Lightens overall color
	public void darken(int increment); // Darkens overall color
	
	public void setColor(Color color); // Sets color of the patterned tile
	public void setGradient(boolean gradient, int gradientStyle); // Sets gradiency
	
	public void createPattern(); // Dictates the drawing behavior

}