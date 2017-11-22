// 
// Name: Miguel
//
// Program File: PalindromeTester.java
//
// Class Description: This class interacts with the user

import java.util.Scanner;

public class PalindromeTester {
  
  public static void main (String[] args) {
    
    System.out.println("Welcome to the Palindrome Program! Enter the letter q when you are done.");
    
    boolean wantsToExit = false;
    
    while (!wantsToExit) {
      Scanner input = new Scanner(System.in); // Creates a new Scanner object 
      System.out.println("Enter a string:");
      String str = input.nextLine(); // Grabs ALL the characters until the user pushes enter. 
      
      // Check if it's the escape code 'q'
      if (str.equals("q")) {
        wantsToExit = true;
      }
      // If it's not, then we can test for palindrome
      else {
        boolean isPalindrome = Palindrome.CheckForPalindrome(str);
        if (isPalindrome){
          System.out.println("Yes, the string " + str + " is a palindrome.");
        }else {
          System.out.println("No, the string " + str + " is NOT a palindrome.");
        }
      }
      
    }
    
    System.out.println("Goodbye!");
  }
}