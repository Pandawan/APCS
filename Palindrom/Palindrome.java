// 
// Name: Miguel
//
// Program File: Palindrome.java
//
// Class Description: This class does all the string manipulation

public class Palindrome {
  
  // Checks if the string is a palindrome
  public static boolean CheckForPalindrome (String input) {
    String str = input.toLowerCase();
    String oldStr = "";
    String reverseStr = "";

     // If we have only one character, exit, that's cheating!
     if (str.length() == 1) {
        return false;
     }

    // Go in reverse order from end of string to begining of string
    for (int i = str.length() - 1; i >= 0; i--){
      char ch = str.charAt(i); // Get the character at the position
      
      // If we are only using a-z, A-Z, 0-9 then continue
      if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
        // Add that character to the begining of the string in order
        // to form the original one with only wanted characters
        oldStr = ch + oldStr;
        // Add that character to the reverse string
        reverseStr += ch;
      }
    }
    // If the str is equal of the it's reverse, then it's a palindrome
    if (oldStr.equals(reverseStr)){
      return true;
    }else {
      return false;
    }
  }
  
  
}