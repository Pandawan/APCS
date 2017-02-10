//  Program file: TileTester
//
//  Class description: TileTester is the driver class for this inheritance project.
//                     It utilizes polymorphism when ChevronTile objects are declared as ColoredTile (abstract parent class).

import java.awt.Color;

public class TileTester {

	
	public static void main(String[] args){
		
		// Creates 6 FilledTile objects; all demonstrate a different aspect of FilledTile and are named correspondingly
		
		// Creates a filled pattern with random colors
		FilledTile filled1 = new FilledTile(16, 15, 15, 36, "FilledTile: Random Colors");
		filled1.createPattern();
		
		// Creates a filled pattern to demonstrate setColor() and lighten() from Color.blue
		FilledTile filled2 = new FilledTile(16, 15, 15, 36, "FilledTile: Blue");
		filled2.setColor(Color.blue);
		filled2.lighten(90);
		filled2.createPattern();
		
		// Creates a filled pattern to demonstrate setGradient()
		FilledTile filled3 = new FilledTile(16, 15, 15, 36, "FilledTile: Gradient 1");
		filled3.setGradient(true, 0);
		filled3.createPattern();
		
		// Creates another filled pattern to demonstrate setGradient()
		FilledTile filled4 = new FilledTile(16, 15, 15, 36, "FilledTile: Gradient 2");
		filled4.setGradient(true, 1);
		filled4.createPattern();
		
		// Creates another filled pattern to demonstrate setGradient()
		FilledTile filled5 = new FilledTile(16, 15, 15, 36, "FilledTile: Gradient 3");
		filled5.setGradient(true, 2);
		filled5.createPattern();
		
		
		// Creates 6 ChevronTile objects declared as ColoredTile objects
		// Demonstrates polymorphism since ChevronTile is a ColoredTile
		// Calls the child class's createPattern() method since the parent's is abstract
		
		// Creates a Chevron pattern with random colors
		ColoredTile chevron1 = new ChevronTile(16, 15, 15, 36, "ColoredTile: Random Colors");
		chevron1.createPattern();
		
		// Creates a Chevron pattern to demonstrate darken() from Color.blue
		ColoredTile chevron2 = new ChevronTile(16, 15, 15, 36, Color.blue, "ColoredTile: Blue");
		chevron2.darken(90);
		chevron2.createPattern();
		
		// Creates a Chevron pattern to demonstrate setGradient()
		ColoredTile chevron3 = new ChevronTile(16, 15, 15, 36, "ColoredTile: Gradient 1");
		chevron3.setGradient(true, 0);
		chevron3.createPattern();
		
		// Creates another Chevron pattern to demonstrate setGradient()
		ColoredTile chevron4 = new ChevronTile(16, 15, 15, 36, "ColoredTile: Gradient 2");
		chevron4.setGradient(true, 1);
		chevron4.createPattern();
		
		// Creates another Chevron pattern to demonstrate setGradient()
		ColoredTile chevron5 = new ChevronTile(16, 15, 15, 36, "ColoredTile: Gradient 3");
		chevron5.setGradient(true, 2);
		chevron5.createPattern();
		
	}
	

}