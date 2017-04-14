// Exam 4 Question 3

import java.util.List;
import java.util.ArrayList;

public class Classroom
{
  /********************** Part (c) **********************/
  
  /** Prompts the user with the prompt "Enter greeting:",
   *  and displays the appropriate response for each student
   *  in the list.
   *  @param students a list of ChatBots
   */
  public static void greetAll(List<ChatBot> bots)
  {
	
  }

  /********************** Test **********************/
  
  public static void main(String[] args)
  {
    ArrayList<ChatBot> bots = new ArrayList<ChatBot>();
    bots.add(new StudentBot("Ada"));
    bots.add(new TeachersPet("Boris"));
    bots.add(new StudentBot("Claire"));
    
    greetAll(bots);
    System.out.println();
    
    Teacher teacher = new Teacher("Ms. Doolittle");
    String greeting = "Good afternoon, my name is " + teacher.getName() + ".";
    System.out.println(greeting);
    for (ChatBot bot : bots)
      System.out.println(">>> " + bot.respondToGreeting(greeting));

    System.out.println();
    for (int k = 1; k <= 3; k++)
      teacher.talkAboutMath();
  }  
}
