// 
// Name: Miguel Tenant de La Tour
//
// Program File: DrawHouse.java
//
// Class Description: This class draws a house in a new window.

import apcslib.*;
import java.awt.Color;

public class DrawHouse{
  
  private DrawingTool pencil;
    private SketchPad paper;

 // Ctor instantiates the paper and pencil
 public DrawHouse(){
  paper = new SketchPad(500, 500);
     pencil = new DrawingTool(paper);
 }

   // Actually draws the house
   public void draw(){
    
     // Go to the bot right starting point
     pencil.up();
     pencil.turnLeft(90);
     pencil.forward(200);
     pencil.turnLeft(90);
     pencil.forward(150);
     pencil.turnRight(90);
     pencil.down();
     
     // Draw rectangle
     pencil.turnLeft(180);
     pencil.forward(400); // Bot
     pencil.turnLeft(90);
     pencil.forward(200); // Right
     pencil.turnLeft(90);
     pencil.forward(400); // Top
     pencil.turnLeft(90);
     pencil.forward(200); // Left
     
     // Draw roof
     pencil.up();
     pencil.turnLeft(180);
     pencil.forward(200);
     pencil.down();
     pencil.move(0, 200);
     pencil.move(200,50);
     
     // Door
     pencil.up();
     pencil.move(-25,-150);
     pencil.down();
     pencil.setWidth(3);
     pencil.setColor(Color.blue);
     pencil.move(-25, -75);
     pencil.move(25, -75);
     pencil.move(25, -150);
     
     // Left Window
     pencil.up();
     pencil.move(-125, -25);
     pencil.down();
     pencil.drawCircle(35);
     
     // Right Window
     pencil.up();
     pencil.move(125, -25);
     pencil.down();
     pencil.drawCircle(35);
     
     // Sun
     pencil.up();
     pencil.move(200, 175);
     pencil.down();
     pencil.setColor(Color.yellow);
     pencil.setWidth(30);
     pencil.drawCircle(15);
     
     // Grass Ground
     pencil.up();
     pencil.move(-300, -200);
     pencil.down();
     pencil.setColor(Color.green);
     pencil.setWidth(100);
     pencil.move(300,-200);
     
   }
}

