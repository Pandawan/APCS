import apcslib.*;
import java.awt.Color;

public class ParallelLines {
  
  private int width, height;
  private double offset;
  private Color black;
  private DrawingTool pen;
  private SketchPad paper;
  private int count;
  
  
  public ParallelLines () {
    width = 700;
    height = 500;
    black = Color.BLACK;
    
    paper = new SketchPad(width, height);
    pen = new DrawingTool(paper);
    count = 1;
  }
    
    public void draw () {
      pen.setColor(black);
      offset = 12.5;

      double[] arr = new double[] {12.5, 25, 37.5, 25, 12.5, 25, 37.5, 12.5};
      for (int row = -4; row < 4; row++) {
        
        
        for (int col = 0; col < 7; col++) {

          // Go to side position
          pen.up();
          pen.move(-1 * (width / 2), -1 * ((row + 0.5) * 50));
          pen.down();
          
          // Go to end of column
          pen.move(325, -1 * ((row + 0.5) * 50));
          
          // Rect
          pen.up();
          pen.move((-1 * (width / 2) + (col * 100) + (arr[row + 4])), -1 * ((row) * 50));
          pen.down();
          pen.fillRect(50, 50);
        }
      }
    }
  
}