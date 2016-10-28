// Program File: ArrayFun.java
// 
// Class Description: This will modify and try out different Array features with Rectangle Objects and Ints


import java.util.Random;
import java.lang.Exception;

public class ArrayFun {
  
  public static void main (String[] args) {
    
    // Calling all the Rectangle Fun stuff
    RectangleFun();
    // Calling all the Integer Fun stuff
    IntegerFun();
  }
  
  // Does all the Intger Array stuff
  public static void IntegerFun () {
    // Make Int List
    int[] intList = new int[10];
    Random r = new Random();
    
    // Assign random number to each value from 0-8 index
    for (int i = 0; i < 8; i++) {
      intList[i] = r.nextInt(25) - 10;
      System.out.print(intList[i] + " ");
    }
    
    System.out.println();
    
    int sum = 0;
    int lowestValue = Integer.MAX_VALUE;
    
    // Loop through in order to get the sum and lowest value
    for (int i : intList) {
      
      sum += i;
      if (i < lowestValue) {
        lowestValue = i;
      }
    }
    
    // Print information
    System.out.println("The sum is " + sum);
    System.out.println("The lowest value is " + lowestValue);
    
  }
  
  // Does all the Rectangle Array stuff
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