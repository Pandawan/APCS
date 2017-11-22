// 
// Name: Miguel
//
// Program File: RandomFunTester.java
//
// Class Description: This is the main class, it calls the other 'DrawSomething' classes based on a random number.


import java.util.Random;

public class RandomFunTester {

    public static void main(String[] args) {
     
     Random r = new Random();
     int rdm = r.nextInt(3) + 1;
     
     switch (rdm) {
      case 1:
       DrawHouse dh = new DrawHouse();
       dh.draw();
       break;
      case 2:
       DrawSquare ds = new DrawSquare();
       ds.draw();
       break;
      case 3:
       int rdm2 = r.nextInt(31) + 20;
       DrawCircles dc = new DrawCircles(rdm2);
       break;
      default:
       System.out.print("An error has occured, random number isn't between 1 and 3!");
     }
    }
    
    
}