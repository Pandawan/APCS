import java.util.Random;
import java.lang.Exception;

public class ArrayFun {
  
  public static void main (String[] args) {
    // Calling all the Rectangle Fun stuff
    RectangleFun();
    // Calling all the Integer Fun stuff
    IntegerFun();
    
    
  }
  
  public static void IntegerFun () {
    int[] intList = new int[10];
    Random r = new Random();
    
    for (int i = 0; i < 8; i++) {
      intList[i] = r.nextInt(15) - 10;
    }
  }
  
  public static void RectangleFun () {
    // Create Reactangle Array
    Rectangle[] rectList = new Rectangle[5];
    // Create a Random object 
    Random r = new Random();
    
    // Loop through every indexes
    for (int i = 0; i < rectList.length; i++){
      rectList[i] = new Rectangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
    }
    
    // Print the length of 3rd index value
    System.out.println(rectList[3].getLength());
    
    // Set the width of last index value to 5
    rectList[rectList.length - 1].setWidth(5);
    
    // Print the widght of last index value
    System.out.println(rectList[rectList.length - 1].getWidth());
      
    // ArrayOutOfBoundsException
    // Try to get a value outside of the array bounds and catch it
    try {
      System.out.println(rectList[rectList.length]);
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
    
    // NullPointerException
    // Try to get a value that doesn't exist
    try {
      String str = null;
      System.out.println(str.length());
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
  
}