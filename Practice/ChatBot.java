// Exam 4 Question 3

import java.util.Scanner;

public abstract class ChatBot
{
  private static Scanner kboard = new Scanner(System.in);

  /** Displays the prompt string, captures and returns
   *  user input.
   *  @param prompt a string to be displayed as the user prompt
   *  @return a string that represents user input
   */
  public static String readInput(String prompt)
  {
    System.out.print(prompt + " ");
    return kboard.nextLine();
  }  

  /** The name of this bot */
  private String name;

  /** Constructs a bot with a given name */
  public ChatBot(String nm)
  {
    name = nm;
  }

  /** Returns the name of this bot */
  public String getName()
  {
    return name;
  }
  
  /** Returns a string that represents a response to
   *  a greeting
   */
  public abstract String respondToGreeting(String greeting); 
}
