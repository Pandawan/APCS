//  Program file: FilledTile
//
//  Class description: FilledTile is a concrete class that extends abstract ColoredTile and implements createPattern();
//                     This class has the ability to draw a filled board using one color, random colors and a gradient effect.

import java.awt.Color;

public class FilledTile extends ColoredTile {

	
	// Constructor, calls its corresponding ColoredTile constructor
	public FilledTile(int tileSize, int numberOfColumns, int numberOfRows, int margin, String name){
		
		super(tileSize, numberOfColumns, numberOfRows, margin, name);
		
	}
	
	
	// Constructor, calls its corresponding ColoredTile constructor
	public FilledTile(int tileSize, int numberOfColumns, int numberOfRows, int margin, Color color, String name){
		
		super(tileSize, numberOfColumns, numberOfRows, margin, color, name);
		
	}
	
	
	// Implements createPattern; this makes FilledTile a concrete class
	// Draws each individual tile with white borders
	// If gradient is true, one of three styles will be chosen according to gradientStyle
	// Else if color is specified, the pattern will be drawn in that color
	// If gradient is false and no color is specified, each tile will be a random color
	public void createPattern() {
		
		for(int i=0; i<numberOfColumns; i++){
			
			for(int j=0; j<numberOfRows; j++){
				
				if(gradient==true){
					if(gradientStyle==1) canvas.setColor(new Color((i+15)*17/2, (j+15)*17/2, 255));
					else if(gradientStyle==2) canvas.setColor(new Color((i+15)*17/2, 255, (j+15)*17/2));
					else canvas.setColor(new Color(255, (i+15)*17/2, (j+15)*17/2));
				}
				else if (color!=null) canvas.setColor(color);
				else canvas.setColor( new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)) );
				
				canvas.fillRect(margin + i*tileSize, margin + j*tileSize, tileSize, tileSize);
				
				canvas.setColor(Color.white);
				canvas.drawRect(margin + i*tileSize, margin + j*tileSize, tileSize, tileSize);
				
				board.repaint();
				setTimer(9);
				
			}
			
		}
		
	}
	

}