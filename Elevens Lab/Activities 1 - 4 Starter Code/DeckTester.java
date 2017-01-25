/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
  
  /**
   * The main method in this class checks the Deck operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    String[] ranks = {"A", "B", "C"};
    String[] suits = {"Giraffes", "Lions"};
    int[] values = {2, 1, 6};
    
    Deck deck = new Deck(ranks, suits, values);
    
    deck.deal();
    
    System.out.println(deck);
    
    deck.shuffle();
    
    System.out.println(deck);
  }
  
  public static void Act2Main () {
    
    String[] ranks = {"A", "B", "C"};
    String[] suits = {"Giraffes", "Lions"};
    int[] values = {2, 1, 6};
    
    Deck deck = new Deck(ranks, suits, values);
    
    // Size
    System.out.println("Size is: " + deck.size());
    
    // toString
    System.out.println("\n" + deck);
    
    // Deal one card
    System.out.println("\nDealing one card \n" + deck.deal());
    System.out.println("\n" + deck);
    
    while (!deck.isEmpty()){
      deck.deal();
    }
    
    // Empty Deck
    System.out.println("\nEmpty deal: " + deck.isEmpty() + ", size: " + deck.size());
    System.out.println(deck.deal());
    
    
    //toString
    System.out.println("\n\n\n" + deck);
  }
}
