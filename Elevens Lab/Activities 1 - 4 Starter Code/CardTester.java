/**
 * This is a class that tests the Card class.
 */
public class CardTester {
  
  /**
   * The main method in this class checks the Card operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    // Create three cards
    Card card1 = new Card("arank", "asuit", 1);
    Card card2 = new Card("brank", "bsuit", 5);
    Card card3 = new Card("arank", "asuit", 1);
    
    // Accessors 
    System.out.println("suit: " + card1.suit() + ", rank: " + card1.rank() + ", point value: " + card1.pointValue());
    
    //Equals/matches
    System.out.println("Should be false: " + card1.matches(card2));
    System.out.println("Should be true: " + card1.matches(card3));
    
    //toString
    System.out.println(card1.toString());
    System.out.println(card2);
  }
}
