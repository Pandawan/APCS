// Name: Miguel Tenant de La Tour
// 
// Program File: Vowels.java
// 
// Class Description: This gets poetry.txt, replaces all spaces by ~ and counts every vowel.

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Vowels {
  
  public static void main (String[] args) {
    // Check for file not found
    try {
      // Search and get the file
      Scanner fs = new Scanner(new File("poetry.txt"));
      
      // Content that will be sent for output
      String fileContent = "";
      // Number of characters as an array
      int[] charArray = new int[5];
    
      // Run through every line
      while (fs.hasNext()) {
        // Get every line and print them
        String line = fs.nextLine();
        System.out.println(line);
        
        // Run through each letter
        for (int i = 0; i < line.length(); i++) {
          char c = line.charAt(i);
          
          // If space replace by ~
          if (c == ' ') {
            c = '~';
          }
          // If vowel, add 1 to count
          else if (c == 'A' || c == 'a') {
            charArray[0]++;
          }
          else if (c == 'E' || c == 'e') {
            charArray[1]++;
          }
          else if (c == 'I' || c == 'i') {
            charArray[2]++;
          }
          else if (c == 'O' || c == 'o') {
            charArray[3]++;
          }
          else if (c == 'U' || c == 'u') {
            charArray[4]++;
          }
          
          // Add modified character to the content
          fileContent += c;
        }
        // Add a new line
        fileContent += "\r\n";
          
      }    
      
      // Add the count of vowels
      String numberLine = "";
      numberLine = "Number of vowels, A: " + charArray[0] + ", E: " + charArray[1] + ", I: " + charArray[2] + ", O: " + charArray[3] + ", U: " + charArray[4] + "\r\n";
      
      // Check for file not found
      try {
        // Output file
        FileWriter fw = new FileWriter(new File("dentisOut.txt"));
        fw.append(numberLine);
        fw.append(fileContent);
        fw.close();
      } catch (IOException e) {
        // Return error
        System.out.println("Error" + e);
      }

        
    } catch (IOException e){
      // Return error
      System.out.println("Error " + e);
    }
  }
}