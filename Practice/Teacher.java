// Exam 4 Question 3

/********************** Extra **********************/

public class Teacher extends ChatBot
{
  /** Returns true is the phrase contains word (case blind);
   *  otherwise returns false.
   */
  public static boolean contains(String phrase, String word)
  {
    int i = phrase.toLowerCase().indexOf(word.toLowerCase());
    
    if (i < 0)
      return false;
      
    if (i > 0 && Character.isLetterOrDigit(phrase.charAt(i-1)))
      return false;
      
    i += word.length();
    if (i < phrase.length() && Character.isLetterOrDigit(phrase.charAt(i)))
      return false;
      
    return true;      
  }
  
  public Teacher(String name)
  {
    super(name);
  }

  public String respondToGreeting(String greeting)
  {
    return "Hi.";
  } 
  
  public void talkAboutMath()
  {
    System.out.println("Do you like math?");
    String response = ChatBot.readInput(">>> ");
    
    if (contains(response, "yes"))
      System.out.println("Great! Math is my favorite subject, too.");
    else if (contains(response, "no") || contains(response, "don't") || contains(response, "nope"))
      System.out.println("Too bad! Math is my favorite subject.");
    else if (contains(response, "hate"))
      System.out.println("Why do you hate math? Math is beautiful!");
    else
      System.out.println("Well, never mind.");
  }
}
