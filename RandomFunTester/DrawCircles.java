// 
// Name: Miguel
//
// Program File: DrawCircle.java
//
// Class Description: This class draws a circle in a new window.

import apcslib.*;
import java.awt.Color;

public class DrawCircles {
  
    private DrawingTool pen;
    private SketchPad canvas;
    private int myRadius;

    public DrawCircles(int r) {
     
     canvas = new SketchPad(300, 300);
     pen = new DrawingTool(canvas);
     myRadius = r;
     
     draw();
     
    }
    
    public void draw () {
      pen.setColor(Color.red);
      pen.drawCircle(myRadius);
      
      pen.up();
      pen.move(-75, -75);
      pen.down();
      pen.setColor(Color.blue);
      pen.drawCircle(myRadius);
      
      pen.up();
      pen.move(100, 50);
      pen.down();
      pen.setColor(Color.green);
      pen.drawCircle(myRadius);
    }
    
    
}