import java.util.List;
import java.util.ArrayList;

/**
 * The ThirteensBoard class represents the board in a game of Thirteens.
 */
public class ThirteensBoard extends Board {
  
  /**
   * The size (number of cards) on the board.
   */
  private static final int BOARD_SIZE = 10;
  
  /**
   * The ranks of the cards for this game to be sent to the deck.
   */
  private static final String[] RANKS =
  {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
  
  /**
   * The suits of the cards for this game to be sent to the deck.
   */
  private static final String[] SUITS =
  {"spades", "hearts", "diamonds", "clubs"};
  
  /**
   * The values of the cards for this game to be sent to the deck.
   */
  private static final int[] POINT_VALUES =
  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  
  /**
   * Flag used to control debugging print statements.
   */
  private static final boolean I_AM_DEBUGGING = false;
  
  
  /**
   * Creates a new <code>ThirteensBoard</code> instance.
   */
  public ThirteensBoard() {
    super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
  }
  
  /**
   * Determines if the selected cards form a valid group for removal.
   * In Elevens, the legal groups are (1) a pair of non-face cards
   * whose values add to 13, and (2) a king is selected
   * @param selectedCards the list of the indices of the selected cards.
   * @return true if the selected cards form a valid group for removal;
   *         false otherwise.
   */
  @Override
  public boolean isLegal(List<Integer> selectedCards) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    if (selectedCards.size() == 1)
      return containsKing(selectedCards);
    else if (selectedCards.size() == 2)
      return (containsPairSum13(selectedCards));
    
    return false;
  }
  
  /**
   * Determine if there are any legal plays left on the board.
   * In Elevens, there is a legal play if the board contains
   * (1) a pair of non-face cards whose values add to 13, or (2) a king is found.
   * @return true if there is a legal play left on the board;
   *         false otherwise.
   */
  @Override
  public boolean anotherPlayIsPossible() {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    
    // King, Queen, Jack
    if (containsKing(cardIndexes()))
      return true;
    
    // Other cards
    return containsPairSum13(cardIndexes());
  }
  
  /**
   * Check for an 13-pair in the selected cards.
   * @param selectedCards selects a subset of this board.  It is list
   *                      of indexes into this board that are searched
   *                      to find an 13-pair.
   * @return true if the board entries in selectedCards
   *              contain an 13-pair; false otherwise.
   */
  private boolean containsPairSum13(List<Integer> selectedCards) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    for(int i = 0; i < BOARD_SIZE; i++){
      // Check if first card isn't null
      if (cardAt(i) != null){
        for(int j = 0; j < BOARD_SIZE; j++){
          // Check if second one isn't null
          if (cardAt(j) != null)
            // Check if equals 13
            if (cardAt(i).pointValue() + cardAt(j).pointValue() == 13)
            return true;
        }
      }
    }
    return false;
  }
  
  /**
   * Check if a king is available in the selected cards.
   * @param selectedCards selects a subset of this board.  It is list
   *                      of indexes into this board that are searched
   *                      to find a king.
   * @return true if a king is found
   */
  private boolean containsKing(List<Integer> selectedCards) {
    boolean foundKing = false;
    for(Integer i : selectedCards){
      if (i != null)
        foundKing = (cardAt(i).rank() == "king");
    }
    return foundKing;
  }
}
